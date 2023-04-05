# CREATE TABLE IF NOT EXISTS user(
#                                    `id_user` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
#                                    `name` VARCHAR(50) NOT NULL ,
#                                    `email` VARCHAR(150) NOT NULL
# );



create database `Hospitalqa24`;

use `Hospitalqa24`;


create table `Departments`
(
    `Id` int not null AUTO_INCREMENT primary key,
    `Building` int not null check (`Building` between 1 and 5),
    `Financing` decimal(10, 2) not null default 0.0 check (`Financing` >= 0.0) ,
    `Floor` int not null check (`Floor` >= 1),
    `Name` varchar(100) not null unique check (`Name` <> N'')
);


create table `Diseases`
(
    `Id` int not null AUTO_INCREMENT primary key,
    `Name` varchar(100) not null unique check (`Name` <> N''),
    `Severity` int not null default 1 check (`Severity` >= 1)
);


create table `Doctors`
(
    `Id` int not null AUTO_INCREMENT primary key,
    `Name` varchar(255) not null check (`Name` <> N''),
    `Phone` char(10) null,
    `Premium` decimal(10, 2) not null default 0.0 check (`Premium` >= 0.0) ,
    `Salary` decimal(10, 2) not null check (`Salary` > 0.0),
    `Surname` varchar(255) not null check (`Surname` <> N'')
);


create table `Examinations`
(
    `Id` int not null AUTO_INCREMENT primary key,
    `DayOfWeek` int not null check (`DayOfWeek` between 1 and 7),
    `EndTime` time not null,
    `Name` varchar(100) not null unique check(`Name` <> N''),
    `StartTime` time not null check (`StartTime` between '08:00' and '18:00'),
    check (`StartTime` < `EndTime`)
);


create table `Wards`
(
    `Id` int not null AUTO_INCREMENT primary key,
    `Building` int not null check (`Building` between 1 and 5),
    `Floor` int not null check (`Floor` >= 1),
    `Name` varchar(20) not null unique check(`Name` <> N'')
);



-- ===== SELECTS ===== --
-- * все поля
SELECT * FROM `Doctors`;

SELECT * FROM Doctors WHERE Id = 3;

SELECT * FROM Doctors ORDER BY `Premium` ASC;
-- ORDER BY сортировка по Премии
SELECT * FROM Doctors ORDER BY `Premium` DESC;
-- доктора с премией больше 900 и меньше 1500
SELECT * FROM Doctors WHERE `Premium` > 900 and `Premium` < 1500;

SELECT * FROM Doctors WHERE `Premium` < 900 or `Premium` >= 1500;
-- <> НЕ РАВНО
SELECT * FROM Doctors WHERE `Surname` <> 'Mask';
-- BETWEEN - доктора в диапазоне
SELECT * FROM Doctors WHERE `Salary` BETWEEN 4000 and 5000;
-- Отоброзить столбцы (поля) в другом порядке
SELECT `Salary`, `Surname`, `Phone`, `Name`, `Id` FROM Doctors;
-- LIMIT ограничивает вывод
SELECT * FROM Doctors LIMIT 3;

SELECT * FROM Doctors ORDER BY Premium LIMIT 2;
-- AS
SELECT `Name` AS 'doctor name', Surname AS 'doctor last name' FROM Doctors;

SELECT `Name`, Surname, Premium*3 FROM Doctors;

SELECT `Name`, Surname, Salary/Premium FROM Doctors;
