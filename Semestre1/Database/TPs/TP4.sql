DROP TABLE Types CASCADE CONSTRAINTS;
DROP TABLE Segment CASCADE CONSTRAINTS;
DROP TABLE Salle CASCADE CONSTRAINTS;
DROP TABLE Poste CASCADE CONSTRAINTS;
DROP TABLE Logiciel CASCADE CONSTRAINTS;
DROP TABLE Installation CASCADE CONSTRAINTS;

CREATE TABLE Types (
    codeType varchar2(9),
    libelleType varchar2(20),
    CONSTRAINT pk_Types PRIMARY KEY(codeType)
);
CREATE TABLE Segment (
    indIP varchar2(11),
    nomSegment varchar2(20) not null,
    etage number(2),
    CONSTRAINT pk_Segment PRIMARY KEY(indIP)
);
CREATE TABLE Salle (
    nSalle varchar2(7),
    nomSalle varchar2(20) not null,
    nbPostes number(2),
    indIP varchar2(11),
    CONSTRAINT pk_Salle PRIMARY KEY(nSalle),
    CONSTRAINT fk_Salle_Segment FOREIGN KEY (indIP) REFERENCES Segment(indIP)
);
CREATE TABLE Poste (
    nPoste varchar2(7),
    nomPoste varchar2(20) not null,
    ad varchar2(3),
    typePoste varchar2(9),
    nSalle varchar2(20),
    CONSTRAINT pk_Poste PRIMARY KEY(nPoste),
    CONSTRAINT ck_ad CHECK( ad between 0 and 255 ),
    CONSTRAINT fk_Poste_Salle FOREIGN KEY(nSalle) REFERENCES Salle(nSalle)
);
CREATE TABLE Logiciel(
    nLog varchar2(5),
    nomLog varchar2(20) not null,
    dateAch date,
    typeLog varchar2(9),
    prix number(6,2),
    CONSTRAINT pk_Logiciel PRIMARY KEY(nLog),
    CONSTRAINT ck_prix CHECK(prix>=0)
);
CREATE TABLE Installation (
    nPoste varchar2(7),
    nLog varchar2(5),
    numIns number(5),
    dateIns date default SYSDATE,
    CONSTRAINT pk_Installation PRIMARY KEY(nPoste,nLog),
    CONSTRAINT fk_Installation_Poste FOREIGN KEY(nPoste) REFERENCES Poste(nPoste),
    CONSTRAINT fk_Installation_Logiciel FOREIGN KEY(nLog) REFERENCES Logiciel(nLog)
);
