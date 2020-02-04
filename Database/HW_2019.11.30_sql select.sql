--sql select
CREATE TABLE Book (
  bookid      NUMBER(2) PRIMARY KEY,
  bookname    VARCHAR2(40),
  publisher   VARCHAR2(40),
  price       NUMBER(8) 
);

CREATE TABLE  Customer (
  custid      NUMBER(2) PRIMARY KEY,  
  name        VARCHAR2(40),
  address     VARCHAR2(50),
  phone       VARCHAR2(20)
);

CREATE TABLE Orders (
  orderid NUMBER(2) PRIMARY KEY,
  custid  NUMBER(2) REFERENCES Customer(custid),
  bookid  NUMBER(2) REFERENCES Book(bookid),
  saleprice NUMBER(8) ,
  orderdate DATE
);

INSERT INTO Book VALUES(1, '축구의 역사', '굿스포츠', 7000);
INSERT INTO Book VALUES(2, '축구아는 여자', '나무수', 13000);
INSERT INTO Book VALUES(3, '축구의 이해', '대한미디어', 22000);
INSERT INTO Book VALUES(4, '골프 바이블', '대한미디어', 35000);
INSERT INTO Book VALUES(5, '피겨 교본', '굿스포츠', 8000);
INSERT INTO Book VALUES(6, '역도 단계별기술', '굿스포츠', 6000);
INSERT INTO Book VALUES(7, '야구의 추억', '이상미디어', 20000);
INSERT INTO Book VALUES(8, '야구를 부탁해', '이상미디어', 13000);
INSERT INTO Book VALUES(9, '올림픽 이야기', '삼성당', 7500);
INSERT INTO Book VALUES(10, 'Olympic Champions', 'Pearson', 13000);

INSERT INTO Customer VALUES (1, '박지성', '영국 맨체스타', '000-5000-0001');
INSERT INTO Customer VALUES (2, '김연아', '대한민국 서울', '000-6000-0001');  
INSERT INTO Customer VALUES (3, '장미란', '대한민국 강원도', '000-7000-0001');
INSERT INTO Customer VALUES (4, '추신수', '미국 클리블랜드', '000-8000-0001');
INSERT INTO Customer VALUES (5, '박세리', '대한민국 대전',  NULL);

INSERT INTO Orders VALUES (1, 1, 1, 6000, TO_DATE('2014-07-01','yyyy-mm-dd')); 
INSERT INTO Orders VALUES (2, 1, 3, 21000, TO_DATE('2014-07-03','yyyy-mm-dd'));
INSERT INTO Orders VALUES (3, 2, 5, 8000, TO_DATE('2014-07-03','yyyy-mm-dd')); 
INSERT INTO Orders VALUES (4, 3, 6, 6000, TO_DATE('2014-07-04','yyyy-mm-dd')); 
INSERT INTO Orders VALUES (5, 4, 7, 20000, TO_DATE('2014-07-05','yyyy-mm-dd'));
INSERT INTO Orders VALUES (6, 1, 2, 12000, TO_DATE('2014-07-07','yyyy-mm-dd'));
INSERT INTO Orders VALUES (7, 4, 8, 13000, TO_DATE( '2014-07-07','yyyy-mm-dd'));
INSERT INTO Orders VALUES (8, 3, 10, 12000, TO_DATE('2014-07-08','yyyy-mm-dd')); 
INSERT INTO Orders VALUES (9, 2, 10, 7000, TO_DATE('2014-07-09','yyyy-mm-dd')); 
INSERT INTO Orders VALUES (10, 3, 8, 13000, TO_DATE('2014-07-10','yyyy-mm-dd'));

COMMIT;

--1. 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.
SELECT * FROM book;
SELECT * FROM customer;
SELECT * FROM orders;
--(1) 도서번호가1인도서의이름
SELECT bookname FROM book WHERE bookid = 1;

--(2) 가격이20,000원이상인도서의이름
SELECT bookname FROM book WHERE price >= 20000;

--(3) 박지성의총구매액(박지성의고객번호는1번으로놓고작성)
SELECT SUM(saleprice) FROM orders WHERE bookid IN(SELECT bookid FROM orders WHERE custid = (SELECT custid FROM customer WHERE name = '박지성'));

--(4) 박지성이구매한도서의수(박지성의고객번호는1번으로놓고작성)
SELECT MAX(ROWNUM) buynum FROM orders WHERE custid = (SELECT custid FROM customer WHERE name = '박지성');

--2. 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.
--(1) 마당서점도서의총개수
SELECT MAX(ROWNUM) booknum FROM book; 

--(2) 마당서점에도서를출고하는출판사의총개수
SELECT MAX(ROWNUM) publishernum FROM (SELECT DISTINCT publisher FROM book);

--(3) 모든고객의이름, 주소
SELECT name, address FROM customer;

--(4) 2014년7월4일~7월7일사이에주문받은도서의주문번호
SELECT orderid FROM orders WHERE orderdate BETWEEN '140704' AND '140707'; 

--(5) 2014년7월4일~7월7일사이에주문받은도서를제외한도서의주문번호
SELECT orderid FROM orders WHERE orderdate NOT BETWEEN '140704' AND '140707'; 

--(6) 성이‘김’씨인고객의이름과주소
SELECT name, address FROM customer WHERE name LIKE '김%';

--성이‘김’씨이고이름이‘아’로끝나는고객의이름과주소
SELECT name, address FROM customer WHERE name LIKE '김%아';

--1. 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.
SELECT * FROM book;
SELECT * FROM customer;
SELECT * FROM orders;
--(5) 박지성이구매한도서의출판사수
SELECT MAX(ROWNUM) FROM (SELECT DISTINCT publisher FROM book WHERE bookid IN(SELECT bookid FROM orders WHERE custid = (SELECT custid FROM customer WHERE name = '박지성')));

--(6) 박지성이구매한도서의이름, 가격, 정가와판매가격의차이
SELECT o.bookid, b.bookname, b.price, (b.price-o.saleprice) FROM orders o, book b WHERE (custid = (SELECT custid FROM customer WHERE name = '박지성')) AND b.bookid = o.bookid;

--(7) 박지성이구매하지않은도서의이름
SELECT bookname FROM book WHERE bookname NOT IN(SELECT bookname FROM orders o, book b WHERE (custid =(SELECT custid FROM customer WHERE name = '박지성') AND o.bookid = b.bookid));

--2. 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.
--(8) 주문하지않은고객의이름(부속질의사용)
SELECT name FROM customer WHERE name NOT IN(SELECT c.name FROM orders o, customer c WHERE o.custid = c.custid);

--(9) 주문금액의총액과주문의평균금액
SELECT SUM(saleprice), AVG(saleprice) FROM orders;

--(10) 고객의이름과고객별구매액
SELECT name, SUM(saleprice) FROM customer c, orders o WHERE o.custid = c.custid GROUP BY name;

--(11) 고객의이름과고객이구매한도서목록
SELECT c.name, b.bookname FROM customer c, orders o, book b WHERE o.custid = c.custid AND o.bookid = b.bookid ORDER BY name ASC;

--(12) 도서의가격(Book 테이블)과판매가격(Orders 테이블)의차이가가장많은주문
SELECT orderid, bookname, price-saleprice FROM orders , book  WHERE (book.bookid = orders.bookid) AND (price-saleprice=(SELECT MAX(price-saleprice) FROM book, orders WHERE book.bookid = orders.bookid));

--(13) 도서의판매액평균보다자신의구매액평균이더높은고객의이름
SELECT DISTINCT o.custid, indavgsal, name FROM customer c, orders o, (SELECT AVG(saleprice) sal FROM orders), (SELECT custid cust ,AVG(saleprice) indavgsal  FROM orders GROUP BY custid) WHERE (sal < indavgsal) AND (cust= o.custid) AND (cust = c.custid);
