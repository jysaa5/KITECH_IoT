SELECT * FROM emp;
SELECT * FROM dept;

--����01.
SELECT ename, sal, (300+sal) AS increasedsal FROM emp;

--����02.
SELECT ename, sal, (sal*12+100) AS annualtatalsal FROM emp ORDER BY annualtatalsal ASC; 

--����03.
SELECT ename, sal FROM emp WHERE (sal>2000) ORDER BY sal DESC;

--����04.
SELECT ename, empno FROM emp WHERE (empno = 7788);

--����05.
SELECT ename, sal FROM emp WHERE sal NOT BETWEEN 2000 AND 3000;

--����06.
SELECT ename, job, hiredate FROM emp WHERE hiredate BETWEEN '81/02/20' AND '81/05/01';

--����07.
SELECT ename, deptno FROM emp WHERE (deptno = 20 OR deptno = 30) ORDER BY ename DESC;

--����08.
SELECT ename, deptno, sal FROM emp WHERE (sal BETWEEN 2000 AND 3000) AND (deptno IN(20,30)) ORDER BY ename ASC;

--����09.
SELECT ename, hiredate FROM emp WHERE hiredate LIKE '81%';

--����10.
SELECT ename, job FROM emp WHERE mgr Is NULL;

--����11.
SELECT ename, sal, comm FROM emp WHERE comm Is NOT NULL ORDER BY sal DESC, comm DESC;

--����12.
SELECT ename FROM emp WHERE ename LIKE '__R%';

--����13.
SELECT ename FROM emp WHERE (ename LIKE '%A%')AND(ename LIKE '%E%');

--����14.
SELECT ename, job, sal FROM emp WHERE (job IN ('CLERK','SALESMAN')) AND (sal not IN (1600,950,1300)); 

--����15.
SELECT ename, sal, comm FROM emp WHERE (comm >= 500);

--����16.
SELECT ename, '1900'+SUBSTR(hiredate, 1, 2) AS hireyear, SUBSTR(hiredate, 4, 2) AS hiremonth FROM emp;

--����17.
SELECT ename, SUBSTR(hiredate, 4, 2) AS hiremonth FROM emp WHERE SUBSTR(hiredate, 4, 2) = '04';

--����18.
SELECT ename, empno FROM emp WHERE MOD(empno, 2) = 0;

--����19.
SELECT ename, TO_CHAR(hiredate, 'YY.MON DY') AS hiredate FROM emp;

--����20.
SELECT TRUNC(SYSDATE -TO_DATE('2019/01/01','YYYY/MM/DD')) AS day FROM dual;

--����21. 
SELECT ename, nvl(mgr,0) AS mag FROM emp;

--����22.
SELECT ename, job, DECODE(job, 'ANALYST', sal+100, 'SALESMAN', sal+180, 'MANAGER', sal+150, 'CLERK', sal+100, 'PRESIDENT', sal) AS sal FROM emp;

--����23.
SELECT MAX(sal) AS salmax,MIN(sal) AS salmin, SUM(sal) AS salsum, ROUND(AVG(sal),0) AS salavg FROM emp;

--����24.
SELECT job, MAX(sal) AS salmax,MIN(sal) AS salmin, SUM(sal) AS salsum, ROUND(AVG(sal),0) AS salavg FROM emp GROUP BY job;

--����25.
SELECT job, COUNT(*) FROM emp GROUP BY job;

--����26.
SELECT COUNT(mgr) AS mgrcount FROM emp;

--����27.
SELECT MAX(sal)-MIN(sal) AS difference  FROM emp;

--����28.
SELECT job, MIN(sal) AS salmin FROM emp WHERE (mgr IS NOT NULL) OR (sal>=2000) GROUP BY job ORDER BY salmin DESC;

--����29.
SELECT deptno, COUNT(*) AS empcount, ROUND(AVG(sal),2) AS avgsal FROM emp GROUP BY deptno;

--����30.
SELECT deptno, DECODE(deptno, 10, 'ACCOUNTING', 20, 'RESEARCH',30,'SALES', 40,'OPERATIONS') AS dename,DECODE(deptno, 10, 'NEW YORK', 20, 'DALLAS',30,'CHICAGO', 40,'BOSTON') AS loc, COUNT(*) AS empcount, ROUND(AVG(sal),0) AS avgsal FROM emp GROUP BY deptno;

--����31.
SELECT job, deptno AS dno, DECODE (deptno, 10, sum(sal)) AS �μ�10, DECODE (deptno, 20, sum(sal)) AS �μ�20, DECODE (deptno, 30, sum(sal)) AS �μ�30, SUM(sal) AS �Ѿ� FROM emp GROUP BY job,deptno ORDER BY deptno ASC;
