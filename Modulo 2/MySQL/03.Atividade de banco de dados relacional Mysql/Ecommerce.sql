create database db_ecommerce;
use db_ecommerce;

CREATE TABLE tb_produtos(
	id bigint auto_increment,
    nome varchar(255),
    genero varchar(255),
    categoria varchar(100),
    preco decimal(8,3),
    primary key (id)
);

INSERT INTO tb_produtos (nome, genero, categoria, preco) VALUES ("Vestido", "Feminino", "Vestidos", 100.00);
INSERT INTO tb_produtos (nome, genero, categoria, preco) VALUES ("Sapato", "Masculino", "Jeans", 120.00);
INSERT INTO tb_produtos (nome, genero, categoria, preco) VALUES ("Boné", "Unissex", "Acessórios", 50.00);
INSERT INTO tb_produtos (nome, genero, categoria, preco) VALUES ("Blusa de Moleton", "Masculino", "Blusas", 550.00);
INSERT INTO tb_produtos (nome, genero, categoria, preco) VALUES ("Boina", "Unissex", "Acessórios", 120.00);
INSERT INTO tb_produtos (nome, genero, categoria, preco) VALUES ("Calça skinny", "Feminino", "Calça", 50.00);
INSERT INTO tb_produtos (nome, genero, categoria, preco) VALUES ("Camiseta básica", "Unissex", "Básico", 30.00);
INSERT INTO tb_produtos (nome, genero, categoria, preco) VALUES ("Calça skinny", "Masculina", "Calça", 120.00);

SELECT * FROM tb_produtos;
SELECT * FROM tb_produtos WHERE preco < 500.00;
SELECT * FROM tb_produtos WHERE preco > 500.00;

UPDATE tb_produtos SET preco = 600.00 WHERE id = 4;