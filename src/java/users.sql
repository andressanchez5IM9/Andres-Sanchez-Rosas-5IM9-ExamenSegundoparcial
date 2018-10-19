drop database if exists Examen;

create database Examen;

use Examen;

create table users ( nombre varchar(50),  apellido varchar(50),
 apellido2 varchar(50), escuela varchar(50), materia varchar(50), deporte varchar(50));

insert into users values ('Andres','Sanchez','Rosas','CECyT 9','Calculo Integral','Natacion');

select * from users;