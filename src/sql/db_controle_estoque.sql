CREATE DATABASE db_controle_estoque;

USE db_controle_estoque;

CREATE TABLE tb_categorias (
	id_categoria int not null,
    nome varchar(100) not null,
    PRIMARY KEY (id_categoria)
) ENGINE = InnoDB;

CREATE TABLE tb_produtos (
	id_produto int not null,
    nome varchar(100) not null,
    quantidade int not null,
    preco decimal (10,2) not null,
    id_categoria int not null,
    id_fornecedor int not null,
    PRIMARY KEY (id_produto),
    CONSTRAINT fk_id_categoria FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id_categoria)
) ENGINE = InnoDB;

