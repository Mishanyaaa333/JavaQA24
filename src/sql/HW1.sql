CREATE SCHEMA `academy` ;
USE academy;
CREATE TABLE `groups`(
    id_groups INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(10) NOT NULL CHECK (`name` != '') UNIQUE,
    rating INT NOT NULL CHECK (`rating` >0 AND `rating` <5),
    `year` INT NOT NULL CHECK (`year` BETWEEN 1 AND 5)
);
CREATE TABLE `departments`(
    id_departments INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    `financing` DECIMAL(10,2) NOT NULL CHECK (`financing` >=0) DEFAULT 0,
    `name` VARCHAR (100) NOT NULL CHECK (`name`!= '') UNIQUE
);
CREATE TABLE `faculties`(
    id_faculties INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    `dean`VARCHAR (10) NOT NULL CHECK (`dean` != ''),
    `name` VARCHAR(100) NOT NULL CHECK (`name` != '') UNIQUE
);
CREATE TABLE `teachers`(
    id_teachers INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    `employmentDate` DATE NOT NULL CHECK (`employmentDate` > '1990-01-01'),
    `isAssistant` BIT NOT NULL DEFAULT 0,
    `isProfessor` BIT NOT NULL DEFAULT 0,
    `name` VARCHAR (255) NOT NULL CHECK (`name` != ''),
    `position` VARCHAR(255) NOT NULL CHECK ( `position` != ''),
    `premium` DECIMAL (10,2) NOT NULL CHECK (`premium` > 0) DEFAULT 0,
    `salary` DECIMAL (10,2) NOT NULL CHECK (`salary` > 0),
    `surname` VARCHAR (255) NOT NULL CHECK (`surname` != '')
);
SELECT * FROM departments;