--PPT.SQL_SUBQUERY

--p.01
SELECT ROWNUM "순번", custid, name, phone FROM customer WHERE ROWNUM <=2;

--p.03
SELECT SUM(saleprice) FROM orders WHERE custid = (SELECT custid FROM customer WHERE name = '박지성');

--p.05
SELECT custid,(SELECT name FROM customer cs WHERE cs.custid=od.custid), SUM(saleprice) FROM orders od GROUP BY custid;

--p.06
SELECT (SELECT name FROM customer cs WHERE cs.custid=od.custid) "name", SUM(saleprice) "total" FROM orders od GROUP BY od.custid;

--p.08
--UPDATE orders SET bookname = (SELECT book.bookname FROM book WHERE book.bookid = orders.bookid);

--p.09
SELECT cs.name, SUM(od.saleprice) "total" FROM (SELECT custid, name FROM Customer WHERE custid <= 2) cs, Orders od WHERE cs.custid=od.custid GROUP BY cs.name;

--p.12
SELECT orderid, saleprice FROM Orders WHERE saleprice <= (SELECT AVG(saleprice) FROM Orders);
SELECT orderid, custid, saleprice FROM Orders od WHERE saleprice > (SELECT AVG(saleprice) FROM Orders so WHERE od.custid=so.custid);

--p.13
SELECT SUM(saleprice) "total" FROM Orders WHERE custid IN (SELECT custid FROM Customer WHERE address LIKE '%대한민국%');

--p.14
SELECT orderid, saleprice FROM orders WHERE saleprice > ALL (SELECT saleprice FROM Orders WHERE custid='3');

--p.15
SELECT SUM(saleprice) "total" FROM orders od WHERE EXISTS (SELECT * FROM customer cs WHERE address LIKE '%대한민국%' AND cs.custid=od.custid);

