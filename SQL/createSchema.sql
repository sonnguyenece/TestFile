alter session set "_ORACLE_SCRIPT"=true;
create user demo identified by demo;
grant resource to demo;
grant connect to demo;
grant create view to demo;
grant create session to demo;
grant unlimited tablespace to demo;

select * from SYS.DBA_USERS ;