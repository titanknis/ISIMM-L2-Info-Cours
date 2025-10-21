-- DROP TABLE nomenclature;
-- DROP TABLE ordre;
DROP TABLE service;
DROP TABLE piece;

CREATE TABLE piece (
    nop numeric(10),
    designation VARCHAR(20),
    couleur VARCHAR(20),
    poids numeric(10,2)
);

CREATE TABLE service(
    nos numeric(10),
    institule VARCHAR(20),
    localisation VARCHAR(20)
);

CREATE TABLE ordre (
    nop numeric(10),
    nos numeric(10),
    quantite numeric(10)
);

CREATE TABLE nomenclature(
    nopa numeric(10),
    nopc numeric(10),
    quantite numeric(10)
);

insert into piece values(0,'mak','JAUNE','68');

select * from piece;

-- Ex2

insert into piece values(1,'knis','BLEUE','66');
insert into piece values(1,'knis','ROUGE','67');

insert into service values(0,'knis','ROUGE');
insert into service values(0,'maknis','BLEUEUE');

insert into ordre values(9, 8, 7);


select * from piece;
select * from service;
select * from ordre;


-- alter table piece 
-- add constraint pk_piece PRIMARY KEY(nop);
--
-- alter table service
-- add constraint pk_service PRIMARY KEY(nos);
--
-- alter table ordre
-- add constraint fk_ordre_piece FOREIGN KEY(nop) REFERENCES piece(nop);
--
-- alter table ordre
-- add constraint fk_ordre_service FOREIGN KEY(nos) REFERENCES service(nos);
--
-- alter table ordre
-- add constraint pk_ordre PRIMARY KEY(nop,nos);

update piece
set nop = 2 where couleur = 'ROUGE';

update service
set nos = 1 where localisation = 'BLEUEUE';

update ordre
set nop = 0, nos = 0 where quantite = 7;

-- apres correction

alter table piece 
add constraint pk_piece PRIMARY KEY(nop);

alter table service
add constraint pk_service PRIMARY KEY(nos);

alter table ordre
add constraint fk_ordre_piece FOREIGN KEY(nop) REFERENCES piece(nop);

alter table ordre
add constraint fk_ordre_service FOREIGN KEY(nos) REFERENCES service(nos);

alter table ordre
add constraint pk_ordre PRIMARY KEY(nop,nos);

alter table piece
add constraint ck_couleur check(couleur in ('ROUGE','VERTE','BLEUE','JAUNE'));


-- ex3


alter table piece 
modify designation VARCHAR(30);

alter table service
modify institule VARCHAR(30);

alter table service
modify localisation varchar(10);

alter table service 
add directeur varchar(20);

alter table service 
drop column localisation;

alter table ordre
drop constraint fk_ordre_piece;

alter table piece
drop constraint pk_piece;

alter table piece
drop constraint ck_couleur;

drop table nomenclature;

drop table ordre cascade constraints;
