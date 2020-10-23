-- Display employee and employee's manager name
select e.NAME as employee,m.NAME manager
from EMPLOYEES e,EMPLOYEES m
where  e.MANGER_ID=m.ID;

-- display manager of an employee,
with employee_manager as (
    select e.NAME as employee,m.NAME manager,m.ID managerId,m.MANGER_ID managerFatherId
    from EMPLOYEES e,EMPLOYEES m
    where  e.MANGER_ID=m.ID
)select managerId,manager,managerFatherId
from employee_manager
where :employeeName= employee;