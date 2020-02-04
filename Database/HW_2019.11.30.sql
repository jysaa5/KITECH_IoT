SELECT * FROM emp;
SELECT * FROM dept;
--����32
SELECT emp.ename, emp.deptno, dept.dname FROM emp, dept WHERE (ename = 'SCOTT') AND (emp.deptno = dept.deptno);

--����33
SELECT emp.ename, dept.dname, dept.loc FROM emp INNER JOIN dept ON emp.deptno = dept.deptno;

--����36
SELECT emp.ename, dept.dname FROM emp, dept WHERE (ename LIKE '%A%') AND (emp.deptno = dept.deptno);
 
--����37
SELECT emp.ename, emp.job, dept.deptno, dept.dname FROM emp, dept WHERE (dept.loc = 'NEW YORK') AND (emp.deptno = dept.deptno);

--����38
SELECT e.ename, e.empno, m.ename AS mname  FROM emp e, emp m WHERE e.mgr = m.empno;

--����39
SELECT e.empno, e.ename, m.ename AS mname FROM emp e, emp m WHERE e.mgr = m.empno(+) ORDER BY e.empno DESC;

--����40
SELECT e.ename, e.deptno, c.ename AS coworker FROM emp e, emp c WHERE (e.ename = 'SCOTT') AND (e.deptno = m.deptno);

--����41
SELECT j.ename, j.hiredate FROM emp e, emp j WHERE e.ename = 'WARD' AND e.hiredate < j.hiredate;

--����42
SELECT e.ename, e.hiredate, m.ename AS mename, m.hiredate AS mhiredate FROM emp e, emp m WHERE e.hiredate < m.hiredate AND e.mgr = m.empno;

--����43
SELECT ename, job FROM emp WHERE ((SELECT job FROM emp WHERE empno = 7788) = job) AND (empno != 7788);

--����44
SELECT ename, job FROM emp WHERE (SELECT sal FROM emp WHERE empno = 7499) < sal;

--����45
SELECT ename, job, sal FROM emp WHERE ((SELECT MIN(sal) FROM emp) = sal);

--����46
SELECT job, AVG(sal) FROM emp GROUP BY job HAVING (SELECT MIN(AVG(sal)) FROM emp GROUP BY job) = AVG(sal);

--����47
SELECT ename, sal, deptno FROM emp WHERE sal IN(SELECT MIN(sal) FROM emp GROUP BY deptno);

--����48
SELECT empno, ename, job, sal FROM emp WHERE (sal < ALL(SELECT sal FROM emp WHERE job = 'ANALYST')) AND (job != 'ANALYST');

--����49
SELECT ename FROM emp WHERE ename NOT IN((SELECT ename FROM emp WHERE empno IN(SELECT mgr FROM emp)));

--����50
SELECT ename FROM emp WHERE empno IN(SELECT mgr FROM emp);

--����51
SELECT ename, hiredate FROM emp WHERE deptno = (SELECT deptno FROM emp WHERE ename = 'BLAKE') AND ename != 'BLAKE';  

--����52
SELECT empno, ename, sal FROM emp WHERE sal > (SELECT AVG(sal) FROM emp) ORDER BY sal ASC;

--����53
SELECT empno, ename FROM emp WHERE deptno IN(SELECT deptno FROM emp WHERE ename LIKE '%K%');

--����54
SELECT ename, deptno, job FROM emp WHERE deptno = (SELECT deptno FROM dept WHERE loc = 'DALLAS');

--����55
SELECT ename FROM emp WHERE mgr = (SELECT empno FROM emp WHERE ename = 'KING');

--����56
SELECT deptno, ename, job FROM emp WHERE deptno = (SELECT deptno FROM dept WHERE dname = 'RESEARCH');

--����57
SELECT ename, deptno, sal FROM emp WHERE (sal > (SELECT AVG(sal) FROM emp));
--��� ���޺��� ���� �޿��� �ް� �̸��� M�� ���Ե� ����� �������� �ʽ��ϴ�. 
--M�� ���Ե��� �ʰ� N�� ���Ե� ����� �����ϹǷ� ������ �����ϰڽ��ϴ�. 
SELECT empno, ename, sal FROM emp WHERE deptno IN(SELECT deptno FROM emp WHERE (sal > (SELECT AVG(sal) FROM emp)) AND (ename LIKE '%N%'));

--����58
SELECT job FROM emp GROUP BY job HAVING AVG(SAL) = (SELECT MIN(AVG(sal)) FROM emp GROUP BY job); 

--����59
SELECT ename FROM emp WHERE deptno IN (SELECT deptno FROM emp WHERE job = 'MANAGER');

