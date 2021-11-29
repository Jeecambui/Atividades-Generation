create database db_pizzaria_legal;
use db_pizzaria_legal;

CREATE TABLE tb_categoria(
	id bigint auto_increment,
	nome varchar(255),
    tamanho VARCHAR(1),
	tipo VARCHAR(255),
    doce BOOLEAN,
    salgado BOOLEAN,
    gluten BOOLEAN,
    PRIMARY KEY(id)
);

INSERT INTO tb_categoria (tamanho, tipo, doce, salgado, gluten) VALUES ("G", "Doce", true, false, false);
INSERT INTO tb_categoria (tamanho, tipo, doce, salgado, gluten) VALUES ("M", "Salgado", false, true, true);
INSERT INTO tb_categoria (tamanho, tipo, doce, salgado, gluten) VALUES ("P", "Doce", true, false, true);
INSERT INTO tb_categoria (tamanho, tipo, doce, salgado, gluten) VALUES ("G", "Salgado", false, true, false);
INSERT INTO tb_categoria (tamanho, tipo, doce, salgado, gluten) VALUES ("M", "Salgado", false, true, true);

create table tb_pizza(
	id bigint auto_increment,
	sabor VARCHAR(255),
    massa VARCHAR(30),
    borda VARCHAR(30),
    preco DECIMAL(8,2),
    PRIMARY KEY(id),
    foreign key (tamanho_id) references tb_categoria(id)
    );

INSERT INTO tb_pizza (sabor, massa, borda, preco, tamanho_id) VALUES ("Marguerita", "Grossa", "Catupiry", 31.99, 3);
INSERT INTO tb_pizza (sabor, massa, borda, preco, tamanho_id) VALUES ("Chocolate", "Fina", "Não Tem", 40.50, 2);
INSERT INTO tb_pizza (sabor, massa, borda, preco, tamanho_id) VALUES ("Bauru", "Fina", "Catupiry", 45.99, 1);
INSERT INTO tb_pizza (sabor, massa, borda, preco, tamanho_id) VALUES ("Atum", "Siciliana", "Catupiry", 39.80, 1);
INSERT INTO tb_pizza (sabor, massa, borda, preco, tamanho_id) VALUES ("Três Queijos", "Nova-Iorquina","Catupiry", 60,00,2);
INSERT INTO tb_pizza (sabor, massa, borda, preco, tamanho_id) VALUES ("Brocolis", "Fina", "Cheddar", 31.99, 3);
INSERT INTO tb_pizza (sabor, massa, borda, preco, tamanho_id) VALUES ("Morango", "Napolitana", "Chocolate" , 31.99,4);
INSERT INTO tb_pizza (sabor, massa, borda, preco, tamanho_id) VALUES ("Banana", "Grossa", "Chocolate", 55.00,5);

select * from tb_pizza where preco > 45;

select * from tb_pizza where preco > 29 and preco < 60;

select * from tb_pizza where nome like "c%";

select tb_pizza.id,tb_pizza.nome,tb_pizza.preco,tb_pizza.massa  from tb_pizza 
inner join tb_categoria on tb_pizza.categoria=tb_categoria.id where tb_categoria.tipo="Doce";