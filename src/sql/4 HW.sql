USE academy;

#=== 10. Вывести названия групп 5-го курса, а также название факультетов, к которым они относятся.
SELECT `groups`.name, `faculties`.name FROM `groups`, `faculties`, `departments`
WHERE `groups`.departmentId = `departments`.id_departments
  AND `departments`.facultyId = `faculties`.id_faculties AND `groups`.year = 5;


#=== 11. Вывести полные имена преподавателей и лекции, которые они читают (названия дисциплин и групп), причем отобрать
#===     только те лекции, которые читаются в аудитории “B103”.
SELECT `teachers`.name, `teachers`.surname, `subjects`.name, `groups`.name, `lectureRoom`
FROM `teachers`, `lectures`, `subjects`, `groups`, `grouplectures`
WHERE `lectures`.teacherId = `teachers`.id_teachers AND `lectures`.subjectId = `subjects`.Id
  AND `groupLectures`.groupId = `groups`.id_groups AND `groupLectures`.lecturesId = `lectures`.Id
  AND `lectureRoom` = 'B103';
