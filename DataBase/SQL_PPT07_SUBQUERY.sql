--PPT07.SubQuery

--p.02
SELECT dname FROM dept WHERE deptno = (SELECT deptno FROM emp WHERE ename ='SCOTT');

--p.05
SELECT ename, sal FROM emp WHERE sal > (SELECT AVG(sal) FROM emp);

--p.07
SELECT ename, sal, deptno FROM emp WHERE deptno IN (SELECT DISTINCT deptno FROM emp WHERE sal>=3000);

--p.09
SELECT ename, sal FROM emp WHERE sal > ALL(SELECT sal FROM emp WHERE deptno =30);

--p.11
SELECT ename, sal FROM emp WHERE sal > ANY (SELECT sal FROM emp WHERE deptno = 30);