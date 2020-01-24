create table project.OPMEMBER (
idx INT auto_increment primary key,
uemail VARCHAR(100) unique not null,
uname VARCHAR(100) unique not null,
upw VARCHAR(20) not null,
gender CHAR(1) check (gender='m' or gender='w')not null,
byear INT,
uphoto VARCHAR(200),
regdate datetime
);

ALTER TABLE `project`.`guestbook` 
ADD CONSTRAINT `gbook_fk`
  FOREIGN KEY (`memberid`)
  REFERENCES `project`.`opmember` (`idx`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;
 
 INSERT INTO `project`.`guestbook`
(`memberid`,
`title`,
`content`)
VALUES
();

select * from project.guestbook;

commit;


