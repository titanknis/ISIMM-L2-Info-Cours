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

INSERT INTO EMP VALUES(0,'rayen','boss','01/APR/1925',0,30000000,0,0);
INSERT INTO EMP VALUES(1,'rayen junior','boss junior','01/APR/2025',0,3000000,0,1);
INSERT INTO EMP VALUES(2,'rayen 1','boss junior','01/JUN/3025',0,3000000,0,2);
INSERT INTO EMP VALUES(3,'rayen 2','boss junior','01/JUL/4025',0,3000000,0,3);
INSERT INTO EMP VALUES(4,'rEyen 3','boss junior','01/AUG/4025',0,300,0,4);

INSERT INTO PARTICIPATION VALUES(0,4,'hello world');
INSERT INTO PARTICIPATION VALUES(1,3,'hello world');
INSERT INTO PARTICIPATION VALUES(2,2,'hello world');
INSERT INTO PARTICIPATION VALUES(3,1,'hello world');
INSERT INTO PARTICIPATION VALUES(4,0,'hello world');

ALTER TABLE DEPT
ADD CONSTRAINT fk_DEPT_EMP FOREIGN KEY(directeur) REFERENCES EMP(Matr);

-- 7.
ALTER TABLE EMP
     add (Adresse varchar2(30) default 'Monastir');

-- 8.
-- method 1
INSERT INTO EMP(Matr,NomE,Poste,DateEmb,Sup,Salaire,Comm,NumDept) VALUES(5,'knis','CEO','01/JUN/2005',0,30000000,0,0);
-- method 2
INSERT INTO EMP VALUES(6,'knis','CEO','01/JUN/2005',0,30000000,0,0,null);

DESCRIBE EMP;
-- 9.
ALTER TABLE EMP
     modify (Adresse varchar2(10));

-- 10.
DESCRIBE EMP;

-- 11.
ALTER TABLE EMP
     DROP COLUMN Adresse;
desc EMP;
-- 12. 

UPDATE DEPT
    SET lieu='Sousse'
    WHERE numDept=(select min(numDept) from DEPT);

-- 13. 
UPDATE EMP
    SET Salaire=Salaire*1.1
    WHERE Salaire>=1500;
-- 14.
UPDATE EMP
    SET numDept=(SELECT max(numDept) FROM DEPT)
    WHERE Salaire<1000;


-- Ex2


-- 1. 
select numDept,nomDept from DEPT order by nomDept;
-- 2. 
select Matr from EMP;
-- 3. 
select Matr,NomE,Sup from EMP where numDept=20;
-- 4.
select * from PROJECT order by CodeP;
-- 5. 
-- pas comprener le question
SELECT pa.Matr,pa.CodeP,e.NomE FROM EMP e, PARTICIPATION pa
WHERE e.Matr=pa.Matr 
group by pa.Matr,pa.CodeP,NomE;
-- 6. 
select Poste from emp where Salaire>13000;
-- 7. 
SELECT DISTINCT Poste FROM EMP;
-- 8. 
select * from emp where nvl(Salaire,0)<Comm;
-- 9. 
select * from emp where Comm is null;

-- 10. 
select * from emp where NomE like '_E%';
select * from emp where substr(NomE,2,1)='E';

-- 11. 
select DISTINCT numDept from emp where Comm is not null;
-- 12. 
select NomE from emp where Salaire between 6000 and 10000;
-- 13.
select NomE from emp where Matr not in (select Matr from PARTICIPATION);
-- 14.
select NomP from PROJECT where CodeP not in (select CodeP from PARTICIPATION);
-- 15. 
select d.numDept 
from DEPT d 
join emp e on d.numDept=e.numDept 
join PARTICIPATION p on p.Matr=e.Matr
group by d.numDept,nomDept
having count(distinct CodeP)=(select count(*) from PROJECT);
-- 15. correction
select numDept 
from EMP where in (

)

group by numDept;



-- Ex3


DROP TABLE PROJECT CASCADE CONSTRAINTS;
DROP TABLE DEPT CASCADE CONSTRAINTS;
DROP TABLE EMP CASCADE CONSTRAINTS;
DROP TABLE PARTICIPATION CASCADE CONSTRAINTS;

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

INSERT INTO EMP VALUES(0,'rayen','boss','01/APR/1925',0,30000000,0,0);
INSERT INTO EMP VALUES(1,'rayen junior','boss junior','01/APR/2025',0,3000000,0,1);
INSERT INTO EMP VALUES(2,'rayen 1','boss junior','01/JUN/3025',0,3000000,0,2);
INSERT INTO EMP VALUES(3,'rayen 2','boss junior','01/JUL/4025',0,3000000,0,3);
INSERT INTO EMP VALUES(4,'rayen 3','boss junior','01/AUG/4025',0,3000000,0,4);

INSERT INTO PARTICIPATION VALUES(0,4,'hello world');
INSERT INTO PARTICIPATION VALUES(1,3,'hello world');
INSERT INTO PARTICIPATION VALUES(2,2,'hello world');
INSERT INTO PARTICIPATION VALUES(3,1,'hello world');
INSERT INTO PARTICIPATION VALUES(4,0,'hello world');

ALTER TABLE DEPT
ADD CONSTRAINT fk_DEPT_EMP FOREIGN KEY(directeur) REFERENCES EMP(Matr);

-- 7.
ALTER TABLE EMP
     add (Adresse varchar2(30) default 'Monastir');

-- 8.
-- method 1
INSERT INTO EMP(Matr,NomE,Poste,DateEmb,Sup,Salaire,Comm,NumDept) VALUES(5,'knis','CEO','01/JUN/2005',0,30000000,0,0);
-- method 2
INSERT INTO EMP VALUES(6,'knis','CEO','01/JUN/2005',0,30000000,0,0,null);

DESCRIBE EMP;
-- 9.
ALTER TABLE EMP
     modify (Adresse varchar2(10));

-- 10.
DESCRIBE EMP;

-- 11.
ALTER TABLE EMP
     DROP COLUMN Adresse;
desc EMP;


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

ALTER TABLE DEPT
ADD CONSTRAINT fk_DEPT_EMP FOREIGN KEY(directeur) REFERENCES EMP(Matr);

-- 1.
select Matr,count(CodeP) from PARTICIPATION  
group by Matr;

-- 2.
select Matr,count(CodeP) from PARTICIPATION 
group by Matr 
having count(CodeP)>2;

-- 3.
select e.Matr,count(CodeP) from PARTICIPATION p, EMP e
where e.Matr=p.Matr 
and Salaire between 600 and 1000
group by e.Matr;

-- 4.
select e.Matr,count(CodeP),NumDept from PARTICIPATION p, emp e
where p.Matr=e.Matr
and NumDept in 
    (select NumDept from EMP 
        group by NumDept 
        having count(Matr)=
        (select max(count(Matr)) 
            from EMP 
            group by NumDept
        )
    )
group by e.Matr,NumDept;

-- 5.
select Matr,count(CodeP) nbr_project from PARTICIPATION 
where Matr in (select Sup from EMP)
group by Matr;

-- 6. 

