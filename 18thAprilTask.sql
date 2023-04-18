--To write a  Cursor to display the list of employees who are Working as a Managers or Analyst.
set serveroutput on;
declare
    emprecord emp%rowtype;
    cursor mycur is select * from emp where job in('MANAGER','ANALYST');
begin
    open mycur;
    loop
    fetch mycur into emprecord;
    exit when mycur%NOTFOUND;    
    dbms_output.put_line(emprecord.ename || ' ' || emprecord.empno || ' ' || emprecord.job);
    end loop;
    close mycur;
end;
/

--Write PL/SQL code in Cursor to display employee names and salary
set serveroutput on;
declare
    emprecord emp%rowtype;
    cursor mycur is select * from emp;
begin
    open mycur;
     dbms_output.put_line('--EMP NAME--'|| ' ' || '--EMP NO--' || ' ' || '--SALARY--');
    loop
    fetch mycur into emprecord;
    exit when mycur%NOTFOUND;   
    dbms_output.put_line(emprecord.ename || '   ' || emprecord.empno || '   ' || emprecord.sal);
    end loop;
    close mycur;
end;
/

--Write PL/SQL code in Procedure to find the Reverse of the  number



set serveroutput on;
declare
    originalNo number(5) := &EnterempNumber;
    reverseNo number(5) := 0;
    
begin
    dbms_output.put_line('Reverse a Number');
 
    while originalNo > 0 loop
    reverseNo:= (reverseNo*10)+mod(originalNo,10);
    originalNo:=floor(originalNo/10);
    end loop;
    
   dbms_output.put_line(reverseNo);
end;
/

--Parameterized cursor
set serveroutput on;
declare    
    cursor mycur(job varchar2:= '') is select * from emp where job in('MANAGER','ANALYST');
    emprecord emp%rowtype;
begin
    open mycur;
    loop
    fetch mycur into emprecord;
    exit when mycur%NOTFOUND;
    dbms_output.put_line(emprecord.job);
    end loop;
    close mycur;
end;
/
