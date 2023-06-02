CREATE TABLE grupo_superheroes (
	codigo serial,
	nombre_grupo varchar(30) not null,
	integrantes text not null,

	primary key(codigo)
);

CREATE TABLE Ataque (
	ID serial,
	nombre varchar(40) not null,
	zona varchar(30) not null,
	bajas int not null,
	heridos int not null,

	foreign key(fk_ataquemutante) references Ataque_mutantes(ID)
	foreign key(fk_ataqueeconom) references Ataque_economico(ID)
	foreign key(fk_ataqueextr) references Ataque_extraterrestre(ID)
	foreign key(fk_ataqueinvasion) references Ataque_invasion(ID)

	primary key(ID)
);

create table Ataque_mutantes (
	ID serial,
	nombre varchar(30) not null,
	grupo varchar(30) not null,

	primary key(ID)
);

create table Ataque_economico (
	ID serial,
	nombre varchar(40) not null,

	primary key(ID)
);

create table Ataque_extraterrestre (
	ID serial,
	raza varchar(40) not null,

	primary key(ID)
);

create table Ataque_invasion (
	ID serial,
	regiones varchar(40) not null,

	primary key(ID)
);

CREATE TABLE Agentes (
	codigo int not null,
	nombre varchar(40) not null,
	especializacion varchar(30) not null,
	tipoayuda varchar(30) null,|

	primary key(codigo)
);

create table Junta (
	codigo serial,
	minuta int not null,

	primary key(codigo)
);

create table lider_shield (
	ID serial,
	nombre varchar(30) not null,
	# grupo en este caso no puede ser un valor, por que todos los grupos son liderados
	# por el lider de SHIELD, por lo que seria redundante.
	grupos text,
	"3,2,1,4,3"
	# select * from grupos_superheroes where codigos = 1 & 2 & 3 & 4; 
	equipo text,

	primary key(ID)
);

create table Director(
	ID serial,
	nombre varchar(30) not null,
	rango varchar(20) not null,

	primary key(ID)
);

CREATE TABLE stark_industries (
	RFC varchar(10) not null,
	CEO varchar(30) not null,
	tipoArmamento text not null,

	primary key(RFC)
);

CREATE TABLE armamento (
	No_Serie varchar(30),
	tipo text not null,

	foreign key(fk_armamentoA) references armamento_A(No_Serie)
	foreign key(fk_armamentoB) references armamento_B(No_Serie)
	foreign key(fk_armamentoC) references armamento_C(No_Serie)

	primary key(No_Serie)
);

CREATE TABLE armamento_A (
	#codigo serial,
	capacidad_destructiva varchar(10) not null,
	
	#primary key(codigo)
);
CREATE TABLE armamento_B (
	#codigo serial,
	capacidad_destructiva varchar(10) not null,
	
	#primary key(codigo)
);
CREATE TABLE armamento_C (
	#codigo serial,
	capacidad_destructiva varchar(10) not null,
	
	#primary key(codigo)
);

CREATE TABLE subdivisiones_SH (
	codigo serial,
	nombre_grupo varchar(30) not null,
	integrantes text not null,

	foreign key(fk_tormentaRayos) references tormentaRayos(codigo)
	foreign key(fk_ataqueeconom) references SWORD(codigo)
	foreign key(fk_ataqueextr) references divisionPSI(codigo)
	foreign key(fk_ataqueinvasion) references escuadronGod(codigo)

	primary key(codigo)
);

CREATE TABLE tormentaRayos (
	codigo serial,
	integrantes text not null,

	primary key(codigo)
);
CREATE TABLE SWORD (
	codigo serial,
	integrantes text not null,

	primary key(codigo)
);
CREATE TABLE divisionPSI (
	codigo serial,
	integrantes text not null,

	primary key(codigo)
);
CREATE TABLE escuadronGod (
	codigo serial,
	integrantes text not null,

	primary key(codigo)
);