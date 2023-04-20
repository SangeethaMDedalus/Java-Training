
--a. Create a stored function called GET_SERVICE_YRS to retrieve the total number of years of service for a specific employee.
--The function should accept the employee ID as a parameter and return the number of years of service. Add error handling to account for an invalid employee ID.
--b. Invoke the function. You can use the following data:
--EXECUTE DBMS_OUTPUT.PUT_LINE(get_service_yrs(999))
--Hint: The above statement should produce an error message because there is no employee with employee ID 999.

--EXECUTE DBMS_OUTPUT.PUT_LINE ('Approximately .... ' ||get_service_yrs(7499) || ' years')
--Hint: The above statement should be successful and return the number of years of service
--for employee with employee ID 7499


create or replace function GET_SERVICE_YRS(empNo in number)
return number
is
exp number;
begin
    dbms_output.put_line(empNo);
     select floor(months_between(sysdate,hiredate) /12) into exp from emp where empno=empNo;
     exception
     when NO_DATA_FOUND then
         dbms_output.put_line('Employee Number Does Not Exist :(' || empNo);
     return  exp; 
end GET_SERVICE_YRS;
/
EXECUTE DBMS_OUTPUT.PUT_LINE ('Approximately .... ' ||GET_SERVICE_YRS(7839) || ' years')
--select * from emp where empno =7839;
--select FLOOR((to_date(SYSDATE)-to_date(hiredate))/365)  from emp where empno=7839;
--select GET_SERVICE_YRS(7839) from emp;

create or replace package empService
 as      
      function GET_SERVICE_YRS(empNo in number) return number;
 end;
 /
 create or replace package body empService
 as
    function GET_SERVICE_YRS(empNo number)
    return number
    is
        exp number;
    begin    
     select floor(months_between(sysdate,hiredate) /12) into exp from emp where empno=empNo;
     return exp;
     EXCEPTION
     WHEN NO_DATA_FOUND THEN
         dbms_output.put_line('Employee Number Does Not Exist :(' || empNo);
    end GET_SERVICE_YRS;
end empService;
select empService.GET_SERVICE_YRS(7566) from dual;
--Create a stored procedure called UPD_SAL to update the  salaries for a specific job in the EMP table.
--Pass three parameters to the procedure: the job , a new minimum salary, and a new maximum salary for the job.
--Add exception handling to account for an invalid 
--job name in the EMP table. Also, raise an exception if the maximum salary supplied is less than the minimum salary.

create or replace procedure UPD_SALARY(job in varchar2,min in number,max in number,enam out varchar2)
as
begin
   --select ename into enam from emp where job=job and sal between min and max;
   update emp set sal = 1000 where job=job and sal between min and max;
   dbms_output.put_line(' Ename is :' || enam);
   
--exception
   -- when NO_DATA_FOUND then
       --  dbms_output.put_line('Error from Procedure . Employee Number Does Not Exist :( ');
end UPD_SALARY;
/

exec UPD_SALARY('CLERK',900,1000);
