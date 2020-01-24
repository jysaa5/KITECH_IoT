create table project.MEMBER (
ID int auto_increment primary key,
EMAIL varchar(255),
PASSWORD varchar(100),
NAME varchar(100),
REGDATE datetime,
unique key (EMAIL)
);

INSERT INTO `project`.`member`
(
`EMAIL`,
`PASSWORD`,
`NAME`,
`REGDATE`)
VALUES
('test1@test', '2222', 'tester1', now());

select * from project.member;

commit;

select count(*) from project.member;