SELECT * FROM emp;
SELECT * FROM dept;

--巩力01.
SELECT ename, sal, (300+sal) AS increasedsal FROM emp;

--巩力02.
SELECT ename, sal, (sal*12+100) AS annualtatalsal FROM emp ORDER BY annualtatalsal ASC; 

--巩力03.
SELECT ename, sal FROM emp WHERE (sal>2000) ORDER BY sal DESC;

--巩力04.
SELECT ename, empno FROM emp WHERE (empno = 7788);

--巩力05.
SELECT ename, sal FROM emp WHERE sal NOT BETWEEN 2000 AND 3000;

--巩力06.
SELECT ename, job, hiredate FROM emp WHERE hiredate BETWEEN '81/02/20' AND '81/05/01';

--巩力07.
SELECT ename, deptno FROM emp WHERE (deptno = 20 OR deptno = 30) ORDER BY ename DESC;

--巩力08.
SELECT ename, deptno, sal FROM emp WHERE (sal BETWEEN 2000 AND 3000) AND (deptno IN(20,30)) ORDER BY ename ASC;

--巩力09.
SELECT ename, hiredate FROM emp WHERE hiredate LIKE '81%';

--巩力10.
SELECT ename, job FROM emp WHERE mgr Is NULL;

--巩力11.
SELECT ename, sal, comm FROM emp WHERE comm Is NOT NULL ORDER BY sal DESC, comm DESC;

--巩力12.
SELECT ename FROM emp WHERE ename LIKE '__R%';

--巩力13.
SELECT ename FROM emp WHERE (ename LIKE '%A%')AND(ename LIKE '%E%');

--巩力14.
SELECT ename, job, sal FROM emp WHERE (job IN ('CLERK','SALESMAN')) AND (sal not IN (1600,950,1300)); 

--巩力15.
SELECT ename, sal, comm FROM emp WHERE (comm >= 500);

--巩力16.
SELECT ename, '1900'+SUBSTR(hiredate, 1, 2) AS hireyear, SUBSTR(hiredate, 4, 2) AS hiremonth FROM emp;

--巩力17.
SELECT ename, SUBSTR(hiredate, 4, 2) AS hiremonth FROM emp WHERE SUBSTR(hiredate, 4, 2) = '04';

--巩力18.
SELECT ename, empno FROM emp WHERE MOD(empno, 2) = 0;

--巩力19.
SELECT ename, TO_CHAR(hiredate, 'YY.MON DY') AS hiredate FROM emp;

--巩力20.
SELECT TRUNC(SYSDATE -TO_DATE('2019/01/01','YYYY/MM/DD')) AS day FROM dual;

--巩力21. 
SELECT ename, nvl(mgr,0) AS mag FROM emp;

--巩力22.
SELECT ename, job, DECODE(job, 'ANALYST', sal+100, 'SALESMAN', sal+180, 'MANAGER', sal+150, 'CLERK', sal+100, 'PRESIDENT', sal) AS sal FROM emp;

--巩力23.
SELECT MAX(sal) AS salmax,MIN(sal) AS salmin, SUM(sal) AS salsum, ROUND(AVG(sal),0) AS salavg FROM emp;

--巩力24.
SELECT job, MAX(sal) AS salmax,MIN(sal) AS salmin, SUM(sal) AS salsum, ROUND(AVG(sal),0) AS salavg FROM emp GROUP BY job;

--巩力25.
SELECT job, COUNT(*) FROM emp GROUP BY job;

--巩力26.
SELECT COUNT(mgr) AS mgrcount FROM emp;

--巩力27.
SELECT MAX(sal)-MIN(sal) AS difference  FROM emp;

--巩力28.
SELECT job, MIN(sal) AS salmin FROM emp WHERE (mgr IS NOT NULL) OR (sal>=2000) GROUP BY job ORDER BY salmin DESC;

--巩力29.
SELECT deptno, COUNT(*) AS empcount, ROUND(AVG(sal),2) AS avgsal FROM emp GROUP BY deptno;

--巩力30.
SELECT deptno, DECODE(deptno, 10, 'ACCOUNTING', 20, 'RESEARCH',30,'SALES', 40,'OPERATIONS') AS dename,DECODE(deptno, 10, 'NEW YORK', 20, 'DALLAS',30,'CHICAGO', 40,'BOSTON') AS loc, COUNT(*) AS empcount, ROUND(AVG(sal),0) AS avgsal FROM emp GROUP BY deptno;

--巩力31.
SELECT job, deptno AS dno, DECODE (deptno, 10, sum(sal)) AS 何辑10, DECODE (deptno, 20, sum(sal)) AS 何辑20, DECODE (deptno, 30, sum(sal)) AS 何辑30, SUM(sal) AS 醚咀 FROM emp GROUP BY job,deptno ORDER BY deptno ASC;
