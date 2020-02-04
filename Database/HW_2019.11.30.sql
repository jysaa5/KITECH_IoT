SELECT * FROM emp;
SELECT * FROM dept;
--문제32
SELECT emp.ename, emp.deptno, dept.dname FROM emp, dept WHERE (ename = 'SCOTT') AND (emp.deptno = dept.deptno);

--문제33
SELECT emp.ename, dept.dname, dept.loc FROM emp INNER JOIN dept ON emp.deptno = dept.deptno;

--문제36
SELECT emp.ename, dept.dname FROM emp, dept WHERE (ename LIKE '%A%') AND (emp.deptno = dept.deptno);
 
--문제37
SELECT emp.ename, emp.job, dept.deptno, dept.dname FROM emp, dept WHERE (dept.loc = 'NEW YORK') AND (emp.deptno = dept.deptno);

--문제38
SELECT e.ename, e.empno, m.ename AS mname  FROM emp e, emp m WHERE e.mgr = m.empno;

--문제39
SELECT e.empno, e.ename, m.ename AS mname FROM emp e, emp m WHERE e.mgr = m.empno(+) ORDER BY e.empno DESC;

--문제40
SELECT e.ename, e.deptno, c.ename AS coworker FROM emp e, emp c WHERE (e.ename = 'SCOTT') AND (e.deptno = m.deptno);

--문제41
SELECT j.ename, j.hiredate FROM emp e, emp j WHERE e.ename = 'WARD' AND e.hiredate < j.hiredate;

--문제42
SELECT e.ename, e.hiredate, m.ename AS mename, m.hiredate AS mhiredate FROM emp e, emp m WHERE e.hiredate < m.hiredate AND e.mgr = m.empno;

--문제43
SELECT ename, job FROM emp WHERE ((SELECT job FROM emp WHERE empno = 7788) = job) AND (empno != 7788);

--문제44
SELECT ename, job FROM emp WHERE (SELECT sal FROM emp WHERE empno = 7499) < sal;

--문제45
SELECT ename, job, sal FROM emp WHERE ((SELECT MIN(sal) FROM emp) = sal);

--문제46
SELECT job, AVG(sal) FROM emp GROUP BY job HAVING (SELECT MIN(AVG(sal)) FROM emp GROUP BY job) = AVG(sal);

--문제47
SELECT ename, sal, deptno FROM emp WHERE sal IN(SELECT MIN(sal) FROM emp GROUP BY deptno);

--문제48
SELECT empno, ename, job, sal FROM emp WHERE (sal < ALL(SELECT sal FROM emp WHERE job = 'ANALYST')) AND (job != 'ANALYST');

--문제49
SELECT ename FROM emp WHERE ename NOT IN((SELECT ename FROM emp WHERE empno IN(SELECT mgr FROM emp)));

--문제50
SELECT ename FROM emp WHERE empno IN(SELECT mgr FROM emp);

--문제51
SELECT ename, hiredate FROM emp WHERE deptno = (SELECT deptno FROM emp WHERE ename = 'BLAKE') AND ename != 'BLAKE';  

--문제52
SELECT empno, ename, sal FROM emp WHERE sal > (SELECT AVG(sal) FROM emp) ORDER BY sal ASC;

--문제53
SELECT empno, ename FROM emp WHERE deptno IN(SELECT deptno FROM emp WHERE ename LIKE '%K%');

--문제54
SELECT ename, deptno, job FROM emp WHERE deptno = (SELECT deptno FROM dept WHERE loc = 'DALLAS');

--문제55
SELECT ename FROM emp WHERE mgr = (SELECT empno FROM emp WHERE ename = 'KING');

--문제56
SELECT deptno, ename, job FROM emp WHERE deptno = (SELECT deptno FROM dept WHERE dname = 'RESEARCH');

--문제57
SELECT ename, deptno, sal FROM emp WHERE (sal > (SELECT AVG(sal) FROM emp));
--평균 월급보다 많은 급여를 받고 이름에 M이 포함된 사원은 존재하지 않습니다. 
--M이 포함되지 않고 N이 포함된 사원은 존재하므로 조건을 수정하겠습니다. 
SELECT empno, ename, sal FROM emp WHERE deptno IN(SELECT deptno FROM emp WHERE (sal > (SELECT AVG(sal) FROM emp)) AND (ename LIKE '%N%'));

--문제58
SELECT job FROM emp GROUP BY job HAVING AVG(SAL) = (SELECT MIN(AVG(sal)) FROM emp GROUP BY job); 

--문제59
SELECT ename FROM emp WHERE deptno IN (SELECT deptno FROM emp WHERE job = 'MANAGER');

