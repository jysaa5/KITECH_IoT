--2019.11.26
--[1교시]
--Check 제약 조건

DROP TABLE emp07;
CREATE TABLE emp07(
empno NUMBER(4) CONSTRAINT emp07_empno_pk PRIMARY KEY,
ename VARCHAR2(20) CONSTRAINT emp07_ename_nn NOT NULL,
sal NUMBER(7,2) CONSTRAINT emp07_sal_chk CHECK (sal BETWEEN 500 AND 5000),
--sal number(7,2) CONSTRAINT emp07_sal_chk check (sal >= 500 sal<= 5000),
regdate DATE DEFAULT sysdate
);
DESC emp07;

DROP TABLE emp07;
CREATE TABLE emp07(
empno NUMBER(4),
ename VARCHAR2(20)CONSTRAINT emp07_ename_nn NOT NULL,
sal NUMBER(7,2),
regdate DATE DEFAULT sysdate,
deptno number(2),
CONSTRAINT emp07_empno_pk PRIMARY KEY(empno),
CONSTRAINT emp07_sal_chk CHECK (sal BETWEEN 500 AND 5000),
CONSTRAINT emp07_deptno_fk FOREIGN KEY(deptno) REFERENCES dept(deptno)
);

--[2교시]
--데이터 입력
--INSERT INTO 테이블 이름 (컬럼) values (data, ...) //컬럼수에 맞게 데이터 넣기
INSERT INTO emp07 (empno, ename, sal) values (null, null, 300);
INSERT INTO emp07 (empno, ename, sal) values (1000, null, 300);
INSERT INTO emp07 (empno, ename, sal) values (1000, 'son', 300);
INSERT INTO emp07 (empno, ename, sal) values (1000, 'son', 3000);

SELECT * FROM emp07;

--데이터 입력
--insert into 테이블 이름 (행 단위 입력에서 입력하고자 하는 컬럼들을 기술한다.) values(기술된 컬럼에 입력할 데이터들을 기술한다.)
--입력할 컬럼의 개수와 입력할 데이터의 개수가 같아야 한다. 타입도 같아야 한다. 

CREATE TABLE dept01
as
SELECT * FROM dept WHERE 1=0;

INSERT INTO dept01 (depno, dename, loc) values (10, 'dev', 'Seoul');

DESC dept01;
INSERT INTO dept01 values (10, 'design', 'Jeju');

--데이터의 변경
--UPDATE 테이블 이름 SET 변경 컬럼 = 새로운 DATA, ... WHERE 조건식 //조건식은 행 선택
DROP TABLE emp01;
CREATE TABLE emp01
AS
SELECT * FROM emp;
SELECT * FROM emp01;

UPDATE emp01 SET deptno = 30 ;
UPDATE emp01 SET deptno = 20 WHERE ename = 'SCOTT' ;

--[3교시]
--급여가 3000이상인 사원만 급여를 10% 인상
UPDATE emp01 SET sal = sal*1.1 WHERE SAL>=3000;

--1987년에 입사한 사원의 입사일을 오늘 날짜로 변경
UPDATE emp01 SET hiredate = sysdate WHERE SUBSTR(hiredate, 1, 2) = '87';
UPDATE emp01 SET hiredate = sysdate WHERE hiredate >= '87/01/01' AND hiredate <= '87/12/31';

--SCOTT 사원의 부서번호를 10번으로 변경, 직급을 manager변경, 입사일을 오늘날짜로 변경, 급여를 50, 커미션을 4000으로 변경 
UPDATE emp01 SET deptno = 10, job = 'MANAGER', hiredate = sysdate, sal = 50, comm =4000 WHERE ename = 'SCOTT'; 

DROP TABLE dept01;
CREATE TABLE dept01 AS SELECT * FROM dept;
--20번 부서의 지역명을 40번 부서의 지역명으로 변경
SELECT loc FROM dept01 WHERE deptno = 40;
SELECT loc FROM dept01 WHERE deptno = 20;

UPDATE dept01 SET 
--loc = (40번 부서의 지역명)
loc = (SELECT loc FROM dept01 WHERE deptno =40)
WHERE deptno =20;

SELECT *FROM dept01;

--20번 부서의 부서이름과 지역을 40번 부서의 이름과 지역명으로 변경 
UPDATE dept01 SET dname = (SELECT dname FROM dept01 WHERE deptno = 40), loc = (SELECT loc FROM dept01 WHERE deptno = 40) 
WHERE deptno = 20;

UPDATE dept01 SET (dname, loc) = (SELECT dname, loc FROM dept01 WHERE deptno = 40)
WHERE deptno = 20;

SELECT * FROM dept01;

--데이터의 삭제
--DELETE FROM 테이블 이름 WHERE 행 선택 조건 : 행 단위 삭제 
SELECT * FROM dept01;
DELETE FROM dept01 WHERE deptno = 10;
DELETE FROM dept01;
ROLLBACK;

--[5교시]
--VIEW: 기본 테이블을 기반으로 하는 가상테이블 (select의 결과를 테이블로 사용) 
SELECT empno, ename, deptno FROM emp WHERE deptno =30; 

CREATE OR REPLACE VIEW emp_view30 
AS
SELECT empno, ename, deptno FROM emp WHERE deptno =30; 
SELECT * from emp_view30;
DROP VIEW emp_view30;

--인라인 뷰
--입사일 빠른 5명을 순서대로 출력
SELECT rownum, ename, hiredate FROM emp ORDER BY hiredate;

CREATE OR REPLACE VIEW emp_view_hire
AS
SELECT ename, hiredate FROM emp ORDER BY hiredate;

SELECT rownum, ename, hiredate FROM emp_view_hire WHERE rownum <=5;

SELECT rownum, ename, hiredate FROM (SELECT * FROM emp ORDER BY hiredate) WHERE rownum <=5;

--[6교시]
--SEQUENCE: 자동 숫자 재생기
--currval: 현재 시퀀스의 값을 반환
--nextval: 새로운 번호를 생성해서 반환 

CREATE SEQUENCE dept_deptno_seq
START WITH 10
INCREMENT BY 10;

SELECT dept_deptno_seq.NEXTVAL FROM dual; 
DROP SEQUENCE dept_deptno_seq;

CREATE TABLE dept03
AS
SELECT * FROM dept WHERE 1 = 0;

SELECT * FROM dept03;

INSERT INTO dept03 VALUES(dept_deptno_seq.NEXTVAL, 'dev', 'seoul');
--INSERT INTO dept03 VALUES(dept_deptno_seq.NEXTVAL, 'dev');

DROP TABLE dept03;

rollback;

--인덱스: 물리적인 저장공간을 따로 만든다. 검색을 빠르게 지원해준다.

CREATE INDEX idx_emp_ename
ON emp(ename);
