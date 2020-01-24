SELECT * FROM emp;
SELECT * FROM dept;

--문제01
SELECT ename, sal, sal+300 AS increasedsal FROM emp;

--문제02
SELECT ename, sal, sal*12+100 AS yearsal FROM emp ORDER BY sal*12+100 ASC;

--문제03
SELECT ename, sal FROM emp WHERE (sal > 2000) ORDER BY sal ASC;

--문제04
SELECT ename, empno FROM emp WHERE empno = 7788;

--문제05
SELECT ename, sal FROM emp WHERE sal NOT BETWEEN 2000 AND 3000; 

--문제06
SELECT ename, job, hiredate FROM emp WHERE hiredate BETWEEN '81/02/20' and '81/05/01';

--문제07
SELECT ename, deptno FROM emp WHERE deptno = 20 OR deptno = 30  ORDER BY ename ASC;

--문제08
SELECT ename, deptno, sal FROM emp WHERE (sal BETWEEN 2000 AND 3000) AND (deptno = 20 OR deptno = 30) ORDER BY ename ASC; 

--문제09
SELECT ename, hiredate FROM emp WHERE hiredate LIKE '81/%'; 