USE academy;
-- #1
SELECT COUNT(teachers.name) FROM teachers
INNER JOIN lectures l on teachers.id_teachers = l.teacherId
INNER JOIN grouplectures g on l.Id = g.lecturesId
INNER JOIN `groups` g2 on g.groupId = g2.id_groups
INNER JOIN departments d on g2.departmentId = d.id_departments
WHERE d.name='Software Development';

-- #2
SELECT COUNT(subjects.name) FROM subjects
INNER JOIN lectures ON lectures.subjectId = subjects.Id
INNER JOIN teachers ON teachers.id_teachers = lectures.teacherId
WHERE teachers.name= 'Dave' and teachers.surname = 'McQueen';

-- #3
SELECT COUNT(name) FROM subjects
INNER JOIN lectures l on subjects.Id = l.subjectId
WHERE lectureRoom='D201';