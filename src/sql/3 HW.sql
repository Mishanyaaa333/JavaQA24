USE academy;
#===== Добовляем таблички недостающими полями =====#
#=== Добавляем поле факультет id (`FacultyId` int not null) в табличку departments ==#
ALTER TABLE `departments` ADD `facultyId` INT NOT NULL;

#=== Добавляем поле financing в табличку faculties ==#
ALTER TABLE `faculties` ADD `financing`DECIMAL(10,2) NOT NULL CHECK (`financing` >=0) DEFAULT 0;

#=== Добавляем поле departmentId в табличку groups ==#
ALTER TABLE  `groups` ADD `departmentId` INT NOT NULL;

#=== Создаем табличку `subjects` ===#
CREATE TABLE `subjects`(
`Id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
`name` VARCHAR(100) NOT NULL UNIQUE CHECK (`name` <> N'')
);
#=== Создаем табличку `lectures` ===#
CREATE TABLE `lectures`(
`Id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
`lectureRoom` VARCHAR(255) NOT NULL CHECK ( `lectureRoom` <> N''),
`subjectId` int not null,
`teacherId` int not null
);
#=== Создаем табличку `curators` ===#
CREATE TABLE `curators` (
 `Id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
 `name` VARCHAR(255) NOT NULL CHECK ( `Name`<> N''),
 `surname` VARCHAR(255) NOT NULL CHECK (`surname` <> N'')
);
#=== Создаем табличку `groupsCurators` ===#
CREATE TABLE `groupsCurators`(
 `Id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `curatorId` INT NOT NULL,
  `groupId` INT NOT NULL
);
#=== Создаем табличку `groupsLectures` ===#
CREATE  TABLE `groupLectures` (
 `Id`   INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
 `groupId` INT NOT NULL,
 `lecturesId` INT NOT NULL
);

#=== Связываем таблички ===#
ALTER TABLE `departments` ADD FOREIGN KEY (`facultyId`) REFERENCES `faculties`(`id_faculties`);
ALTER TABLE `groups` ADD FOREIGN KEY (`departmentId`) REFERENCES `departments` (id_departments);
ALTER TABLE `groupscurators` ADD FOREIGN KEY (`curatorId`) REFERENCES `curators` (Id);
ALTER TABLE `groupscurators` ADD FOREIGN KEY (`groupId`) REFERENCES `groups` (id_groups);
ALTER TABLE `grouplectures` ADD FOREIGN KEY (`groupId`) REFERENCES  `groups` (`id_groups`);
ALTER TABLE `grouplectures` ADD FOREIGN KEY (`lecturesId`) REFERENCES `lectures` (`Id`);
ALTER TABLE `lectures` ADD FOREIGN KEY (`subjectId`) REFERENCES `subjects` (`Id`);
ALTER TABLE `lectures` ADD FOREIGN KEY (`teacherId`) REFERENCES `teachers` (`id_teachers`);

#=== Задания ===#
#=== 6. Вывести названия кафедр и названия групп, которые к ним относятся.
SELECT departments.`name`, `groups`.`name` FROM `departments`, `groups`
WHERE `groups`.departmentId = `departments`.id_departments;

#=== 7. Вывести названия дисциплин, которые читает преподаватель “Samantha Adams”.
SELECT `subjects`. name,`teachers`.name, `teachers`.surname  FROM `subjects`, `teachers`, `lectures`
WHERE subjects.Id = `lectures`.subjectId
AND `teachers`.id_teachers = `lectures`.teacherId AND `teachers`.name = 'Samantha' AND `teachers`.surname = 'Adams';

#=== 9. Вывести названия групп, которые относятся к факультету “Computer Science”.
SELECT `groups`.name, `faculties`.name FROM `groups`, `faculties`, `departments`
WHERE `groups`.departmentId = `departments`.id_departments
AND `departments`.facultyId = `faculties`.id_faculties AND `faculties`.name = 'Computer Science';

#=== 10. Вывести названия групп 5-го курса, а также название факультетов, к которым они относятся.
SELECT `groups`.name, `faculties`.name FROM `groups`, `faculties`, `departments`
WHERE `groups`.departmentId = `departments`.id_departments
AND `departments`.facultyId = `faculties`.id_faculties AND `groups`.year = 5;

#=== 11. Вывести полные имена преподавателей и лекции, которые они читают (названия дисциплин и групп), причем отобрать
#=== только те лекции, которые читаются в аудитории “B103”.
SELECT `teachers`.name, `teachers`.surname, `subjects`.name, `groups`.name, `lectureRoom`
FROM `teachers`, `lectures`, `subjects`, `groups`, `grouplectures`
WHERE `lectures`.teacherId = `teachers`.id_teachers AND `lectures`.subjectId = `subjects`.Id
AND `groupLectures`.groupId = `groups`.id_groups AND `groupLectures`.lecturesId = `lectures`.Id
AND `lectureRoom` = 'B103';

