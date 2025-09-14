create database librarydb;
use librarydb;

create table members(
	member_id int,
    member_name varchar(100),
    doj date
);

create table books(
	isbn_code varchar(50),
    book_name varchar(50),
    book_desc varchar(1000),
    author_name varchar(100),
    subject_name varchar(100),
    units_available int
);

create table member_book_record(
	record_id int auto_increment primary key,
    member_id int,
    isbn_code varchar(50),
    doi date,
    dor date
) auto_increment = 101;

select * from books;
select * from members;
select * from member_book_record;


create database librarydb2;
use librarydb2;

create table login(
	userid varchar(100) primary key,
    password varchar(50)
);    

create table student(
    id int,
    name varchar(50),
    course varchar(50),
    branch varchar(50),
    semester varchar(25),
    primary key(id)
);

create table book(
    id varchar(50) not null,
    name varchar(50),
    publisher varchar(50),
    price varchar(25),
    year varchar(25),
    status varchar(25),
    issuedate varchar(50),
    duedate varchar(50),
    studentid int,
    primary key(id)
);

select * from book;
select * from student;

insert into login values ('sandip', '123');

show tables;
