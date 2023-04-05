USE Academy;
-- 1 Вывести таблицу кафедр, но расположить ее поля в обратном порядке.
select `name`,`dean`,`id_faculties` from faculties;
-- 6 Вывести названия кафедр,фонд финансирования которых меньше 11000 или больше 25000.
select *from departments WHERE `financing`<11000 OR `financing`>25000;
-- 7 Вывести названия факультетов кроме факультета “Computer Science”.
select*from faculties where name<> 'Computer Science';
-- 8 Вывести фамилии и должности преподавателей, которые не являются профессорами.
select `surname`, `position` from teachers where isProfessor=0;
-- 9 Вывести фамилии, должности, ставки и надбавки ассистентов, у которых надбавка в диапазоне от 160 до 550.
select `surname`,`position`,`salary`,`premium` from teachers where `isAssistant`=1 and `premium`>=160 and `premium`<550;
-- 10 Вывести фамилии и ставки ассистентов
select `surname`,`salary` from teachers where isAssistant=1;
-- 11 Вывести фамилии и должности преподавателей, которые были приняты на работу до 01.01.2000.
select *from teachers where employmentDate<'2000-01-01';
-- 13 Вывести фамилии ассистентов, имеющих зарплату (сумма ставки и надбавки) не более 1200.
select `surname` from teachers where isAssistant=1 and  teachers.salary+teachers.premium<=1200;
-- 14 Вывести названия групп 5-го курса, имеющих рейтинг в диапазоне от 2 до 4.
select `name` from `groups` where groups.year=5 and rating>=2 and rating<=4;
-- 15 Вывести фамилии ассистентов со ставкой меньше 550 или надбавкой меньше 200.
select `surname`from teachers where isAssistant=true ORDER BY salary<550 or premium<200;