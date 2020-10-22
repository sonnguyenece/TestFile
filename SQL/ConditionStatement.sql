select e.HIRED_DATE,
           (case extract(year from HIRED_DATE)
                when extract(year from  ADD_MONTHS(SYSDATE,-12)) then 'ONE YEAR'
                when extract(year from  ADD_MONTHS(SYSDATE,0)) then 'ONE YEAR'
                when extract(year from  ADD_MONTHS(SYSDATE,-24)) then 'TWO YEARS'
                else 'OLD_GHOST'
            end) LISTS
from EMPLOYEE e;


