--Отримання всіх записів Homework
select * from Homework
--Отримання всіх записів Lesson, включаючи дані Homework
select
*
from Lesson as t
left join Homework as t1 on t.homework_id = t1.id
--Отримання всіх записів Lesson (включаючи дані Homework) відсортовані за часом оновлення
select
*
from Lesson as t
left join Homework as t1 on t.homework_id = t1.id
order by t.updatedAt
--Отримання всіх записів Schedule, включаючи дані Lesson
select
*
from Schedule as t
left join Lesson as t1 on t.lessons = t1.id
--Отримання кількості Lesson для кожного Schedule
select
    t.id,
    t.name,
    count(t1.id)
from Schedule as t
left join Lesson as t1 on t.lessons = t1.id
group by
    t.id,
    t.name