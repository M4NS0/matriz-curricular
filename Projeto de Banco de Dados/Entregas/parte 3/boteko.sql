/* DELEÇÃO DOS ITENS E DAS TABELAS */

DELETE FROM "INGREDIENTE-ITEM-PEDIDO";
DELETE FROM "ITEM-CARDAPIO-PEDIDO";
DELETE FROM "PEDIDO";
DELETE FROM "INGREDIENTE-ITEM-CARDAPIO";
DELETE FROM "INGREDIENTE";
DELETE FROM "ITEM-CARDAPIO";
DELETE FROM "COZINHEIRO";
DELETE FROM "CLIENTE-EXTERNO";
DELETE FROM "ENTREGADOR";
DELETE FROM "MESA";
DELETE FROM "GARCOM";
DELETE FROM "GERENTE";

DROP TABLE public."INGREDIENTE-ITEM-PEDIDO";
DROP TABLE public."ITEM-CARDAPIO-PEDIDO";
DROP TABLE public."PEDIDO";
DROP TABLE public."INGREDIENTE-ITEM-CARDAPIO";
DROP TABLE public."INGREDIENTE";
DROP TABLE public."ITEM-CARDAPIO";
DROP TABLE public."COZINHEIRO";
DROP TABLE public."CLIENTE-EXTERNO";
DROP TABLE public."ENTREGADOR";
DROP TABLE public."MESA";
DROP TABLE public."GARCOM";
DROP TABLE public."GERENTE";

/* TABELA GERENTE */

CREATE TABLE public."GERENTE" 
(
    "nome-gerente" character varying(80) NOT NULL,
    "cpf-gerente" bigint NOT NULL,
    "salario-gerente" numeric(8,2) NOT NULL,
    "telefone-gerente" bigint NOT NULL,
    "turno-gerente" character varying(1) NOT NULL,
    "sexo-gerente" character varying(1) NOT NULL,
	
    CONSTRAINT "Pk-Gerente" PRIMARY KEY ("nome-gerente", "cpf-gerente")
);

/* TABELA GARÇOM */

CREATE TABLE public."GARCOM" 
( 
    "Nome-garcom" character varying(80) NOT NULL, 
	"Cpf-garcom" int NOT NULL, 
	"Salario-garcom" numeric(8,2) NOT NULL,
	"Gorjeta-garcom" numeric(8,2) NOT NULL,
    "Telefone" int NOT NULL,
    "Turno-garcom" character varying(1) NOT NULL, 
    "Sexo-garcom" character varying(1) NOT NULL, 
    
	CONSTRAINT "Pkey-garcom" PRIMARY KEY ("Cpf-garcom", "Nome-garcom")
	
);

/* TABELA MESA */

CREATE TABLE public."MESA" 
( 
    "Numero-mesa" character varying (4) NOT NULL,
	"Numero-lugares" int NOT NULL,
    
	CONSTRAINT "Pkey-mesa" PRIMARY KEY ("Numero-mesa","Numero-lugares") 
);
 
/* TABELA ENTREGADOR */

CREATE TABLE public."ENTREGADOR" 
( 
    "Nome-entregador" character varying(80) NOT NULL, 
	"Cpf-entregador" int NOT NULL, 
	"Salario-entregador" numeric(8,2) NOT NULL,
    "Telefone" int NOT NULL,
    "Turno-entregador" character varying(1) NOT NULL, 
    "Sexo-entregador" character varying(1), 
    
	CONSTRAINT "Pkey-entregador" PRIMARY KEY ("Cpf-entregador") 
	
) ;

/* TABELA CLIENTE EXTERNO */

CREATE TABLE public."CLIENTE-EXTERNO" 
( 
    "Nome-cliente" character varying(80) NOT NULL, 
	"Cpf-cliente" int NOT NULL, 
	"Endereço" character varying(150) NOT NULL, 
    "Telefone" int NOT NULL,
	"Celular" int NOT NULL,    
    
	CONSTRAINT "Pkey-cliente" PRIMARY KEY ("Cpf-cliente") 
	
	-- pergunta antiga:
	-- devo colocar como primary key o nome do cliente para compor o pedido? 
	-- r: nao
	
	-- pergunta nova:
	-- o cliente externo herda alguma chave do Entregador?
	-- r: não, cliente externo está ligado ao pedido e não a entregador
);
/* TABELA COZINHEIRO */

CREATE TABLE public."COZINHEIRO" 
( 
    "Nome-cozinheiro" character varying(80) NOT NULL, 
	"Cpf-cozinheiro" int NOT NULL, 
	"Salario-cozinheiro" numeric(8,2) NOT NULL,
    "Telefone" int NOT NULL,
    "Turno-cozinheiro" character varying(1) NOT NULL, 
    "Sexo-cozinheiro" character varying(1), 
    
	CONSTRAINT "Pkey-cozinheiro" PRIMARY KEY ("Cpf-cozinheiro") 
); 
/* TABELA INGREDIENTE */

CREATE TABLE public."INGREDIENTE" 
( 
    "Numero-ingrediente" int NOT NULL,
	"Descricao" character varying (300) NOT NULL,
	
	CONSTRAINT "Pkey-numero-ingrediente" PRIMARY KEY ("Numero-ingrediente")
); 


/* TABELA ITEM-CARDAPIO */

CREATE TABLE public."ITEM-CARDAPIO" 
( 
    "Numero-item-cardapio" int NOT NULL,
	"Descricao" character varying (300) NOT NULL,
	"Valor-item" numeric (4,2) NOT NULL,
	
	CONSTRAINT "Pkey-item-cardapio" PRIMARY KEY ("Numero-item-cardapio")
	
	-- valor item pedido esta em item cardapio
	
	-- perguntas antigas:
	-- aqui deve conter quantidade do item  e fazer uma chave primaria para ser chave estrangeira de Pedido? 
	-- r: nao
	
	-- valor item deve ser uma chave primária? 
	-- r: nao
); 

/* TABELA INGREDIENTE-ITEM-CARDAPIO */
/* PK de INGREDIENTE ITEM CARDAPIO DEVE SER a FK de item-cardapio e de ingrediete. Faltou o atributo QTDE */	
CREATE TABLE "INGREDIENTE-ITEM-CARDAPIO"
(
    "Quantidade-ingrediente" numeric (5,2) NOT NULL,
	"numero-item-cardapio" int NOT NULL,
	"numero-ingrediente" int NOT NULL,
    "Valor-ingrediente" numeric (4,2) NOT NULL,

    
	CONSTRAINT "Pk-ingrediente-item-cardapio" PRIMARY KEY ("numero-ingrediente","numero-item-cardapio"),
   
	CONSTRAINT "Fk-Numero-ingrediente" FOREIGN KEY ("numero-ingrediente")
        REFERENCES public."INGREDIENTE" ("Numero-ingrediente"),
	
	CONSTRAINT "Fk-Numero-item-cardapio" FOREIGN KEY ("numero-item-cardapio")
        REFERENCES public."ITEM-CARDAPIO" ("Numero-item-cardapio")
	
);
	-- 	-- Pergunta Nova: PK de INGREDIENTE ITEM CARDAPIO DEVE SER a FK de item-cardapio e de ingrediete. PQ?
		-- isso faz com que repitam valores
		
		
	-- Perguntas antigas:
	-- nessa tabela deve aparecer quantidades? 
	-- r: sim, abaixo:
	-- tem q ter quantidades exemplo: 100 gramas de peixe etc
	
	-- a tabela ingrediente-item-cardapio deve ter chave estrangeira do numero-item-cardapio-pedido 
	-- ou da quantidade-item-cardapio-pedido?
	-- r: do item de cardapio


/* TABELA PEDIDO */


CREATE TABLE public."PEDIDO"
(
    "Numero-pedido" int NOT NULL,
    "Valor-desconto" numeric(2,2),
    "cpf-gerente" int NOT NULL,
	"nome-gerente" character varying (80) NOT NULL,
    "cpf-garcom" int,
	"nome-garcom" character varying (80),
    "cpf-cliente" int,
	"cpf-entregador" int,
    "numero-mesa" character varying (4),
	"numero-lugares" int,
	
    CONSTRAINT "Pkey-pedido" PRIMARY KEY ("Numero-pedido"),
	
    CONSTRAINT "Fkey-cliente" FOREIGN KEY ("cpf-cliente")
        REFERENCES public."CLIENTE-EXTERNO" ("Cpf-cliente"),
	
    CONSTRAINT "Fkey-garcom" FOREIGN KEY ("cpf-garcom","nome-garcom")
        REFERENCES public."GARCOM" ("Cpf-garcom","Nome-garcom"),
	
    CONSTRAINT "Fkey-gerente" FOREIGN KEY ("cpf-gerente","nome-gerente")
        REFERENCES public."GERENTE" ("cpf-gerente","nome-gerente"),
	
	CONSTRAINT "Fkey-entregador" FOREIGN KEY ("cpf-entregador")
        REFERENCES public."ENTREGADOR" ("Cpf-entregador"),
	
    CONSTRAINT "Fkey-mesa" FOREIGN KEY ("numero-mesa","numero-lugares")
        REFERENCES public."MESA" ("Numero-mesa","Numero-lugares") 
);
/* TABELA ITEM-CARDAPIO-PEDIDO */

CREATE TABLE public."ITEM-CARDAPIO-PEDIDO" 
( 
    "Numero-pedido" int NOT NULL,
	"Cpf-cozinheiro" int NOT NULL, 
	"Numero-item-cardapio" int NOT NULL,	
	
	CONSTRAINT "Pkey-item-cardapio-pedido" PRIMARY KEY ("Numero-pedido","Numero-item-cardapio"),
	
	CONSTRAINT "Fkey-pedido" FOREIGN KEY ("Numero-pedido") 
        REFERENCES public."PEDIDO" ("Numero-pedido"),	
	
	CONSTRAINT "Fkey-cozinheiro" FOREIGN KEY ("Cpf-cozinheiro") 
        REFERENCES public."COZINHEIRO" ("Cpf-cozinheiro"),
	
	CONSTRAINT "Fkey-item-cardapio" FOREIGN KEY ("Numero-item-cardapio") 
        REFERENCES public."ITEM-CARDAPIO" ("Numero-item-cardapio")
	
	-- pergunta antiga:
	-- cpf cozinheiro no item cardapio pedido? 
	-- r:sim
); 

/* TABELA INGREDIENTE-ITEM-PEDIDO */
/* Pk de INGREDIENTE-ITEM PEDIDO DEVE TER a pk de ITEM-CARDAPIO-PEDIDO e INGHREDIENTE-ITEM-CARDAPIO*/
CREATE TABLE public."INGREDIENTE-ITEM-PEDIDO"
(
	
    "Numero-pedido" bigint NOT NULL,
    "Numero-item-cardapio" bigint NOT NULL,
    "Quantidade-item-pedido" numeric (4,2) NOT NULL,
    
	CONSTRAINT "Pk-Ingrediente-item-pedido" PRIMARY KEY ("Numero-pedido", "Quantidade-item-pedido"),
    
	CONSTRAINT "Fk-numero-item-cardapio" FOREIGN KEY ("Numero-item-cardapio")
        REFERENCES public."ITEM-CARDAPIO" ("Numero-item-cardapio"),
   
	CONSTRAINT "Fk-numero-ingrediente" FOREIGN KEY ("Numero-pedido")
        REFERENCES public."PEDIDO" ("Numero-pedido")
);

	-- novas perguntas: 
	
	-- se a tabela INGREDIENTE-ITEM-PEDIDO nao tem cardinalidade 1,n 
	-- com nenhuma outra, pra quem ela vai doar a chave primaria?
	-- r: para pedidos
	
	-- a chave primaria seria a quantidade de item pedido?
	-- será chave estrangeira de qual tabela?
	-- r: consta em pedidos
	
	-- se nao é chave estrangeira de nenhuma tabela, porque ela deve ter chave primaria? 
	-- r: uma delas chaves estrangeiras formaram a chave primeria da tabela
	
	-- ingrediente, ingrediente-item-cardapio e ingrediente-item-pedido os atributos podem ser null?
	-- r: tem q ser not null porque pratos tem q ter ingredientes


SELECT * FROM "GERENTE";

/* INSERTS */

/* GERENTE */

	INSERT 
	INTO 	"GERENTE"
	VALUES 	('Gerente1', 10001, 1200.00, 9910001,'V','H'),
			('Gerente2', 10002, 1200.00, 9910002,'V','H'),
			('Gerente3', 10003, 1200.00, 9910003,'V','H'),
			('Gerente4', 10004, 1200.00, 9910004,'V','H'),
			('Gerente5', 10005, 1200.00, 9910005,'V','H'),
			('Gerente6', 10006, 1200.00, 9910006,'V','H'),
			('Gerente7', 10007, 1200.00, 9910007,'V','H'),
			('Gerente8', 10008, 1200.00, 9910008,'V','H'),
			('Gerente9', 10009, 1200.00, 9910009,'V','H'),
			('Gerente10', 10010, 1600.00, 9910010,'N','M'),
			('Gerente11', 10011, 1600.00, 9910011,'N','M'),
			('Gerente12', 10012, 1600.00, 9910012,'N','M'),
			('Gerente13', 10013, 1600.00, 9910013,'N','M'),
			('Gerente14', 10014, 1600.00, 9910014,'N','M'),
			('Gerente15', 10015, 1600.00, 9910015,'N','M'),
			('Gerente16', 10016, 1600.00, 9910016,'N','M'),
			('Gerente17', 10017, 1600.00, 9910017,'N','M'),
			('Gerente18', 10018, 1600.00, 9910018,'N','M'),
			('Gerente19', 10019, 1600.00, 9910019,'N','M'),
			('Gerente20', 10020, 1500.00, 9910020,'N','H'),
			('Gerente21', 10021, 1500.00, 9910021,'N','H'),
			('Gerente22', 10022, 1500.00, 9910022,'N','H'),
			('Gerente23', 10023, 1500.00, 9910023,'N','H'),
			('Gerente24', 10024, 1500.00, 9910024,'N','H'),
			('Gerente25', 10025, 1500.00, 9910025,'N','H'),
			('Gerente26', 10026, 1500.00, 9910026,'N','H'),
			('Gerente27', 10027, 1500.00, 9910027,'N','H'),
			('Gerente28', 10028, 1500.00, 9910028,'N','H'),
			('Gerente29', 10029, 1500.00, 9910029,'N','H'),
			('Gerente30', 10030, 1500.00, 9910030,'N','M');

	SELECT * FROM "GERENTE";

/* GARÇONS */
	
	INSERT 
	INTO 	"GARCOM"
	VALUES	('Garçom1', 10031, 1200.00, 0.00025, 9910031,'V','H'),
            ('Garçom2', 10032, 1200.00, 0.00025,9910032,'V','H'),
            ('Garçom3', 10033, 1200.00, 0.00025,9910033,'V','H'),
            ('Garçom4', 10034, 1200.00, 0.00025,9910034,'V','H'),
            ('Garçom5', 10035, 1200.00, 0.00025,9910035,'V','H'),
            ('Garçom6', 10036, 1200.00, 0.00025,9910036,'V','H'),
            ('Garçom7', 10037, 1200.00, 0.00025,9910037,'V','H'),
            ('Garçom8', 10038, 1200.00, 0.00025,9910038,'V','H'),
            ('Garçom9', 10039, 1200.00, 0.00025,9910039,'V','H'),
            ('Garçom10', 10040, 1400.00, 0.00050, 9910040,'N','M'),
            ('Garçom11', 10041, 1400.00, 0.00050, 9910041,'N','M'),
            ('Garçom12', 10042, 1400.00, 0.00050, 9910042,'N','M'),
            ('Garçom13', 10043, 1400.00, 0.00050, 9910043,'N','M'),
            ('Garçom14', 10044, 1400.00, 0.00050, 9910044,'N','M'),
            ('Garçom15', 10045, 1400.00, 0.00050, 9910045,'N','M'),
            ('Garçom16', 10046, 1400.00, 0.00050, 9910046,'N','M'),
            ('Garçom17', 10047, 1400.00, 0.00050, 9910047,'N','M'),
            ('Garçom18', 10048, 1400.00, 0.00050, 9910048,'N','M'),
            ('Garçom19', 10049, 1400.00, 0.00050, 9910049,'N','M'),
            ('Garçom20', 10050, 1300.00, 0.00050, 9910050,'N','H'),
            ('Garçom21', 10051, 1300.00, 0.00050, 9910051,'N','H'),
            ('Garçom22', 10052, 1300.00, 0.00050, 9910052,'N','H'),
            ('Garçom23', 10053, 1300.00, 0.00050, 9910053,'N','H'),
            ('Garçom24', 10054, 1300.00, 0.00050, 9910054,'N','H'),
            ('Garçom25', 10055, 1300.00, 0.00050, 9910055,'N','H'),
            ('Garçom26', 10056, 1300.00, 0.00050, 9910056,'N','H'),
            ('Garçom27', 10057, 1300.00, 0.00050, 9910057,'N','H'),
            ('Garçom28', 10058, 1300.00, 0.00050, 9910058,'N','H'),
            ('Garçom29', 10059, 1300.00, 0.00050, 9910059,'N','H'),
            ('Garçom30', 10050, 1300.00, 0.00050, 9910060,'N','M');


	SELECT * FROM "GARCOM";

/* COZINHEIRO */

	INSERT 
	INTO 	"COZINHEIRO"
	VALUES	('Cozinheiro1', 10061, 1400.00, 9910061,'V','H'),
            ('Cozinheiro2', 10062, 1400.00, 9910062,'V','H'),
            ('Cozinheiro3', 10063, 1400.00, 9910063,'V','H'),
            ('Cozinheiro4', 10064, 1400.00, 9910064,'V','H'),
            ('Cozinheiro5', 10065, 1400.00, 9910065,'V','H'),
            ('Cozinheiro6', 10066, 1400.00, 9910066,'V','H'),
            ('Cozinheiro7', 10067, 1400.00, 9910067,'V','H'),
            ('Cozinheiro8', 10068, 1400.00, 9910068,'V','H'),
            ('Cozinheiro9', 10069, 1400.00, 9910069,'V','H'),
            ('Cozinheiro10', 10070, 1400.00, 9910070,'N','M'),
            ('Cozinheiro11', 10071, 1400.00, 9910071,'N','M'),
            ('Cozinheiro12', 10072, 1400.00, 9910072,'N','M'),
            ('Cozinheiro13', 10073, 1400.00, 9910073,'N','M'),
            ('Cozinheiro14', 10074, 1400.00, 9910074,'N','M'),
            ('Cozinheiro15', 10075, 1400.00, 9910075,'N','M'),
            ('Cozinheiro16', 10076, 1400.00, 9910076,'N','M'),
            ('Cozinheiro17', 10077, 1400.00, 9910077,'N','M'),
            ('Cozinheiro18', 10078, 1400.00, 9910078,'N','M'),
            ('Cozinheiro19', 10079, 1400.00, 9910079,'N','M'),
            ('Cozinheiro20', 10080, 1400.00, 9910080,'M','H'),
            ('Cozinheiro21', 10081, 1400.00, 9910081,'M','H'),
            ('Cozinheiro22', 10082, 1400.00, 9910082,'M','H'),
            ('Cozinheiro23', 10083, 1400.00, 9910083,'M','H'),
            ('Cozinheiro24', 10084, 1400.00, 9910084,'M','H'),
            ('Cozinheiro25', 10085, 1400.00, 9910085,'M','H'),
            ('Cozinheiro26', 10086, 1400.00, 9910086,'M','H'),
            ('Cozinheiro27', 10087, 1400.00, 9910087,'M','H'),
            ('Cozinheiro28', 10088, 1400.00, 9910088,'M','H'),
            ('Cozinheiro29', 10089, 1400.00, 9910089,'M','H'),
            ('Cozinheiro30', 10090, 1400.00, 9910090,'M','M');
	
	
	SELECT * FROM "COZINHEIRO";
	
	
/* ENTREGADOR */ 
	
	INSERT 
	INTO 	"ENTREGADOR"
	VALUES	('Entregador1', 10101, 800.00, 9919061,'V','H'),
            ('Entregador2', 10102, 800.00, 9919062,'V','H'),
            ('Entregador3', 10103, 800.00, 9919063,'V','H'),
            ('Entregador4', 10104, 800.00, 9919064,'V','H'),
            ('Entregador5', 10105, 800.00, 9919065,'V','H'),
            ('Entregador6', 10106, 800.00, 9919066,'V','H'),
            ('Entregador7', 10107, 800.00, 9919067,'V','H'),
            ('Entregador8', 10108, 800.00, 9919068,'V','H'),
            ('Entregador9', 10109, 800.00, 9919069,'V','H'),
            ('Entregador10', 10110, 800.00, 9990070,'N','M'),
            ('Entregador11', 10111, 800.00, 9990071,'N','M'),
            ('Entregador12', 10112, 800.00, 9990072,'N','M'),
            ('Entregador13', 10113, 800.00, 9990073,'N','M'),
            ('Entregador14', 10114, 800.00, 9990074,'N','M'),
            ('Entregador15', 10115, 800.00, 9990075,'N','M'),
            ('Entregador16', 10116, 800.00, 9990076,'N','M'),
            ('Entregador17', 10117, 800.00, 9990077,'N','M'),
            ('Entregador18', 10118, 800.00, 9990078,'N','M'),
            ('Entregador19', 10119, 800.00, 9990079,'N','M'),
            ('Entregador20', 10120, 800.00, 9990080,'M','H'),
            ('Entregador21', 10121, 800.00, 9990081,'M','H'),
            ('Entregador22', 10122, 800.00, 9990082,'M','H'),
            ('Entregador23', 10123, 800.00, 9990083,'M','H'),
            ('Entregador24', 10124, 800.00, 9990084,'M','H'),
            ('Entregador25', 10125, 800.00, 9990085,'M','H'),
            ('Entregador26', 10126, 800.00, 9990086,'M','H'),
            ('Entregador27', 10127, 800.00, 9990087,'M','H'),
            ('Entregador28', 10128, 800.00, 9990088,'M','H'),
            ('Entregador29', 10129, 800.00, 9990089,'M','H'),
            ('Entregador30', 10130, 800.00, 9990090,'M','M');

/* TABELA MESA */
	
	INSERT 
	INTO 	"MESA"
	VALUES 	(1,5),
			(2,5),
			(3,5),
			(4,5),
			(5,5),
			(6,5),
			(7,5),
			(8,2),
			(9,5),
			(10,5),
			(11,5),
			(12,5),
			(13,2),
			(14,2),
			(15,5),
			(16,5),
			(17,3),
			(18,3),
			(19,5),
			(20,5),
			(21,4),
			(22,4),
			(23,5),
			(24,4),
			(25,5),
			(26,10),
			(27,5),
			(28,2),
			(29,2),
			(30,2);
			
	
	
	SELECT * FROM "MESA";
/* CLIENTE */ 

	INSERT 
	INTO 	"CLIENTE-EXTERNO"
	VALUES	('Cliente1', 11101, 'Rua A' , 22519061,9901001),
            ('Cliente2', 11102, 'Rua B' , 22519062,991002),
            ('Cliente3', 11103, 'Rua C' , 22519063,991223),
            ('Cliente4', 11104, 'Rua D' , 22519064,991004),
            ('Cliente5', 11105, 'Rua E' , 22519065,991005),
            ('Cliente6', 11106, 'Rua F' , 22519066,991006),
            ('Cliente7', 11107, 'Rua G' , 22519067,991007),
            ('Cliente8', 11108, 'Rua H' , 22519068,991008),
            ('Cliente9', 11109, 'Rua I' , 22519069,991009),
            ('Cliente10', 11110, 'Rua J' , 22590070,991010),
            ('Cliente11', 11111, 'Rua K' , 22590071,991011),
            ('Cliente12', 11112, 'Rua L' , 22590072,991012),
            ('Cliente13', 11113, 'Rua M' , 22590073,991013),
            ('Cliente14', 11114, 'Rua N' , 22590074,991014),
            ('Cliente15', 11115, 'Rua O' , 22590075,991015),
            ('Cliente16', 11116, 'Rua P' , 22590076,991016),
            ('Cliente17', 11117, 'Rua Q' , 22590077,991017),
            ('Cliente18', 11118, 'Rua R' , 22590078,991018),
            ('Cliente19', 11119, 'Rua S' , 22590079,991019),
            ('Cliente20', 11120, 'Rua T' , 22590080,991020),
            ('Cliente21', 11121, 'Rua U' , 22590081,991021),
            ('Cliente22', 11122, 'Rua V' , 22590082,991022),
            ('Cliente23', 11123, 'Rua W' , 22590083,991023),
            ('Cliente24', 11124, 'Rua X' , 22590084,991024),
            ('Cliente25', 11125, 'Rua Y' , 22590085,991025),
            ('Cliente26', 11126, 'Rua Z' , 22590086,991026),
            ('Cliente27', 11127, 'Rua A' , 22590087,991027),
            ('Cliente28', 11128, 'Rua B' , 22590088,991028),
            ('Cliente29', 11129, 'Rua C' , 22590089,991029),
            ('Cliente30', 11130, 'Rua D' , 22590090,991030);


SELECT * FROM "CLIENTE-EXTERNO";
	
/* INGREDIENTE */ 
	
	INSERT 
	INTO 	"INGREDIENTE"
	VALUES	(1,'Ingrediente1'),
			(2,'Ingrediente2'),
			(3,'Ingrediente3'),
			(4,'Ingrediente4'),
			(5,'Ingrediente5'),
			(6,'Ingrediente6'),
			(7,'Ingrediente7'),
			(8,'Ingrediente8'),
			(9,'Ingrediente9'),
			(10,'Ingrediente10'),
			(11,'Ingrediente11'),
			(12,'Ingrediente12'),
			(13,'Ingrediente13'),
			(14,'Ingrediente14'),
			(15,'Ingrediente15'),
			(16,'Ingrediente16'),
			(17,'Ingrediente17'),
			(18,'Ingrediente18'),
			(19,'Ingrediente19'),
			(20,'Ingrediente20'),
			(21,'Ingrediente21'),
			(22,'Ingrediente22'),
			(23,'Ingrediente23'),
			(24,'Ingrediente24'),
			(25,'Ingrediente25'),
			(26,'Ingrediente26'),
			(27,'Ingrediente27'),
			(28,'Ingrediente28'),
			(29,'Ingrediente29'),
			(30,'Ingrediente30');
			

	SELECT * FROM "INGREDIENTE";

/* ITEM-CARDAPIO */

	INSERT
    INTO     "ITEM-CARDAPIO"
    VALUES  (1,'Item1',55.30),
            (2,'Item2',60.20),
            (3,'Item3',10.80),
            (4,'Item4',10.80),
            (5,'Item5',5.60),
            (6,'Item6',6.80),
            (7,'Item7',1.30),
            (8,'Item8',1.50),
            (9,'Item9',2.00),
            (10,'Item10',30.00),
            (11,'Item11',15.00),
            (12,'Item12',20.00),
            (13,'Item13',10.00),
            (14,'Item14',8.22),
            (15,'Item15',5.25),
            (16,'Item16',1.60),
            (17,'Item17',1.30),
            (18,'Item18',2.50),
            (19,'Item19',2.90),
            (20,'Item20',1.55),
            (21,'Item21',3.30),
            (22,'Item22',10.10),
            (23,'Item23',11.52),
            (24,'Item24',5.25),
            (25,'Item25',5.32),
            (26,'Item26',9.88),
            (27,'Item27',1.99),
            (28,'Item28',1.99),
            (29,'Item29',3.90),
            (30,'Item30',9.80);
			
	SELECT * FROM "ITEM-CARDAPIO";
	
/* INGREDIENTE-ITEM-CARDAPIO */


	INSERT
    INTO     "INGREDIENTE-ITEM-CARDAPIO"
    VALUES  (30 , 1, 1, 2.30 ),
			(30 , 2, 2, 3.30 ),
			(10 , 3, 3, 5.30 ),
			(100 , 4, 4, 1.30 ),
			(50 , 5, 5, 2.40 ),
			(20 , 6, 6, 2.50 ),
			(32 , 7, 7, 2.10 ),
			(38 , 8, 8, 2.80 ),
			(350 , 9, 9, 7.30 ),
			(50 , 10, 10, 7.30 ),
			(45 , 11, 11, 9.30 ),
			(10 , 12, 12, 2.80 ),
			(10 , 13, 13, 9.60 ),
			(25 , 14, 14, 6.90 ),
			(30 , 15, 15, 3.30 ),
			(350 , 16, 16, 2.30 ),
			(80 , 17, 17, 4.30 ),
			(10 , 18, 18, 5.30 ),
			(15 , 19, 19, 8.20 ),
			(80 , 20, 20, 2.10 ),
			(180 , 21, 21, 2.70 ),
			(25 , 22, 22, 3.30 ),
			(1 , 23, 23, 3.90 ),
			(15 , 24, 24, 4.90 ),
			(90 , 25, 25, 1.99 ),
			(130 , 26, 26, 2.30 ),
			(80 , 27, 27, 1.99 ),
			(20 , 28, 28, 2.50 ),
			(100 , 29, 29, 2.10 ),
			(80 , 30, 30, 2.99 );
			
	SELECT * FROM "INGREDIENTE-ITEM-CARDAPIO";


/* TABELA PEDIDO */
	
	INSERT
    INTO    "PEDIDO"
    VALUES	(1 , 0.0 ,10001,'Gerente1', 10031, 'Garçom1', null, null , 1, 5 ),
			(2 , 0.0 ,10002,'Gerente2', 10032, 'Garçom2', null, null , 10, 5 ),
			(3 , 0.0 ,10003,'Gerente3', 10033, 'Garçom3', null, null , 2, 5 ),
			(4 , 0.0 ,10004,'Gerente4', 10034, 'Garçom4', null, null , 3, 5 ),
			(5 , 0.0 ,10005,'Gerente5', 10035, 'Garçom5', null, null , 4, 5 ),
			(6 , 0.0 ,10006,'Gerente6', 10036, 'Garçom6', null, null , 6, 5 ),
			(7 , 0.0 ,10007,'Gerente7', 10037, 'Garçom7', null, null , 7, 5 ),
			(8 , 0.0 ,10008,'Gerente8', 10038, 'Garçom8', null, null , 8, 2 ),
			(9 , 0.0 ,10009,'Gerente9', 10039, 'Garçom9', null, null , 11, 5 ),
			(10 , 0.0 ,10010,'Gerente10', 10040, 'Garçom10', null, null , 12, 5 ),
			(11 , 0.0 ,10001,'Gerente1', 10031, 'Garçom1', null, null , 13, 2 ),
			(12 , 0.0 ,10002,'Gerente2', 10032, 'Garçom2', null, null , 14, 2 ),
			(13 , 0.0 ,10003,'Gerente3', 10033, 'Garçom3', null, null , 15, 5 ),
			(14 , 0.0 ,10004,'Gerente4', 10034, 'Garçom4', null, null , 16, 5 ),
			(15 , 0.0 ,10005,'Gerente5', 10035, 'Garçom5', null, null , 17, 3 ),
			(16 , 0.0 ,10006,'Gerente6', 10036, 'Garçom6', null, null , 18, 3 ),
			(17 , 0.0 ,10007,'Gerente7', 10037, 'Garçom7', null, null , 1, 5 ),
			(18 , 0.0 ,10002,'Gerente2', null, null, 11101, 10101 , null, null ),
			(19 , 0.0 ,10002,'Gerente2', null, null, 11103, 10102 , null, null ),
			(20 , 0.0 ,10001,'Gerente1', null, null, 11105, 10103 , null, null ),
			(21 , 0.0 ,10001,'Gerente1', null, null, 11107, 10105 ,null, null ),
			(22 , 0.0 ,10001,'Gerente1', null, null, 11109, 10107 , null, null ),
			(23 , 0.0 ,10002,'Gerente2', null, null, 11111, 10109 , null, null ),
			(24 , 0.0 ,10002,'Gerente2', null, null, 11113, 10111 , null, null ),
			(25 , 0.0 ,10001,'Gerente1', null, null, 11115, 10113 , null, null ),
			(26 , 0.0 ,10001,'Gerente1', null, null, 11117, 10115 , null, null ),
			(27 , 0.0 ,10001,'Gerente1', null, null, 11119, 10117 , null, null ),
			(28 , 0.0 ,10001,'Gerente1', null, null, 11121, 10119 , null, null ),
			(29 , 0.0 ,10001,'Gerente1', null, null, 11123, 10121 , null, null ),
			(30 , 0.0 ,10002,'Gerente2', null, null, 11125, 10123 , null, null );

	SELECT * FROM "PEDIDO";

/* TABELA ITEM-CARDAPIO-PEDIDO */

	
	INSERT
    INTO    "ITEM-CARDAPIO-PEDIDO"
    VALUES	(1,10061,1),
			(2,10062,3),
			(3,10063,5),
			(4,10063,7),
			(5,10064,9),
			(6,10066,11),
			(7,10068,13),
			(8,10070,15),
			(9,10072,17),
			(10,10074,19),
			(11,10076,21),
			(12,10078,23),
			(13,10080,25),
			(14,10082,27),
			(15,10084,29),
			(16,10086,30),
			(17,10088,28),
			(18,10090,26),
			(19,10089,24),
			(20,10087,22),
			(21,10085,20),
			(22,10083,18),
			(23,10081,16),
			(24,10079,14),
			(25,10077,12),
			(26,10075,10),
			(27,10073,8),
			(28,10071,6),
			(29,10069,4),
			(30,10067,2);
			
	
	SELECT * FROM "ITEM-CARDAPIO-PEDIDO";
	
/* TABELA INGREDIENTE-ITEM-PEDIDO */

	INSERT
    INTO    "INGREDIENTE-ITEM-PEDIDO"
    VALUES	(1,1,20),
			(2,3,4.5),
			(3,5,60.0),
			(4,7,30),
			(5,9,10.00),
			(6,11,20),
			(7,13,10),
			(8,15,2.5),
			(9,17,1.5),
			(10,19,30),
			(11,21,10),
			(12,23,4.5),
			(13,25,6.0),
			(14,27,2.5),
			(15,29,70),
			(16,30,90),
			(17,28,10),
			(18,26,20),
			(19,24,40),
			(20,22,6),
			(21,20,1),
			(22,18,25),
			(23,16,50),
			(24,14,20),
			(25,12,60),
			(26,10,90),
			(27,8,22),
			(28,6,16),
			(29,4,50),
			(30,2,50);
			
	SELECT * FROM "INGREDIENTE-ITEM-PEDIDO" ;

/* ALTERS E SELECTS DAS TABELAS */ 
	
	/* GERENTE */

	SELECT * FROM "GERENTE";

---------------------------------------------------------------------------------------------------
	UPDATE 	"GERENTE" 
	SET 	"salario-gerente" = "salario-gerente" + ("salario-gerente"*5/100) 
	WHERE 	"turno-gerente" = 'N' AND "sexo-gerente" = 'M'; 
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	SELECT 	"nome-gerente" 		AS "Nome do Gerente", 
			"salario-gerente" 	AS "Salário Corrigido",
			"turno-gerente" 	AS "Turno",
			"sexo-gerente" 		AS "Sexo"
	FROM 	"GERENTE" 
	WHERE 	"turno-gerente" = 'N' AND "sexo-gerente" = 'M'; 
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	UPDATE 	"GERENTE" 
	SET 	"sexo-gerente" = 'M' 
	WHERE 	"nome-gerente" = 'Gerente2' OR "nome-gerente" = 'Gerente1';
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	SELECT 	"nome-gerente" AS "Nome do Gerente", 
			"sexo-gerente" AS "Sexo"
	FROM 	"GERENTE" 
	WHERE 	"nome-gerente" = 'Gerente2' OR "nome-gerente" = 'Gerente1';
---------------------------------------------------------------------------------------------------

	/* GARCOM */

	SELECT * FROM "GARCOM" ;

---------------------------------------------------------------------------------------------------
	UPDATE 	"GARCOM" 
	SET 	"Gorjeta-garcom" = 0.25 
	WHERE 	"Turno-garcom" = 'N' AND "Salario-garcom" > 1399.00;
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	SELECT  "Nome-garcom" 	 AS "Nome do Garçom",
			"Gorjeta-garcom" AS "Gorjeta Corrigida"
	FROM 	"GARCOM" 
	WHERE 	"Turno-garcom" = 'N' AND "Salario-garcom" > 1399.00;
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	UPDATE 	"GARCOM" 
	SET 	"Salario-garcom" = "Salario-garcom" + ("Salario-garcom"*6/100) 
	WHERE 	"Turno-garcom" = 'N' AND "Sexo-garcom" = 'M'; 
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	SELECT 	"Nome-garcom" 		AS "Nome do Garcom", 
			"Salario-garcom" 	AS "Salário Corrigido",
			"Turno-garcom" 		AS "Turno",
			"Sexo-garcom" 		AS "Sexo"
	FROM 	"GARCOM" 
	WHERE 	"Turno-garcom" = 'N' AND "Sexo-garcom" = 'M'; 
---------------------------------------------------------------------------------------------------


	/* MESA */

	SELECT * FROM "MESA";

---------------------------------------------------------------------------------------------------
	UPDATE 	"MESA"
	SET 	"Numero-lugares" = 3
	WHERE 	"Numero-mesa" = '18' AND "Numero-mesa" = '19';
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	SELECT 	"Numero-mesa" AS "Numero da Mesa",
			"Numero-lugares" AS "Total de Cadeiras"
	FROM 	"MESA"
	WHERE   "Numero-mesa" = '18' OR "Numero-mesa" = '19';
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	UPDATE 	"MESA"
	SET 	"Numero-lugares" = 5
	WHERE	"Numero-lugares" = 4;
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	SELECT 	* 
	FROM	"MESA"
	WHERE 	"Numero-lugares" != 5;
---------------------------------------------------------------------------------------------------


/* ENTREGADOR */

	SELECT * FROM "ENTREGADOR";

---------------------------------------------------------------------------------------------------
	UPDATE 	"ENTREGADOR"
	SET 	"Telefone" = 9999991, "Turno-entregador" = 'N'
	WHERE	"Nome-entregador" = 'Entregador1'; 	
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	SELECT 	"Nome-entregador" AS "Entregador",
			"Telefone" AS "Novo Número",
			"Turno-entregador" AS "Novo Turno"
	FROM 	"ENTREGADOR"
	WHERE	"Turno-entregador" = 'N';
---------------------------------------------------------------------------------------------------
	
---------------------------------------------------------------------------------------------------
	UPDATE 	"ENTREGADOR"
	SET 	"Salario-entregador" = "Salario-entregador" + ("Salario-entregador"*15/100)
	WHERE 	"Turno-entregador" = 'N';
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	SELECT 	"Nome-entregador" AS "Nome",
			"Turno-entregador" AS "Turno",
			"Salario-entregador" AS "Salário Atualizado"
	FROM	"ENTREGADOR"
	WHERE	"Turno-entregador" = 'N';
---------------------------------------------------------------------------------------------------


/* CLIENTE-EXTERNO */

	SELECT * FROM "CLIENTE-EXTERNO";
	
---------------------------------------------------------------------------------------------------
	
	
	UPDATE 	"CLIENTE-EXTERNO"
	SET		"Endereço" = CONCAT("Endereço",' - Número 100')
	WHERE 	"Endereço" = 'Rua A';
---------------------------------------------------------------------------------------------------
	
---------------------------------------------------------------------------------------------------
	SELECT 	"Nome-cliente" AS "Nome do Cliente",
			"Endereço"		AS "Endereço Atualizado"
	FROM	"CLIENTE-EXTERNO"
	WHERE 	"Nome-cliente" = 'Cliente1' OR "Nome-cliente" = 'Cliente27';
---------------------------------------------------------------------------------------------------
	
---------------------------------------------------------------------------------------------------	
	UPDATE 	"CLIENTE-EXTERNO"
	SET		"Celular" = 901001
	WHERE 	"Nome-cliente" = 'Cliente1';
---------------------------------------------------------------------------------------------------
	
---------------------------------------------------------------------------------------------------
	SELECT 	"Nome-cliente" AS "Nome do Cliente",
			"Celular"      AS "Celular corrigido"
	FROM 	"CLIENTE-EXTERNO"
	WHERE	"Cpf-cliente" = 11127 OR "Cpf-cliente" < 11102;
---------------------------------------------------------------------------------------------------

/* COZINHEIRO */


	SELECT * FROM "COZINHEIRO";
---------------------------------------------------------------------------------------------------
	UPDATE 	"COZINHEIRO"
	SET		"Salario-cozinheiro" = "Salario-cozinheiro" - ("Salario-cozinheiro"*20/100)
	WHERE	"Turno-cozinheiro" = 'V';
---------------------------------------------------------------------------------------------------
	
---------------------------------------------------------------------------------------------------	
	SELECT 	"Nome-cozinheiro" AS "Nome",
			"Salario-cozinheiro" AS "Salário Reajustado",
			"Turno-cozinheiro"
	FROM	"COZINHEIRO"
	WHERE	"Turno-cozinheiro" = 'V';
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	UPDATE 	"COZINHEIRO"
	SET 	"Turno-cozinheiro" = 'V'
	WHERE	"Sexo-cozinheiro" = 'M' AND "Turno-cozinheiro" = 'M';
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	SELECT 	"Nome-cozinheiro" AS "Nome",
			"Salario-cozinheiro" AS "Salario",
			"Telefone",
			"Turno-cozinheiro" AS "Novo Turno"
			
	FROM	"COZINHEIRO"
	WHERE	"Turno-cozinheiro" = 'V' AND "Salario-cozinheiro" <= 1400;
---------------------------------------------------------------------------------------------------

/* ITEM-CARDAPIO */

	SELECT * FROM "ITEM-CARDAPIO";
---------------------------------------------------------------------------------------------------
	UPDATE 	"ITEM-CARDAPIO"
	SET 	"Valor-item" = "Valor-item" - ("Valor-item"*0.05)
	WHERE	("Numero-item-cardapio" BETWEEN 5 AND 7) OR ("Numero-item-cardapio" BETWEEN 15 AND 17);
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	SELECT 	"Numero-item-cardapio" AS "Item do cardápio",
			"Descricao",
			"Valor-item" AS "Preço"
	FROM	"ITEM-CARDAPIO"
	WHERE	("Numero-item-cardapio" BETWEEN 5 AND 7) OR ("Numero-item-cardapio" BETWEEN 15 AND 17);
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	UPDATE 	"ITEM-CARDAPIO"
	SET 	"Valor-item" = "Valor-item" - ("Valor-item"*0.05),
			"Descricao" = CONCAT("Descricao",' - com acréssimo')
	WHERE	"Valor-item" >= 10 AND "Valor-item" < 20;
---------------------------------------------------------------------------------------------------
	
---------------------------------------------------------------------------------------------------
	SELECT 	* 
	FROM 	"ITEM-CARDAPIO"
	WHERE	"Valor-item" >= 10 AND "Valor-item" < 20;

---------------------------------------------------------------------------------------------------
	
/* INGREDIENTE */ 

	SELECT * FROM "INGREDIENTE";

---------------------------------------------------------------------------------------------------
	UPDATE 	"INGREDIENTE"
	SET		"Descricao" = CONCAT("Descricao",' - indisponível')
	WHERE 	"Numero-ingrediente" BETWEEN 1 AND 4;
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	SELECT 	"Descricao",
			"Numero-ingrediente" AS "Código"
	FROM 	"INGREDIENTE"
	WHERE	"Numero-ingrediente" <= 4;
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	UPDATE 	"INGREDIENTE"
	SET		"Descricao" = CONCAT("Descricao",' - disponível')	
	WHERE	"Numero-ingrediente" > 4;
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	SELECT 	"Descricao",
			"Numero-ingrediente" AS "Código"
	FROM 	"INGREDIENTE"
	WHERE	"Numero-ingrediente" > 4;
---------------------------------------------------------------------------------------------------

/* INGREDIENTE-ITEM-CARDAPIO */

	SELECT * FROM "INGREDIENTE-ITEM-CARDAPIO";
	
---------------------------------------------------------------------------------------------------
	UPDATE 	"INGREDIENTE-ITEM-CARDAPIO"
	SET		"Valor-ingrediente" = "Valor-ingrediente" + ("Valor-ingrediente"*0.05)
	WHERE	"Quantidade-ingrediente" >= 50;
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	SELECT 	"Quantidade-ingrediente" 	AS "Quantidade em Gramas", 
			"Valor-ingrediente"			AS "Valor por Grama",		 
			("Quantidade-ingrediente") * ("Valor-ingrediente") AS "Total em Reais"
	FROM 	"INGREDIENTE-ITEM-CARDAPIO"
	WHERE	"Quantidade-ingrediente" >= 50;
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	UPDATE 	"INGREDIENTE-ITEM-CARDAPIO"
	SET 	"Quantidade-ingrediente" = 100
	WHERE 	"Quantidade-ingrediente" >= 80;
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	SELECT	"numero-ingrediente"		AS "Número do Ingrediente",
			"Quantidade-ingrediente" 	AS "Quantidade em Gramas", 
			"Valor-ingrediente"			AS "Valor por Grama",	
			("Quantidade-ingrediente") * ("Valor-ingrediente") AS "Total em Reais"
	FROM 	"INGREDIENTE-ITEM-CARDAPIO"
	WHERE 	"Quantidade-ingrediente" = 100;	
---------------------------------------------------------------------------------------------------
	
/* PEDIDO */

	SELECT * FROM "PEDIDO";
	
---------------------------------------------------------------------------------------------------
	UPDATE 	"PEDIDO"
	SET		"Valor-desconto" = 0.3
	WHERE 	"numero-mesa" = '1' OR
			"numero-mesa" = '2' OR
			"numero-mesa" = '3' OR
			"numero-mesa" = '4' OR
			"numero-mesa" = '5' OR
			"numero-mesa" = '6' OR
			"numero-mesa" = '7' OR
			"numero-mesa" = '8' OR
			"numero-mesa" = '9' OR
			"numero-mesa" = '10';
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	SELECT 	"Numero-pedido"	 AS "Numero do Pedido",
			"numero-mesa"	 AS "Mesas em Sistema de Cupom",
			"nome-gerente"	 AS "Nome do Gerente Responsável",
			"Valor-desconto" AS "Desconto Aprovado"
	FROM 	"PEDIDO"
	WHERE	"Valor-desconto" != 0.00
	ORDER BY"Numero-pedido" DESC;
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	UPDATE 	"PEDIDO"
	SET 	"nome-garcom" = 'Garçom1',
			"cpf-garcom" = 10031
	WHERE	"Numero-pedido" = 12;
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	SELECT 	"Numero-pedido" AS "Pedido",
			"numero-mesa"	AS "Mesa",
			"nome-garcom"	AS "Atendente",
			"cpf-garcom"	AS "CPF"
	FROM 	"PEDIDO"
	WHERE 	"nome-garcom" IS NOT NULL AND "Numero-pedido" >= 12
	ORDER BY"Numero-pedido";
---------------------------------------------------------------------------------------------------

/* ITEM-CARDAPIO-PEDIDO */

	SELECT * FROM "ITEM-CARDAPIO-PEDIDO";

---------------------------------------------------------------------------------------------------
	UPDATE 	"ITEM-CARDAPIO-PEDIDO"
	SET		"Cpf-cozinheiro" = 10062
	WHERE	"Numero-pedido" = 2 OR "Numero-pedido" = 3 OR "Numero-pedido" = 4;
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	SELECT 	*
	FROM 	"ITEM-CARDAPIO-PEDIDO"
	WHERE 	"Cpf-cozinheiro" = 10061
	ORDER BY"Numero-item-cardapio" DESC;
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	UPDATE 	"ITEM-CARDAPIO-PEDIDO"
	SET		"Cpf-cozinheiro" = 10062
	WHERE 	"Numero-pedido" BETWEEN 5 AND 10;
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	SELECT 	*
	FROM 	"ITEM-CARDAPIO-PEDIDO"
	WHERE 	"Numero-pedido" >= 5 AND "Numero-pedido" <= 10;
---------------------------------------------------------------------------------------------------

/* INGREDIENTE-ITEM-PEDIDO */

	SELECT * FROM "INGREDIENTE-ITEM-PEDIDO";
	
---------------------------------------------------------------------------------------------------
	UPDATE 	"INGREDIENTE-ITEM-PEDIDO"
	SET	   	"Quantidade-item-pedido" = "Quantidade-item-pedido" + 3
	WHERE	"Quantidade-item-pedido" <= 10;
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	SELECT 	"Numero-pedido" AS "Pedido",
			"Quantidade-item-pedido" AS "Quantidade Surrupiada"
	FROM 	"INGREDIENTE-ITEM-PEDIDO"
	WHERE	"Quantidade-item-pedido" <= 10
	ORDER BY"Quantidade-item-pedido";
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	UPDATE 	"INGREDIENTE-ITEM-PEDIDO"
	SET	   	"Quantidade-item-pedido" = "Quantidade-item-pedido" - 0.5
	WHERE	"Quantidade-item-pedido" <= 10;
---------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------
	SELECT 	"Numero-pedido" AS "Pedido",
			"Quantidade-item-pedido" AS "Quantidade"
	FROM 	"INGREDIENTE-ITEM-PEDIDO"
	WHERE	"Quantidade-item-pedido" <= 10
	ORDER BY"Numero-pedido";
---------------------------------------------------------------------------------------------------
