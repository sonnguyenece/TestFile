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
and LEFT_DATETIME < to_date(:toDatw,'yy-mm-dd')


