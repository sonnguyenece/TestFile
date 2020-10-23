-- Tính value hàng tuần bắt đầu từ thứ 2 kết thúc vào chủ nhật

WITH lASTEST_MONDAY AS (
    SELECT (CASE
                WHEN (TO_CHAR(DAY, 'DY') = 'MON') THEN TO_CHAR(DAY, 'yyyy-mm-dd DY')
                WHEN (TO_CHAR(DAY, 'DY') = 'TUE') THEN TO_CHAR(DAY - 1, 'yyyy-mm-dd DY')
                WHEN (TO_CHAR(DAY, 'DY') = 'WED') THEN TO_CHAR(DAY - 2, 'yyyy-mm-dd DY')
                WHEN (TO_CHAR(DAY, 'DY') = 'THU') THEN TO_CHAR(DAY - 3, 'yyyy-mm-dd DY')
                WHEN (TO_CHAR(DAY, 'DY') = 'FRI') THEN TO_CHAR(DAY - 4, 'yyyy-mm-dd DY')
                WHEN (TO_CHAR(DAY, 'DY') = 'SAT') THEN TO_CHAR(DAY - 5, 'yyyy-mm-dd DY')
                WHEN (TO_CHAR(DAY, 'DY') = 'SUN') THEN TO_CHAR(DAY - 6, 'yyyy-mm-dd DY')
        END) MONDAY,
           DAY,
           VALUE
    FROM BILL
)
SELECT MONDAY, SUM(VALUE) weekly_value
FROM lASTEST_MONDAY
group by MONDAY
order by MONDAY desc;