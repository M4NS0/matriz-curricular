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

CREATE TABLE public."GERENTE" 
( 
    "Nome-gerente" character varying(80) NOT NULL, 
	"Cpf-gerente" int NOT NULL, 
	"Salario-gerente" numeric(8,2) NOT NULL,
    "Telefone" int NOT NULL,
    "Turno-gerente" character varying(1) NOT NULL, 
    "Sexo-gerente" character varying(1) NOT NULL, 
    
	CONSTRAINT "Pkey-gerente" PRIMARY KEY ("Cpf-gerente") 
	
) 

CREATE TABLE public."GARCOM" 
( 
    "Nome-garcom" character varying(80) NOT NULL, 
	"Cpf-garcom" int NOT NULL, 
	"Salario-garcom" numeric(8,2) NOT NULL,
	"Gorjeta-garcom" numeric(8,2) NOT NULL,
    "Telefone" int NOT NULL,
    "Turno-garcom" character varying(1) NOT NULL, 
    "Sexo-garcom" character varying(1) NOT NULL, 
    
	CONSTRAINT "Pkey-garcom" PRIMARY KEY ("Cpf-garcom") 
) 

CREATE TABLE public."MESA" 
( 
    "Numero-mesa" int NOT NULL,
	"Numero-lugares" int NOT NULL,
    
	CONSTRAINT "Pkey-mesa" PRIMARY KEY ("Numero-mesa") 
) 

CREATE TABLE public."ENTREGADOR" 
( 
    "Nome-entregador" character varying(80) NOT NULL, 
	"Cpf-entregador" int NOT NULL, 
	"Salario-entregador" numeric(8,2) NOT NULL,
    "Telefone" int NOT NULL,
    "Turno-entregador" character varying(1) NOT NULL, 
    "Sexo-entregador" character varying(1), 
    
	CONSTRAINT "Pkey-entregador" PRIMARY KEY ("Cpf-entregador") 
	
) 

CREATE TABLE public."CLIENTE-EXTERNO" 
( 
    "Nome-cliente" character varying(80) NOT NULL, 
	"Cpf-cliente" int NOT NULL, 
	"Endereço" character varying(150) NOT NULL, 
    "Telefone" int NOT NULL,
	"Celular" int NOT NULL,    
    
	CONSTRAINT "Pkey-cliente" PRIMARY KEY ("Cpf-cliente") 
	
)

CREATE TABLE public."COZINHEIRO" 
( 
    "Nome-cozinheiro" character varying(80) NOT NULL, 
	"Cpf-cozinheiro" int NOT NULL, 
	"Salario-cozinheiro" numeric(8,2) NOT NULL,
    "Telefone" int NOT NULL,
    "Turno-cozinheiro" character varying(1) NOT NULL, 
    "Sexo-cozinheiro" character varying(1), 
    
	CONSTRAINT "Pkey-cozinheiro" PRIMARY KEY ("Cpf-cozinheiro") 
) 

CREATE TABLE public."INGREDIENTE" 
( 
    "Numero-ingrediente" int NOT NULL,
	"Descricao" character varying (300) NOT NULL,
	
	CONSTRAINT "Pkey-numero-ingrediente" PRIMARY KEY ("Numero-ingrediente")
) 

CREATE TABLE public."ITEM-CARDAPIO" 
( 
    "Numero-item-cardapio" int NOT NULL,
	"Descricao" character varying (300) NOT NULL,
	"Valor-item" numeric (4,2) NOT NULL,
	
	CONSTRAINT "Pkey-numero-item-cardapio" PRIMARY KEY ("Numero-item-cardapio")
) 

CREATE TABLE public."INGREDIENTE-ITEM-CARDAPIO" 
( 
	"Quantidade-ingrediente" numeric(8,2) NOT NULL,
	"Numero-ingrediente" int NOT NULL,
	"Numero-item-cardapio" int NOT NULL,
	"Valor-ingrediente" numeric (4,2) NOT NULL,
	
	CONSTRAINT "Pkey-numero-ingrediente-item" PRIMARY KEY ("Numero-ingrediente"),
	
	CONSTRAINT "Fkey-numero-ingrediente" FOREIGN KEY ("Numero-ingrediente") 
        REFERENCES public."INGREDIENTE" ("Numero-ingrediente"),
	
	CONSTRAINT "Fkey-numero-item-cardapio" FOREIGN KEY ("Numero-item-cardapio") 
        REFERENCES public."ITEM-CARDAPIO" ("Numero-item-cardapio")
)

CREATE TABLE public."PEDIDO"
(
    "Numero-pedido" int NOT NULL,
    "Valor-desconto" numeric(2,2),
    "Cpf-gerente" int NOT NULL,
    "cpf-garcom" int NOT NULL,
    "cpf-cliente" int NOT NULL,
	"cpf-entregador" int NOT NULL,
    "numero-mesa" int NOT NULL,
	
    CONSTRAINT "Numero-pedido" PRIMARY KEY ("Numero-pedido"),
	
    CONSTRAINT "Fkey-cpf-cliente" FOREIGN KEY ("cpf-cliente")
        REFERENCES public."CLIENTE-EXTERNO" ("Cpf-cliente"),
	
    CONSTRAINT "Fkey-cpf-garcom" FOREIGN KEY ("cpf-garcom")
        REFERENCES public."GARCOM" ("Cpf-garcom"),
	
    CONSTRAINT "Fkey-cpf-gerente" FOREIGN KEY ("Cpf-gerente")
        REFERENCES public."GERENTE" ("Cpf-gerente"),
	
	CONSTRAINT "Fkey-cpf-entregador" FOREIGN KEY ("Cpf-entregador")
        REFERENCES public."ENTREGADOR" ("Cpf-entregador"),
	
    CONSTRAINT "Fkey-numero-mesa" FOREIGN KEY ("numero-mesa")
        REFERENCES public."MESA" ("Numero-mesa") 
)

CREATE TABLE public."ITEM-CARDAPIO-PEDIDO" 
( 
    "Numero-pedido" int NOT NULL,
	"Cpf-cozinheiro" int NOT NULL, 
	"Numero-item-cardapio" int NOT NULL,	
	"Numero-item-cardapio-pedido" int NOT NULL,
	
	CONSTRAINT "Pkey-numero-item-cardapio-pedido" PRIMARY KEY ("Numero-item-cardapio-pedido"),
	
	CONSTRAINT "Fkey-numero-pedido" FOREIGN KEY ("Numero-pedido") 
        REFERENCES public."PEDIDO" ("Numero-pedido"),	
	
	CONSTRAINT "Fkey-cpf-cozinheiro" FOREIGN KEY ("Cpf-cozinheiro") 
        REFERENCES public."COZINHEIRO" ("Cpf-cozinheiro"),
	
	CONSTRAINT "Fkey-numero-item-cardapio" FOREIGN KEY ("Numero-item-cardapio") 
        REFERENCES public."ITEM-CARDAPIO" ("Numero-item-cardapio")

) 

CREATE TABLE public."INGREDIENTE-ITEM-PEDIDO"
(
    "Quantidade-item-pedido" int NOT NULL,
    "Numero-ingrediente-cardapio" int NOT NULL,
    "Numero-item-cardapio-pedido" int NOT NULL,
	
    CONSTRAINT "INGREDIENTE-ITEM-PEDIDO_pkey" PRIMARY KEY ("Numero-ingrediente-cardapio"),
	
    CONSTRAINT "Numero-ingrediente-cardapio" FOREIGN KEY ("Numero-ingrediente-cardapio")
        REFERENCES public."INGREDIENTE-ITEM-CARDAPIO" ("Numero-ingrediente"),
	
    CONSTRAINT "Numero-item-cardapio-pedido" FOREIGN KEY ("Numero-item-cardapio-pedido")
        REFERENCES public."ITEM-CARDAPIO-PEDIDO" ("Numero-item-cardapio-pedido") 
	
)





