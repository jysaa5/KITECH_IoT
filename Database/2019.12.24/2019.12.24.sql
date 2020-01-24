--Open Project
-- 회원 테이블: MEMBER
drop table opmember;

CREATE TABLE opmember (
idx NUMBER(4) CONSTRAINT member_idx_pk primary key,
uemail VARCHAR2(100) UNIQUE NOT NULL,
uname VARCHAR2(100) UNIQUE NOT NULL,
upw VARCHAR2(20) NOT NULL,
gender CHAR(1) CHECK (gender='m' OR gender = 'w') NOT NULL,
byear number(4),
uphoto VARCHAR2(200) --파일 경로 또는 파일 이름을 넣을 것이다.
);

CREATE SEQUENCE member_idx_seq;
DROP SEQUENCE member_idx_seq;
insert into opmember values(member_idx_seq.nextval, ?, ?, ?, ?, ?, ?); --데이터 삽입
insert into opmember values(member_idx_seq.nextval, 'test@test.com', 'tester', '1111', 'w', '1995', null); --입력 테스트

select * from opmember ORDER BY idx;

select * from opmember WHERE idx = 6;

update opmember set uname =?, upw =?, gender =?, byear =? WHERE idx = ?;
update opmember set uname ='son', upw ='ttt', gender ='m', byear =1990 WHERE idx = 3;


delete from opmember where idx = ?;
delete from opmember where idx = 2;
rollback;

commit;