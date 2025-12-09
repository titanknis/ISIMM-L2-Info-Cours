-- ex3

DROP TABLE PROJECT CASCADE CONSTRAINTS;
DROP TABLE DEPT CASCADE CONSTRAINTS;
DROP TABLE EMP CASCADE CONSTRAINTS;
DROP TABLE PARTICIPATION CASCADE CONSTRAINTS;
set linesize 500;

-- Ex1

-- 1.
CREATE TABLE PROJECT(
    CodeP number,
    NomP varchar2(30),
    CONSTRAINT pk_PROJECT PRIMARY KEY(CodeP)
);

CREATE TABLE DEPT(
    NumDept number,
    NomDept varchar2(30),
    Lieu varchar(30),
    directeur number,
    CONSTRAINT pk_DEPT PRIMARY KEY(NumDept)
);

CREATE TABLE EMP(
    Matr number,
    NomE varchar2(30),
    Poste varchar2(30),
    DateEmb date,
    Sup number,
    Salaire number,
    Comm number,
    NumDept number,
    CONSTRAINT pk_EMP PRIMARY KEY(Matr),
    CONSTRAINT fk_EMP_EMP FOREIGN KEY(Matr) REFERENCES EMP(Matr),
    CONSTRAINT fk_EMP_DEPT FOREIGN KEY(NumDept) REFERENCES DEPT(NumDept)
);


CREATE TABLE PARTICIPATION(
    Matr number,
    CodeP number,
    Fonction varchar2(30),
    CONSTRAINT fk_PARTICIPATION_EMP FOREIGN KEY(Matr) REFERENCES EMP(Matr),
    CONSTRAINT fk_PARTICIPATION_DEPT FOREIGN KEY(CodeP) REFERENCES PROJECT(CodeP),
    CONSTRAINT pk_PARTICIPATION PRIMARY KEY(Matr,CodeP)
);

-- 2.
INSERT INTO PROJECT VALUES(0,'sarou5');
INSERT INTO PROJECT VALUES(1,'tayara');
INSERT INTO PROJECT VALUES(2,'karhba');
INSERT INTO PROJECT VALUES(3,'batinda');
INSERT INTO PROJECT VALUES(4,'isimm');

INSERT INTO DEPT VALUES(0,'TITAN','sousse',0);
INSERT INTO DEPT VALUES(1,'robin','sousse',0);
INSERT INTO DEPT VALUES(2,'batman','sousse',0);
INSERT INTO DEPT VALUES(3,'spiderman','sousse',0);
INSERT INTO DEPT VALUES(4,'ben10','sousse',1);

INSERT INTO EMP VALUES(0,'rayen','boss','01/APR/1925',0,1000,0,0);
INSERT INTO EMP VALUES(1,'rayen junior','boss junior','01/APR/2025',0,1000,0,1);
INSERT INTO EMP VALUES(2,'rayen 1','boss junior','01/JUN/3025',0,3000000,0,2);
INSERT INTO EMP VALUES(3,'rayen 2','boss junior','01/JUL/4025',0,3000000,0,4);
INSERT INTO EMP VALUES(4,'rEyen 3','boss junior','01/AUG/4025',0,300,0,4);

INSERT INTO PARTICIPATION VALUES(0,4,'hello world');
INSERT INTO PARTICIPATION VALUES(1,3,'hello world');
INSERT INTO PARTICIPATION VALUES(2,2,'hello world');
INSERT INTO PARTICIPATION VALUES(3,1,'hello world');
INSERT INTO PARTICIPATION VALUES(4,0,'hello world');

-- ex1

drop user user1;
drop user user2;

-- 2. 
create user user1 identified by password1;
create user user2 identified by password2;

-- 3. 
grant create session to user1;
grant create session to user2;

grant all on dept to user1;

-- 4. 
grant select on emp to user1;

-- 5. 
connect user1/password1@localhost:1521;

-- 6. 
select * from system.dept;

-- 7. 
INSERT INTO system.DEPT VALUES(5,'walid','matmata',1);

-- 8. 
update system.dept 
set nomdept='mohsine' 
where numdept=5;

-- 9. 
delete from system.dept where numdept=5;

-- 10. 
connect system/oracle@localhost:1521;
revoke insert on dept from user1;

-- 11. 
connect user1/password1@localhost:1521;
INSERT INTO system.DEPT VALUES(5,'taoufik','sayada',1);

-- 12. 
select * from system.emp; 

-- 13. 
connect user2/password2@localhost:1521;

-- 14. 
select * from system.emp; 

-- 15. 
connect system/oracle@localhost:1521;
drop user user2;

-- ex2


