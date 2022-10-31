# Write your MySQL query statement below
select user_id, concat(substring(UPPER(name),1,1), substring(LOWER(name),2)) as name
from users
order by user_id
