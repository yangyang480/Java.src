#2
SELECT 
    d.name AS 'Department Name',
    COUNT(c.id) AS 'Number of Courses'
FROM department d
/*Since the course can be null, we need to use left join*/
LEFT JOIN course c ON d.id = c.deptId 
GROUP BY d.id
ORDER BY 
    COUNT(c.id) ASC,
    d.name ASC;
    
#3
SELECT 
    c.name AS 'Course Name',
    COUNT(sc.courseId) AS 'Number of Students'
FROM course c
LEFT JOIN studentCourse sc ON sc.courseId = c.id
GROUP BY c.name
/* group by courses */
ORDER BY 
    COUNT(sc.courseId) DESC,
    c.name ASC;
    
#4
SELECT 
    c.name AS 'Course Name'
FROM course c
LEFT JOIN facultyCourse fc ON fc.courseId = c.id
GROUP BY c.name
/* group by name and having those courseId are 0*/
HAVING COUNT(fc.courseId) = 0
ORDER BY c.name ASC;

#5
SELECT 
    c.name AS 'Course Name',
    COUNT(sc.studentId) AS 'Number of Students'
FROM course c
LEFT JOIN studentCourse sc ON c.id = sc.courseId
LEFT JOIN facultyCourse fc ON c.id = fc.courseId
/* since we need to find no assigned faculty, we need to group by again.*/
GROUP BY (c.name)
HAVING COUNT(fc.courseId) = 0
ORDER BY
    COUNT(sc.studentId) DESC,
    c.name ASC;
    
#6
SELECT
    COUNT(y.id) AS 'Students',
    y.Year
FROM (
    /* Get all students and their distinct years */
    SELECT DISTINCT
        YEAR(sc.startDate) as Year,
        s.id
    FROM student s
    INNER JOIN studentCourse sc ON s.id = sc.studentId
) y
/* Use distinct list and group by year */
GROUP BY y.Year
ORDER BY
    y.Year ASC,
    COUNT(y.id) DESC;
    
#7
SELECT
    y.startDate,
    COUNT(y.id) AS 'Students'
FROM (
    /* Get all students and their distinct date where month is August */
    SELECT DISTINCT
        sc.startDate,
        s.id
    FROM studentCourse sc
    INNER JOIN student s ON s.id = sc.studentId
    WHERE MONTH(sc.startDate) = 8
) y
/* Use distinct list and group by date */
GROUP BY y.startDate
ORDER BY
    y.startDate ASC,
    COUNT(y.id) ASC;
    
#8
SELECT
    s.firstName AS 'First Name',
    s.lastName AS 'Last Name',
    COUNT(c.id) AS 'Number of Courses'
FROM student s
/* we need 4 tables totally */
INNER JOIN department d ON d.id = s.majorId
INNER JOIN studentCourse sc ON sc.studentId = s.id
INNER JOIN course c ON c.id = sc.courseId
    AND c.deptId = d.Id
GROUP BY s.firstName, s.lastName
ORDER BY
    COUNT(c.id) DESC,
    s.firstName ASC,
    s.lastName ASC;
    
#9.
SELECT
    s.firstname AS 'First Name',
    s.lastname AS 'Last Name',
    ROUND(AVG(sc.progress), 1) AS 'Average Progress'
FROM student s
LEFT JOIN studentCourse sc on sc.studentId = s.Id
GROUP BY s.firstname, s.lastname
/* We need the students who are less than 50% */
HAVING AVG(sc.progress) < 50
ORDER BY
    ROUND(AVG(sc.progress), 1) DESC,
    s.firstname ASC,
    s.lastname ASC;
    
#10
SELECT
    c.name AS 'Course Name',
    ROUND(AVG(sc.progress), 1) AS 'Average Progress'
FROM course c
LEFT JOIN studentCourse sc ON sc.courseId = c.id
/* group by id since they might have same name */
GROUP BY c.id
ORDER BY
    ROUND(AVG(sc.progress), 1) DESC,
    c.name ASC;

#11
SELECT
    c.name,
    ROUND(AVG(sc.progress), 1)
FROM course c
INNER JOIN studentCourse sc ON sc.courseId = c.id
GROUP BY c.name
/* we can get all the avg progress from highest to lowest */
ORDER BY ROUND(AVG(sc.progress), 1) DESC
LIMIT 1;

# 12
SELECT 
    f.firstname AS 'First Name',
    f.lastname  AS 'Last Name',
    ROUND(AVG(sc.progress),1) AS 'Average Progress'
FROM faculty f
LEFT JOIN facultycourse fc ON fc.facultyId = f.id
LEFT JOIN studentcourse sc ON sc.courseId = fc.courseId
GROUP BY f.id
ORDER BY 
    ROUND(AVG(sc.progress),1) DESC,
    f.firstname ASC,
    f.lastname ASC;
    
#13
SELECT 
    f.firstname AS 'First Name',
    f.lastname AS 'Last Name',
    ROUND(AVG(sc.progress), 1) AS 'Average Progress'
FROM studentcourse sc
INNER JOIN facultycourse fc USING (courseId)
INNER JOIN faculty f ON f.id = fc.facultyId
GROUP BY f.id
HAVING AVG(sc.progress) >= ( /* need a subquery that we will can get 90% of max avg progress */
    (SELECT AVG(sc.progress) FROM studentcourse sc
    GROUP BY sc.courseId
    ORDER BY AVG(sc.progress) DESC
    LIMIT 1) * 0.9)
ORDER BY 
    ROUND(AVG(sc.progress), 1) DESC,
    f.firstname ASC,
    f.lastname ASC;
    
#14
SELECT
    s.firstname AS 'First Name',
    s.lastname AS 'Last Name',
    CASE
        WHEN MIN(sc.progress) < 40 THEN 'F'
        WHEN MIN(sc.progress) < 50 THEN 'D'
        WHEN MIN(sc.progress) < 60 THEN 'C'
        WHEN MIN(sc.progress) < 70 THEN 'B'
        ELSE 'A'
    END AS 'Minimum Grade',
    CASE 
        WHEN MAX(sc.progress) < 40 THEN 'F'
        WHEN MAX(sc.progress) < 50 THEN 'D'
        WHEN MAX(sc.progress) < 60 THEN 'C'
        WHEN MAX(sc.progress) < 70 THEN 'B'
        ELSE 'A'
    END AS 'Maximum Grade'
FROM student s
LEFT JOIN studentcourse sc ON sc.studentId = s.id
GROUP BY s.id
ORDER BY 
    CASE
        WHEN MIN(sc.progress) < 40 THEN 'F'
        WHEN MIN(sc.progress) < 50 THEN 'D'
        WHEN MIN(sc.progress) < 60 THEN 'C'
        WHEN MIN(sc.progress) < 70 THEN 'B'
        ELSE 'A'
    END DESC,
    CASE 
        WHEN MAX(sc.progress) < 40 THEN 'F'
        WHEN MAX(sc.progress) < 50 THEN 'D'
        WHEN MAX(sc.progress) < 60 THEN 'C'
        WHEN MAX(sc.progress) < 70 THEN 'B'
        ELSE 'A'
    END DESC,
    s.firstname ASC,
    s.lastname ASC;

