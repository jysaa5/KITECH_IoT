--PPT06.JOIN

--p.05
SELECT * FROM emp, dept;

--p.08.Equi join
SELECT * FROM emp, dept WHERE emp.deptno = dept.deptno;

--p.11
SELECT ename, dname, deptno FROM emp, dept WHERE emp.deptno = dept.deptno AND ename = 'SCOTT';

--p.12
SELECT emp.ename, dept.dname, emp.deptno FROM emp, dept WHERE emp.deptno = dept.deptno AND ename = 'SCOTT';

--p.13
SELECT e.ename, d.dname, e.deptno, d.deptno FROM emp e, dept d WHERE e.deptno = d.deptno AND e.ename = 'SCOTT';

--p.14
SELECT * FROM salgrade;

--p.16
SELECT ename, sal, grade FROM emp, salgrade WHERE sal BETWEEN losal AND hisal;

--p.17
SELECT employee.ename || '의 매니저는' || manager.ename || '입니다.' FROM emp employee, emp manager WHERE employee.mgr = manager.empno;

--p.20
SELECT employee.ename || '의 매니저는' || manager.ename || '입니다.' FROM emp employee, emp manager WHERE employee.mgr = manager.empno(+);

--p.21
SELECT * FROM emp CROSS JOIN dept;

--p.22
SELECT ename, dname FROM emp INNER JOIN dept ON emp.deptno = dept.deptno WHERE ename = 'SCOTT';

--p.23
SELECT emp.ename, dept.dname FROM emp INNER JOIN dept USING (deptno);

--p.24
SELECT emp.ename, dept.dname FROM emp NATURAL JOIN dept;

--p.26
SELECT * FROM dept01 LEFT OUTER JOIN dept02 ON dept01.deptno = dept02.deptno;

--p.27
SELECT * FROM dept01 RIGHT OUTER JOIN dept02 USING(deptno);

--p.28
SELECT * FROM dept01 FULL OUTER JOIN dept02 USING(deptno);