delete 
from Person
where id not in 
(select min(id) 
 from (select id as id, email as email from Person) as id
 group by email
 having count(*) >= 1
);


