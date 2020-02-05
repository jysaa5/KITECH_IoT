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

INSERT INTO Book VALUES(1, '�౸�� ����', '�½�����', 7000);
INSERT INTO Book VALUES(2, '�౸�ƴ� ����', '������', 13000);
INSERT INTO Book VALUES(3, '�౸�� ����', '���ѹ̵��', 22000);
INSERT INTO Book VALUES(4, '���� ���̺�', '���ѹ̵��', 35000);
INSERT INTO Book VALUES(5, '�ǰ� ����', '�½�����', 8000);
INSERT INTO Book VALUES(6, '���� �ܰ躰���', '�½�����', 6000);
INSERT INTO Book VALUES(7, '�߱��� �߾�', '�̻�̵��', 20000);
INSERT INTO Book VALUES(8, '�߱��� ��Ź��', '�̻�̵��', 13000);
INSERT INTO Book VALUES(9, '�ø��� �̾߱�', '�Ｚ��', 7500);
INSERT INTO Book VALUES(10, 'Olympic Champions', 'Pearson', 13000);

INSERT INTO Customer VALUES (1, '������', '���� ��ü��Ÿ', '000-5000-0001');
INSERT INTO Customer VALUES (2, '�迬��', '���ѹα� ����', '000-6000-0001');  
INSERT INTO Customer VALUES (3, '��̶�', '���ѹα� ������', '000-7000-0001');
INSERT INTO Customer VALUES (4, '�߽ż�', '�̱� Ŭ������', '000-8000-0001');
INSERT INTO Customer VALUES (5, '�ڼ���', '���ѹα� ����',  NULL);

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

--1. ���缭���ǰ��̿䱸�ϴ´�������������SQL �����ۼ��Ͻÿ�.
SELECT * FROM book;
SELECT * FROM customer;
SELECT * FROM orders;
--(1) ������ȣ��1�ε������̸�
SELECT bookname FROM book WHERE bookid = 1;

--(2) ������20,000���̻��ε������̸�
SELECT bookname FROM book WHERE price >= 20000;

--(3) ���������ѱ��ž�(�������ǰ���ȣ��1�����γ����ۼ�)
SELECT SUM(saleprice) FROM orders WHERE bookid IN(SELECT bookid FROM orders WHERE custid = (SELECT custid FROM customer WHERE name = '������'));

--(4) �������̱����ѵ����Ǽ�(�������ǰ���ȣ��1�����γ����ۼ�)
SELECT MAX(ROWNUM) buynum FROM orders WHERE custid = (SELECT custid FROM customer WHERE name = '������');

--2. ���缭���ǿ�ڿͰ濵�ڰ��䱸�ϴ´�������������SQL �����ۼ��Ͻÿ�.
--(1) ���缭���������Ѱ���
SELECT MAX(ROWNUM) booknum FROM book; 

--(2) ���缭��������������ϴ����ǻ����Ѱ���
SELECT MAX(ROWNUM) publishernum FROM (SELECT DISTINCT publisher FROM book);

--(3) �������̸�, �ּ�
SELECT name, address FROM customer;

--(4) 2014��7��4��~7��7�ϻ��̿��ֹ������������ֹ���ȣ
SELECT orderid FROM orders WHERE orderdate BETWEEN '140704' AND '140707'; 

--(5) 2014��7��4��~7��7�ϻ��̿��ֹ����������������ѵ������ֹ���ȣ
SELECT orderid FROM orders WHERE orderdate NOT BETWEEN '140704' AND '140707'; 

--(6) ���̡��衯���ΰ����̸����ּ�
SELECT name, address FROM customer WHERE name LIKE '��%';

--���̡��衯���̰��̸��̡��ơ��γ����°����̸����ּ�
SELECT name, address FROM customer WHERE name LIKE '��%��';

--1. ���缭���ǰ��̿䱸�ϴ´�������������SQL �����ۼ��Ͻÿ�.
SELECT * FROM book;
SELECT * FROM customer;
SELECT * FROM orders;
--(5) �������̱����ѵ��������ǻ��
SELECT MAX(ROWNUM) FROM (SELECT DISTINCT publisher FROM book WHERE bookid IN(SELECT bookid FROM orders WHERE custid = (SELECT custid FROM customer WHERE name = '������')));

--(6) �������̱����ѵ������̸�, ����, �������ǸŰ���������
SELECT o.bookid, b.bookname, b.price, (b.price-o.saleprice) FROM orders o, book b WHERE (custid = (SELECT custid FROM customer WHERE name = '������')) AND b.bookid = o.bookid;

--(7) �������̱������������������̸�
SELECT bookname FROM book WHERE bookname NOT IN(SELECT bookname FROM orders o, book b WHERE (custid =(SELECT custid FROM customer WHERE name = '������') AND o.bookid = b.bookid));

--2. ���缭���ǿ�ڿͰ濵�ڰ��䱸�ϴ´�������������SQL �����ۼ��Ͻÿ�.
--(8) �ֹ��������������̸�(�μ����ǻ��)
SELECT name FROM customer WHERE name NOT IN(SELECT c.name FROM orders o, customer c WHERE o.custid = c.custid);

--(9) �ֹ��ݾ����Ѿװ��ֹ�����ձݾ�
SELECT SUM(saleprice), AVG(saleprice) FROM orders;

--(10) �����̸����������ž�
SELECT name, SUM(saleprice) FROM customer c, orders o WHERE o.custid = c.custid GROUP BY name;

--(11) �����̸������̱����ѵ������
SELECT c.name, b.bookname FROM customer c, orders o, book b WHERE o.custid = c.custid AND o.bookid = b.bookid ORDER BY name ASC;

--(12) �����ǰ���(Book ���̺�)���ǸŰ���(Orders ���̺�)�����̰����帹���ֹ�
SELECT orderid, bookname, price-saleprice FROM orders , book  WHERE (book.bookid = orders.bookid) AND (price-saleprice=(SELECT MAX(price-saleprice) FROM book, orders WHERE book.bookid = orders.bookid));

--(13) �������Ǹž���պ����ڽ��Ǳ��ž�����̴����������̸�
SELECT DISTINCT o.custid, indavgsal, name FROM customer c, orders o, (SELECT AVG(saleprice) sal FROM orders), (SELECT custid cust ,AVG(saleprice) indavgsal  FROM orders GROUP BY custid) WHERE (sal < indavgsal) AND (cust= o.custid) AND (cust = c.custid);
