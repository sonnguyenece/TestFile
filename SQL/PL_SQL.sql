SET SERVEROUTPUT on;
declare
    VIS_ROW_ID    number ;
    inputID number:=1;
begin
    Select ID
    INTO VIS_ROW_ID
    from BILL
    where ID=inputID
    ;
-- Exception when too_many_rows then
--     Dbms_Output.put_line('Error:'||Sqlerrm);
End;



