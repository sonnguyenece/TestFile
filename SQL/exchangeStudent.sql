WITH Table_Odd as (
    SELECT id + 1 as oddId, student "student"
    FROM seat
    WHERE MOD(id, 2) = 1
      AND (id<(SELECT MAX(id) FROM SEAT WHERE MOD(ID, 2) = 0)
        )
),
     Table_Even as (
         SELECT id - 1 as evenId, student "student"
         FROM seat
         WHERE MOD(id, 2) = 0
     )
SELECT oddId as "id","student" as "student" FROM Table_Odd
UNION
SELECT * FROM Table_Even
UNION
SELECT * FROM SEAT s
WHERE id NOT IN(select Table_Odd.oddId from Table_Odd)
AND id NOT IN(select Table_Even.evenId from Table_Even)
;


