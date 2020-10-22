-- Lấy các giá trị có hirded_date trong vòng 12 tháng đã qua
SELECT *
FROM EMPLOYEE
WHERE MONTHS_BETWEEN(SYSDATE, HIRED_DATE) < 12;

-- lấy tất cả giá trị có left_DATETIME ngoài 12 tháng tới
SELECT *
FROM EMPLOYEE
WHERE MONTHS_BETWEEN(LEFT_DATETIME, SYSDATE) > 12;

-- Lấy các giá trị có left_DATETIME trong vòng 12 tháng tới
SELECT *
FROM EMPLOYEE
WHERE MONTHS_BETWEEN(LEFT_DATETIME, SYSDATE) <= 12
  and MONTHS_BETWEEN(LEFT_DATETIME, SYSDATE) >= 0;

SELECT HIRED_DATE,ADD_MONTHS(HIRED_DATE,1) ADDMONTHS,
       LEFT_DATETIME,ADD_MONTHS(LEFT_DATETIME,-2) MINUSMONTHS from EMPLOYEE;

-- Lấy ngày tháng năm từ date hoặc timestamp
SELECT EXTRACT(day FROM LEFT_DATETIME)  FROM  EMPLOYEE
union
SELECT EXTRACT(year FROM LEFT_DATETIME)  FROM  EMPLOYEE
union
SELECT EXTRACT(month FROM LEFT_DATETIME)  FROM  EMPLOYEE;

-- Lấy các giá trị trong 1 năm (2020)
select * from EMPLOYEE
where extract(year from LEFT_DATETIME) =2020;

-- Lấy các giá trị với date trong giới hạn fromDate_toDate
select * from EMPLOYEE
where LEFT_DATETIME > to_date(:fromDate,'YY-MM-DD')
and LEFT_DATETIME < to_date(:toDatw,'yy-mm-dd');


-- Lay ngay trong tuan tu date
SELECT TO_CHAR(to_date('22-10-2020', 'dd-mm-yyyy'), 'DAY') day,
       TO_CHAR(timestamp '2020-10-22 07:07:07', 'MONTH')   month,
       TO_CHAR(date '2020-10-22', 'YEAR')                  year,
       TO_CHAR(CURRENT_DATE, 'DAY')                        current_DAY
FROM dual;

-- Dùng to_date có thể dinh dạng date nhập vào
-- Dùng date thì phải nhập vào theo định dạng yyyy-mm-dd
-- Dual là 1 bảng có sẵn trong schema SYS , nó ko có dữ liệu, là 1 dumb table


-- định dạng date
SELECT To_char (sysdate, 'day, ddth month yyyy') from DUAL
UNION
Select TO_CHAR(CURRENT_DATE,'yyyy-MON-mm') from DUAL;

-- lấy ra ngày thứ 6 dau tien cách 2 tháng so với ngày hiện tại theo định dạng cho trc
select
    (case
         when to_char((ADD_MONTHS(sysdate,2)+6),'DY') ='FRI' then TO_CHAR(ADD_MONTHS(sysdate,2)+6,'yyyy-MON-dd')
         when to_char((ADD_MONTHS(sysdate,2)+5),'DY') ='FRI' then TO_CHAR(ADD_MONTHS(sysdate,2)+5,'yyyy-MON-dd')
         when to_char((ADD_MONTHS(sysdate,2)+4),'DY') ='FRI' then TO_CHAR(ADD_MONTHS(sysdate,2)+4,'yyyy-MON-dd')
         when to_char((ADD_MONTHS(sysdate,2)+3),'DY') ='FRI' then TO_CHAR(ADD_MONTHS(sysdate,2)+3,'yyyy-MON-dd')
         when to_char((ADD_MONTHS(sysdate,2)+2),'DY') ='FRI' then TO_CHAR(ADD_MONTHS(sysdate,2)+2,'yyyy-MON-dd')
         when to_char((ADD_MONTHS(sysdate,2)+1),'DY') ='FRI' then TO_CHAR(ADD_MONTHS(sysdate,2)+1,'yyyy-MON-dd')
         when to_char((ADD_MONTHS(sysdate,2)+1),'DY') ='FRI' then TO_CHAR(ADD_MONTHS(sysdate,2)+1,'yyyy-MON-dd')
        end
        )
from dual;

-- Lấy giá trị mà có thời gian làm việc 100 ngày
-- TO_DATE : dùng để chuyển 1 định dạng khác sang date.syntax todate(STRING,formatDATE)
-- TO_CHAR: Chuyển về định dạng mình mong muốn
select * from EMPLOYEE
where TO_DATE(TO_CHAR(LEFT_DATETIME,'yyyy-mm-dd'),'yyyy-mm-dd') -HIRED_DATE>100;

