--PPT09.DML

--p.03
DROP TABLE dept01;
CREATE TABLE sam02(year01 INTERVAL YEAR(3) TO MONTH);

--p.04
CREATE TABLE dept01 AS SELECT * FROM dept WHERE 1=0;
INSERT INTO dept01 (deptno, dname, loc) VALUES(10, 'ACCOUNTING', 'NEW YORK');

--p.06
--INSERT INTO dept01 (deptno, dname, loc) VALUES (10, 'ACCOUNTING');
--INSERT INTO dept01 (deptno, dname, loc) VALUES(10, 'ACCOUNTING', 'NEW YORK', 20);

--p.07
--INSERT INTO dept01 (num, dname, loc) VALUES(10, 'ACCOUNTING', 'NEW YORK');
--INSERT INTO dept01 (deptno, dname, loc) VALUES(10, ACCOUNTING, 'NEW YORK');

--p.09
INSERT INTO dept01 VALUES (20, 'RESEARCH', 'DALLAS');

--p.12
INSERT INTO dept01 (DEPTNO, DNAME) VALUES (30, 'SALES');

--p.13
INSERT INTO dept01 VALUES (40, 'OPERATIONS', NULL);

--p.14
INSERT INTO dept01 VALUES (50, '', 'CHICAGO');

--p.16
DROP TABLE dept02;
CREATE TABLE dept02 AS SELECT * FROM dept WHERE 1=0;
INSERT INTO dept02 SELECT * FROM dept;

--p.18
CREATE TABLE emp_hir AS SELECT empno, ename, hiredate FROM emp WHERE 1=0;
CREATE TABLE emp_mgr AS SELECT empno, ename, mgr FROM emp WHERE 1=0;
INSERT ALL
INTO emp_hir VALUES(empno, ename, hiredate)
INTO emp_mgr VALUES(empno, ename, mgr)
SELECT empno, ename, hiredate, mgr
FROM emp
WHERE deptno=20;

--p.19
CREATE TABLE emp_hir02 AS SELECT empno, ename, hiredate FROM emp WHERE 1=0;
CREATE TABLE emp_sal AS SELECT empno, ename, sal FROM emp WHERE 1=0;

INSERT ALL WHEN hiredate > '1982/01/01' THEN INTO emp_hir02 VALUES(empno, ename, hiredate)
WHEN sal > 2000 THEN INTO emp_sal VALUES(empno, ename, sal)
SELECT empno, ename, hiredate, sal FROM emp;

--p.21
DROP TABLE emp01;
CREATE TABLE emp01 AS SELECT * FROM emp;

UPDATE emp01 SET deptno=30;
UPDATE emp01 SET sal = sal * 1.1;
UPDATE emp01 SET hiredate = SYSDATE;

--p.22
DROP TABLE emp01;
CREATE TABLE emp01 AS SELECT * FROM emp;

--p.23
UPDATE emp01 SET deptno=30 WHERE deptno=10;
UPDATE emp01 SET sal = sal * 1.1 WHERE sal >= 3000;

--p.24
UPDATE emp01 SET hiredate = SYSDATE WHERE SUBSTR(hiredate, 1, 2)='87';

--p.26
UPDATE emp01 SET deptno=20, job='MANAGER' WHERE ename='SCOTT';
UPDATE emp01 SET hiredate = SYSDATE, sal=50, comm=4000 WHERE ename='SCOTT';

--p.28
UPDATE dept01 SET loc=(SELECT loc FROM dept01 WHERE deptno=40) WHERE deptno=20;

--p.30
UPDATE dept01 SET (dname, loc)=(SELECT dname, loc FROM dept WHERE deptno=40) WHERE deptno=20;

--p.32
DELETE FROM dept01;

--p.33
DROP TABLE dept01;
CREATE TABLE dept01 AS SELECT * FROM dept;
DELETE FROM dept01 WHERE deptno=30;

--p.35
DELETE FROM emp01 WHERE deptno=(SELECT deptno FROM dept WHERE dname='SALES');
