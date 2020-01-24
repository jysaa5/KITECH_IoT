--2019.11.20

-- 사용자의 소유 테이블 정보
select * from tab;

-- 테이블 구조 확인
DESC emp;
DESC dept;

-- 테이블의 데이터 조회(검색, 질의)
Select * from emp ;
select * from dept;

--사원의 이름, 직급, 급여 출력
select ename, job, sal from emp;

--사칙연산: + - * /
select
ename, sal, sal*12
from emp;

--NULL: 아직 정해지지 않은 데이터, 연산은 불가능 -> 결과는 null 
select ename, sal, sal*12, comm, sal*12+comm
from emp;

--  NULL 값을 치환하는 함쉬 NVL(컬럼, 기본값) // 기본값 = 치환하고 싶은 값
select ename, sal as salary, sal*12 as yearsalary , nvl(comm, 0), sal*12+nvl(comm,0)
from emp;

-- 문자열의 연산 (덧셈만 있음)
select ename || ' is a ' || job from emp; --컬럼 2개로 컬럼 1개로 만듦.

--DISTINCT : 중복 데이터 출력하지 않는다.
select deptno from emp;
select DISTINCT deptno from emp;
select job from emp;
select DISTINCT job from emp;

-- 특정 행 선택: where (조건식) 절 이용 
select *
from emp
WHERE sal >= 3000
;
select ename, job, sal
from emp
WHERE sal >= 3000
;

-- 조건식: =
select * from emp where deptno =10;

-- 문자열 비교: 문자열은 작은 따옴표 사용, 대소문자 구분함. 
select * from emp where ename = 'scott';
select * from emp where ename = 'SCOTT';

-- 날짜 비교: 작은 따옴표 사용
select * from emp where hiredate = '87/04/19';
select * from emp where hiredate < '87/04/19';
select * from emp where hiredate > '87/04/19';
select * from emp where hiredate >= '81/01/01' and hiredate <= '81/12/31';

-- BETWEEN a AND b
select *
from emp
where sal BETWEEN 2000 and 3000
;

select * 
from emp 
where hiredate BETWEEN '81/01/01' and '81/12/31';

--OR 연산의 코드를 줄이는 IN 연산자 
select ename, comm from emp where comm = 300 or comm = 500 or comm = 1400; 
select ename, comm from emp where comm IN(300, 400, 500, 1400);

-- 패턴 검색: 컬럼 이름 LIKE 패턴식 
select ename from emp where ename LIKE 'S%';
select ename from emp where ename LIKE '%S';
select ename from emp where ename LIKE '%A%';

-- 자리수 고정 패턴: _이용
select ename from emp where ename like '_A%';
select ename from emp where ename like '__A%';
select ename from emp where ename not like '%A%';

-- NULL 연산자: IS NULL, IS NOT NULL 
select ename, comm from emp where comm is null; 
select ename, comm from emp where comm is not null; --상여금이 측정이 되지 않은 상태.

-- 결과 데이터 행의 정렬: order by 컬럼명 asc(오름차순)/desc(내림차순)
-- 숫자
select ename, sal from emp order by sal asc; --작은 거에서 큰 것으로 
select ename, sal from emp order by sal;

select ename, sal from emp order by hiredate;
select ename, sal from emp order by hiredate desc;

select ename, sal from emp order by ename;
select ename, sal from emp order by ename desc;

select ename, sal from emp order by sal desc;
select ename, sal from emp order by sal desc, ename asc;

select ename, sal, hiredate from emp order by sal desc, ename asc, hiredate asc;
select ename, sal, hiredate from emp order by sal desc, ename asc, hiredate desc;

-- 함수 

-- 변환 함수: 날짜 -> 문자열, TO_CHAR(날짜, '패턴')
select sysdate 
from dual;

select sysdate, to_char(sysdate, 'YYYY-MM-DD') as "날짜" 
from dual;

select sysdate, to_char(sysdate, 'YYYY.MM.DD') as "날짜" 
from dual;

select sysdate, to_char(sysdate, 'YYYY.MM.DD.Day') as "날짜" 
from dual;

select sysdate, to_char(sysdate, 'YYYY.MM.DD.DY') as "날짜" 
from dual;

select sysdate, to_char(sysdate, 'YYYY.MM.DD.Day (DY)') as "날짜" 
from dual;

select ename, hiredate, to_Char (hiredate, 'YYYY.MM.DD DAY') as hiredate1
from emp 
order by hiredate asc;

select sysdate, to_char(sysdate,'YYYY.MM.DD DAY (DY) HH24:MI:SS')
from dual;

select sysdate, to_char(sysdate,'YYYY.MM.DD DAY (DY) HH12:MI:SS')
from dual;

select sysdate, to_char(sysdate,'YYYY.MM.DD DAY (DY) AM HH24:MI:SS')
from dual;

-- 변함함수: 숫자 -> 문자열, To_CHAR(숫자, '패턴') 
select to_char(12345,'L0,000,000'), to_Char(12345,'L9,999,999'), to_Char(12345,'00000.0')
from dual;

select ename, sal, comm, to_char(sal, 'L9,999,999'),  to_char(sal*1000, 'L9,999,999'), to_char(sal*1000*12+(nvl(comm,0)*1000), 'L999,999,999')
from emp
order by sal desc;

-- 변환함수: to_date (문자열/숫자, '패턴')
select trunc(sysdate-to_date('1995/05/23', 'YYYY/MM/DD'))
from dual;

select trunc(sysdate-to_date('2019/01/01', 'YYYY/MM/DD'))
from dual;

-- 변환함수: to_number(문자열, '패턴')
select to_number('20,000','99,999') - to_number('10,000','99,999')
from dual;

--8. 직급에 따라 급여를 인상하도록 하자. 
--직급이 'ANALYST'인 사원은 5%, 
--'SALESMAN'인 사원은 10%, 
--'MANAGER'인 사원은 15%, 
--'CLERK'인 사원은 20%인 인상한다.

select empno, ename, job, sal, 
decode(job, 'ANALYST' , sal*1.05, 'SALESMAN', sal*1.10, 'MANAGER', sal*1.15, 'CLERK', sal*1.20) upsal
from emp
order by sal desc;

--집합 함수 , null은 계산하지 않음.
select 
sum(sal) as "월 총 급여", 
trunc(avg(sal)) as "월 평균 급여", 
count(*) as "총 사원의 수", 
Max(sal) as "최고 급여", 
Min(sal) as "최소 급여",
sum(comm) as "총 상여금",
trunc(avg(comm)) as "상여금 평균",
count(comm) as "상여금 책정인원"

from emp
where deptno = 30;

-- groub by: 그룹핑 -> 그룹별 집합 함수 표현
select deptno, count(*), sum(sal), trunc(avg(sal))
from emp
group by deptno
having avg(sal) > 2000;

