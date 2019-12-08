--PPT11.View

--p.06
CREATE TABLE emp_copy AS SELECT * FROM emp;
SELECT empno, ename, deptno FROM emp_copy WHERE deptno=30;

--p.07
CREATE VIEW emp_view30 AS SELECT empno, ename, deptno FROM emp_copy WHERE deptno=30;
SELECT * FROM emp_view30;

--p.09
SELECT VIEW_NAME, TEXT FROM USER_VIEWS;

--p.16
CREATE VIEW view_sal AS SELECT * FROM emp;
DROP VIEW view_sal;

--p.18
SELECT rownum, empno, ename, hiredate FROM emp;
SELECT empno, ename, hiredate FROM emp ORDER BY hiredate;

--p.19
SELECT rownum, empno, ename, hiredate FROM emp ORDER BY hiredate;

--p.21
CREATE OR REPLACE VIEW view_hire AS SELECT empno, ename, hiredate FROM emp ORDER BY hiredate;

--p.22
SELECT rownum, empno, ename, hiredate FROM view_hire;

--p.23
SELECT rownum, empno, ename, hiredate FROM view_hire WHERE rownum <= 5;

--p.26
SELECT rownum, empno, ename, hiredate FROM (SELECT empno, ename, hiredate FROM emp ORDER BY hiredate) WHERE rownum <= 5;