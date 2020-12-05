/* 
* Nome da base de dados:  Linhas_De_Onibus
* Login SQL: determinado pelo usuário (vide código)
* Senha SQL: determinada pelo usuário (vide código)
 */


create database Linhas_De_Onibus

create table linha (
   idLinha serial primary key,
   descricao character varying(80) not null,
   numeroLinha integer not null
);


create table motorista (
	idMotorista serial primary key,
	nome character varying(80) not null,
	cpf character varying(11) not null
);


create table Onibus (
    idOnibus serial primary key,
	numeroDoOnibus integer not null,
	modelo character varying(80) not null,
	chassi character varying(80) not null,
	idLinhafk integer,
	idMotoristafk integer,
	
	CONSTRAINT linha_fkey foreign key (idLinhafk) references linha (idLinha),
	CONSTRAINT motorista_fkey foreign key (idMotoristafk) references motorista (idMotorista)
);


create table usuario (
   nomeUsuario character varying(80) not null,
   senha character varying(80) not null,
   tipo character varying(15) not null
);


insert into usuario values ('joao@gmail.com', 'joao', 'administrador');
insert into usuario values ('bruno@gmail.com', 'bruno', 'usuario');

insert into linha values (default, 'SAOPAULO X GOIANIA', 200);
insert into linha values (default, 'SAOPAULO X TRINDADE', 300);
insert into linha values (default, 'HIDROLANDIA X GOIANIA', 300);

insert into motorista values (default, 'Joao', '05260265890');
insert into motorista values (default, 'Bruno', '52369852360');
insert into motorista values (default, 'Vicente', '08369452360');

insert into onibus values (default, 1350, 'VOLVO40', 'XFR4528FG', 1, 1);
insert into onibus values (default, 1840, 'VOLVO50', 'XFJK528LP', 2, 2);
insert into onibus values (default, 1750, 'FORDYK', 'PFJK788L0', 1, 2);