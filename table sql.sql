
CREATE DATABASE COLLEGE;
USE COLLEGE;
create TABLE STUDENT(
  ID INT primary key,
  name varchar(50),
  marks int
  );
  insert into student values(1,"aman",59),
 (2,"amit",89), (3,"arjun",98),(4,"kundan",99),(7,"abhi",28);
 create table course(
 ID int primary key,
 subject varchar(50));
insert into course values (1,"math"),(2,"eng"),(3,"bio");
select * from student;
select avg(marks)
from student;
select * from student
where marks>74;
update student 
change marks = marks +1;
select name from student
where id in (1,2,3);
 
left join course as c
on a.ID = c.ID
where c.id is null;
union
select * from student as a
join course as c
on a.ID = c.ID;


 select *
 from student as a;
alter table student
change name fname varchar(60);
delete from student
where column name;
set sql_safe_updates=0;
 drop database college;
 alter table course
 drop column id;
 drop table course;