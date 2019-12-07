--2019.11.25
-- CROSS JOIN: 테이블을 단순히 붙여준다.
-- JOIN: 테이블을 집합으로 보고 집합의 곱 연산의 결과이다 -> N*M (결과 행이다.)

SELECT *
FROM emp, dept;

--equi join
SELECT * 
FROM emp, dept
WHERE emp.deptno=dept.deptno;

--이름이 'SCOTT'인 사원의 소속부서의 이름과 사원의 이름을 함께 출력하자. 
SELECT ename, dname --emp.ename, dept.dname 컬럼 이름이 중복되지 않으면 테이블명을 쓰지 않아도 된다.
FROM emp,dept
WHERE emp.deptno=dept.deptno AND ename = 'SCOTT';

SELECT ename, dname, e.deptno 
FROM emp e,dept d --별칭
WHERE e.deptno=d.deptno AND ename = 'SCOTT';

SELECT e.sal, s.losal, s.hisal, s.grade
FROM emp e, salgrade s
WHERE sal BETWEEN s.losal AND s.hisal
ORDER BY s.grade;

SELECT mgr
FROM emp
WHERE ename='SMITH';

SELECT ename
FROM emp
WHERE empno = 7902;

SELECT e1.ename, e2.ename, d.dname 
FROM emp e1, emp e2, dept d
WHERE e1.mgr = e2.empno AND e1.deptno = d.deptno
ORDER BY e2.ename ASC;

SELECT e.ename, m.ename
FROM emp e, emp m 
WHERE e.mgr = m.empno(+);

--ANSI JOIN
-- CROSS JOIN
SELECT * FROM emp, dept; --ORACLE에서 사용
SELECT * FROM emp CROSS JOIN dept; --MYSQL, MSSQL, ORACLE에서 사용

--inner join
SELECT * FROM emp e, dept d WHERE e.deptno = d.deptno;
SELECT * FROM emp INNER JOIN dept ON emp.deptno = dept.deptno; --위에 것과 같다. 
SELECT * FROM emp e INNER JOIN dept d ON e.deptno = d.deptno;

--USING
SELECT * FROM emp inner join dept using(deptno);

--Natural join
SELECT * FROM emp NATURAL JOIN dept; --컬럼명이 같은게 1개만 있을 때 사용. 

-- left|right|full Outer join
SELECT * FROM emp e, emp m where e.mgr=m.empno; --13개만 출력됨.
SELECT * FROM emp e, emp m where e.mgr=m.empno(+); --출력되는 쪽에 +
SELECT * FROM emp e LEFT OUTER JOIN emp m on e.mgr=m.empno; --표현하고자 하는 컬럼이 있는 곳을 왼쪽 오른쪽 둘다를 선택하기
SELECT * FROM emp m RIGHT OUTER JOIN emp e on e.mgr=m.empno;

--부속질의: 쿼리 안에 쿼리 작성
--select (부속질의) from (부속질의) where 컬럼 조건식 (부속질의)

--emp 테이블에서 평균급여보다 급여를 더 많이 받는 사원의 리스트를 출력 
-- sal > 평균 급여 <- 부속질의 
SELECT avg(sal) from emp;
SELECT ename, sal from emp WHERE sal >2073.214285714285714285714285714285714286;

SELECT *
FROM emp
WHERE sal > (SELECT avg(sal) from emp);

SELECT *
FROM emp
WHERE sal >= (SELECT sal from emp WHERE sal > 3000);

--다중행 조건
--IN 연산자
--3000 이상 받는 사원이 소속된 부서(10번, 20번)와 동일한 부서에서 근무하는 사원 출력
--3000 이상 받는 사원이 소속된 부서 : 부속 질의 
--동일한 부서에서 근무하는 사원 출력 : 메인 질의 
SELECT ename, deptno
FROM emp
WHERE deptno IN(SELECT DISTINCT deptno FROM emp WHERE sal>=3000);

--ALL 연산자 
--30번 소속 사원들 중에서 급여를 가장 많이 받는 사원보다 더 많은 급여를 받는 사원의 이름, 급여를 출력
--30번 소속 사원들 중에서 급여를 가장 많이 받는 사원: 부속 질의 
SELECT ename, sal FROM emp WHERE deptno = 30;
SELECT ename, sal
FROM emp
WHERE sal > ALL ( SELECT sal FROM emp WHERE deptno =30 );

SELECT ename, sal 
FROM emp
WHERE sal > (SELECT MAX(sal) FROM emp WHERE deptno = 30);

--부서번호가 30번인 사원들의 급여 중 가장 작은 값(950)보다 많은 급여를 받는 사원의 이름, 급여를 출력
--부서번호가 30번인 사원들의 급여 중 가장 작은 값(950) :부속 질의
SELECT sal FROM emp WHERE deptno = 30;
SELECT sal FROM emp WHERE sal > ANY (SELECT sal FROM emp WHERE deptno = 30);

SELECT ename, sal FROM emp WHERE sal > (SELECT MIN(sal) FROM emp WHERE deptno = 30);

--전체 테이블의 컬럼 출력
DESC emp;
--ROWNUM
SELECT ename, ROWNUM FROM emp;

--스칼라 부속질의: Select 뒤에 위치하는 부속질의 
--마당서점의 고객별 판매액을 보이시오(결과는 고객이름과 고객별 판매액을 출력).
SELECT o.custid, (SELECT name FROM customer c WHERE o.custid = c.custid ) AS name
, SUM(o.saleprice),TRUNC(AVG(o.saleprice), 0), count(*) 
FROM orders o
GROUP BY o.custid;

SELECT o.custid 
FROM orders o
ORDER BY o.custid asc;

--주문 정보를 출력 해보자 (주문번호, 고객 이름, 주문 금액)
SELECT orderid, (SELECT name FROM customer WHERE orders.custid = customer.custid),saleprice FROM orders;

--join
SELECT o.orderid, c.name, o.saleprice
FROM orders o, customer c
WHERE o.custid=c.custid;

--인라인 뷰: from 절 뒤에 오는 부속절의 가상의 테이블로 사용 
--고객 이름별 구매 금액의 합 
SELECT * FROM  (SELECT custid, name FROM customer WHERE custid<=2);

SELECT c.name, SUM(o.saleprice)
FROM (SELECT custid, name FROM customer WHERE custid<=2) c, orders o
WHERE c.custid = o.custid
GROUP BY c.name;

SELECT * FROM  (SELECT custid, name FROM customer WHERE custid<=2)
ORDER BY name;

--ROWNUM
SELECT ename, ROWNUM FROM emp;
select ename, ROWNUM from emp order by ename;
SELECT ename, ROWNUM FROM (select * from emp order by ename);

--CREATE TABLE : 테이블 생성
--사원번호, 사원이름, 급여 3개의 칼럼으로 구성된 EMP01 테이블을 생성
CREATE TABLE emp01 (
empno number(4),--사원 번호
ename varchar2(20), --사원 이름
sal number(7,2)
);

--삭제
drop table emp01;
desc emp01;

-- 기존 테이블의 스키마 복사(제약조건 제외)해서 테이블 생성 
CREATE TABLE emp02
AS
SELECT * FROM emp;
desc emp; --not null 조건이 있음.
desc emp02; --not null 조건이 없음. 

CREATE TABLE emp03
AS
SELECT empno, ename FROM emp;

desc emp03;
SELECT * FROM emp03; --백업용도

CREATE TABLE emp05 AS SELECT * FROM emp WHERE deptno = 10;
SELECT * FROM emp05;

CREATE TABLE emp06 AS SELECT * FROM emp WHERE 1=0;
SELECT * FROM emp06;

--테이블의 수정: 컬럼의 추가, 컬럼의 수정, 컬럼의 삭제 
--컬럼의 추가
desc emp01;
ALTER TABLE emp01
add(job varchar2(20));
SELECT * FROM emp01;

--컬럼의 수정
ALTER TABLE emp01
MODIFY (job varchar2(30));
desc emp01;

--컬럼의 삭제
ALTER TABLE emp01
DROP COLUMN job;
desc emp01;

CREATE TABLE emp07 
AS
SELECT * FROM emp;
SELECT * FROM emp07;

--테이블 삭제
DROP TABLE emp07;

SELECT * FROM emp02;
TRUNCATE TABLE emp02;

--테이블 이름 변경
rename emp02 to test;
desc test;

--제약조건
insert into dept (deptno, dname, loc) values (10,'test','seoul');
desc dept;

-- not null 제약 조건 
DROP TABLE emp01;
CREATE TABLE emp01(
empno number(4) not null,
ename varchar2(20) not null,
job varchar2(10)  not null,
deptno number(2) not null
);
desc dept;
INSERT INTO emp01 values (1001, 'say', 'manager', 10);
SELECT * FROM emp01;

DROP TABLE emp03;
CREATE TABLE emp03(
empno number(4) unique,
ename varchar2(20) not null,
job varchar2(10)  not null,
deptno number(2) not null
);
INSERT INTO emp03 values (1001, 'say', 'manager', 10);
INSERT INTO emp03 values (1002, 'say', 'manager', 10);
SELECT * FROM emp03;

--unique 제약조건

Drop table emp04;
CREATE TABLE emp04(
empno number(4) constraint emp04_empno_uk unique,
ename varchar2(20) constraint emp04_ename_nn not null,
job varchar2(10) not null,
deptno number(2) not null
);
SELECT * FROM emp04;
INSERT INTO emp04 values (1001, 'say', 'manager', 10);
INSERT INTO emp04 values (1001, 'say', 'manager', 10);

Drop table emp05;
CREATE TABLE emp05(
empno number(4) constraint emp05_empno_pk primary key,
ename varchar2(20) constraint emp05_ename_nn not null unique,
job varchar2(10) not null,
deptno number(2) not null
);
SELECT * FROM emp05;
INSERT INTO emp05 values (1001, 'say', 'manager', 10);
INSERT INTO emp05 values (1002, 'sayYeah', 'manager', 10);

--외래키 제약 조건 정의
Drop table emp06;
CREATE TABLE emp06(
empno number(4) constraint emp06_empno_pk primary key,
ename varchar2(20) constraint emp06_ename_nn not null unique,
job varchar2(10) not null,
deptno number(2) constraint emp06_deptno_FK REFERENCES dept(deptno)
);
INSERT INTO emp06 values (1001, 'say', 'manager', null);
INSERT INTO emp06 values (1002, 'sayYeah', 'manager', 40);
SELECT * FROM emp06;
