/*
1) Створити таблицю Homework. Ця таблиця складається з атрибутів: id, name, description
Для атрибуту ID має бути забезпечене обмеження Primary Key та AutoIncrement
2) Створити таблицю Lesson. Ця таблиця складається з атрибутів: id, name, updatedAt, homework_id (зв'язок one-to-one)
Для атрибуту ID має бути забезпечене обмеження Primary Key та AutoIncrement
Пов'язано з таблицею Homework через Foreign Key
3) Створити таблицю Schedule. Ця таблиця складається з атрибутів: id, name, updatedAt, lessons (зв'язок many-to-many)
Для атрибуту ID має бути забезпечене обмеження Primary Key і AutoIncrement
Зв'язано з таблицею Lesson через Foreign Key
Перенести ініціалізаційні sql-скрипти у файл initsql
*/

create table Homework (
    id serial not null,
    name varchar(32) not null,
    description varchar(32) not null,
    PRIMARY KEY(id)
);

create table Lesson (
    id serial not null,
    name varchar(32) not null,
    updatedAt timestamp default now(),
    homework_id int not null,
    PRIMARY KEY(id),
    CONSTRAINT fk_homework FOREIGN KEY(homework_id) REFERENCES Homework(id)
);

create table Schedule (
    id serial not null,
    name varchar(32) not null,
    updatedAt timestamp default now(),
    lessons int not null,
    PRIMARY KEY(id),
    CONSTRAINT fk_lessons FOREIGN KEY(lessons) REFERENCES Lesson(id)
);

/*
insert into Homework (name, description)
	values
('Start','Meeting SQL'),
('Prepearing','Install PostgreSQL'),
('Main','Main functions'),
('Finish','Conclusion')
;

insert into Lesson (name, homework_id)
	values
('Start',1),
('Prepearing',2),
('Main',3),
('Finish',4)
;

insert into Schedule (name, lessons)
	values
('Start',1),
('Start2',1),
('Main',3),
('Finish',4)
;
*/