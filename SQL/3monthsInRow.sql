select *
from BILL;

WITH THREE_MONTH_IN_ROW AS (
    SELECT CASE
               WHEN EXTRACT(MONTH FROM DAY) IN (1, 4, 7, 10) THEN 'QUÝ '||to_char(DAY,'yyyy-mm')
               WHEN EXTRACT(MONTH FROM DAY) IN (2, 5, 8, 11) THEN 'QUÝ '||to_char(add_months(DAY, -1),'yyyy-mm')
               WHEN EXTRACT(MONTH FROM DAY) IN (3, 6, 9, 12) THEN 'QUÝ '||to_char(add_months(DAY, -2),'yyyy-mm')
               END lastest3Month,
           VALUE,
           DAY
    FROM BILL
)select lastest3Month,sum(VALUE) as "3monthsvalue" from THREE_MONTH_IN_ROW
group by lastest3Month
;