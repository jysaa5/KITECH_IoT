SELECT * FROM project.opmember;



create table project.OPMEMBER (
idx INT auto_increment primary key,
uemail VARCHAR(100) unique not null,
uname VARCHAR(100) unique not null,
upw VARCHAR(20) not null,
gender CHAR(1) check (gender='m' or gender='f')not null,
byear INT,
uphoto VARCHAR(200),
regdate datetime
);