-- ex1

DROP TABLE TACHE;
DROP TABLE ATELIER;
DROP TABLE MACHINE;
-- DROP TABLE PRODUIT;
DROP TABLE ARTICLE;
DROP TABLE CATEGORIE;
DROP TABLE EMPLOYE;
DROP synonym p1;

CREATE TABLE EMPLOYE(
    CodEmp varchar2(10),
    NomEmp varchar2(20),
    PrenEmp varchar2(20),
    Grade char not null,
    CONSTRAINT pk_EMPLOYE PRIMARY KEY(CodEmp)
);

CREATE TABLE CATEGORIE(
    NumCat numeric(8,2),
    LibCat varchar2(15),
    CONSTRAINT pk_CATEGORIE PRIMARY KEY(NumCat)
);

CREATE TABLE PRODUIT(
    NumPROD numeric(8),
    DesProd varchar2(10) unique,
    QteStock numeric(8) not null,
    NumCat numeric(8),
    CONSTRAINT pk_PRODIUT PRIMARY KEY(NumPROD),
    CONSTRAINT ck_QteStock check(QteStock>0)
);

CREATE TABLE MACHINE(
    NumMach numeric(10),
    Fonction char(15),
    CodAtelier numeric(8),
    CONSTRAINT pk_MACHINE PRIMARY KEY(NumMach)
);

CREATE TABLE ATELIER(
    CodAtelier numeric(8),
    CodeResp varchar2(10),
    Superficie decimal(7,3),
    Specialite varchar2(15),
    CONSTRAINT pk_ATELIER PRIMARY KEY(CodAtelier),
    CONSTRAINT fk_ATELIER_EMPLOYE FOREIGN KEY(CodeResp) REFERENCES EMPLOYE(CodEmp),
    constraint ck_Superficie CHECK(Superficie between 10 and 100)
);

CREATE TABLE TACHE(
    CodEmp varchar2(10),
    NumMach numeric(10),
    NumPROD numeric(8),
    DateJour date,
    NbrePiece numeric(6),
    CONSTRAINT fk_TACHE_EMPLOYE FOREIGN KEY(CodEmp) REFERENCES EMPLOYE(CodEmp),
    CONSTRAINT fk_TACHE_MACHINE FOREIGN KEY(NumMach) REFERENCES MACHINE(NumMach),
    CONSTRAINT fk_TACHE_PRODUIT FOREIGN KEY(NumPROD) REFERENCES PRODUIT(NumPROD),
    CONSTRAINT pk_TACHE primary KEY(CodEmp,NumMach,NumPROD)
);


-- ex3

alter table MACHINE
add (Etat varchar2(10) default 'VALIDE');

alter table MACHINE
add constraint ck_etat check(Etat in('VALIDE','NONVALIDE'));

alter table PRODUIT
modify (DesProd char(15));

alter table TACHE
drop constraint pk_TACHE;

alter table TACHE
add constraint pk_TACHE PRIMARY KEY(CodEmp,NumMach,NumPROD);

alter table PRODUIT
rename to ARTICLE;

alter table ATELIER
drop constraint fk_ATELIER_EMPLOYE;

create synonym p1 for EMPLOYE;

alter table EMPLOYE
drop column Grade;
