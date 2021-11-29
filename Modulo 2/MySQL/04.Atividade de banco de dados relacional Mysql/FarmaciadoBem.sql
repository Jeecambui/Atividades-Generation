create database db_farmacia_do_bem;
use db_farmacia_do_bem;

create table tb_categoria(
	id bigint auto_increment,
	tipo varchar(20),
    estoque boolean,
	primary key (id)
);

insert into tb_categoria(tipo, estoque) values ("Remedios",true);
insert into tb_categoria(tipo, estoque) values ("Vitamina",true);
insert into tb_categoria(tipo, estoque) values ("Suplemento Alimentar",true);
insert into tb_categoria(tipo, estoque) values ("Higiene",true);
insert into tb_categoria(tipo, estoque) values ("Beleza",true);

select * from tb_categoria;

create table tb_produto(
	id bigint auto_increment,
	nome varchar(255),
    quant int,
    preco decimal(8,3),
    categoria_id bigint,
	foreign key (categoria_id) references tb_categoria(id),
    primary key (id)
);

insert into tb_categoria(nome, quant, preco, categoria_id) values ("Dipirona", 1000, 4.50, 1);
insert into tb_categoria(nome, quant, preco, categoria_id) values ("Dorflex", 1500, 5.00, 1);
insert into tb_categoria(nome, quant, preco, categoria_id) values ("Shampoo", 500, 8.99, 5);
insert into tb_categoria(nome, quant, preco, categoria_id) values ("Whey", 2000, 20.50, 3);
insert into tb_categoria(nome, quant, preco, categoria_id) values ("Vitamina", 10300, 7.80, 3);
insert into tb_categoria(nome, quant, preco, categoria_id) values ("Sabonete", 2000, 2.50, 4);
insert into tb_categoria(nome, quant, preco, categoria_id) values ("Desodorante", 1000, 4.50, 4);
insert into tb_categoria(nome, quant, preco, categoria_id) values ("Cinegripe", 900, 4.00, 1);

select * from tb_produto;

select * from tb_produto where preco > 50;
select * from tb_produto where preco between 3 and 60;
select * from tb_produto where preco >= 3 and preco <= 60;
select * from tb_produto where nome like "%B%";


select * from tb_produto inner join tb_categoria
on tb_categoria.id = tb_produto.categoria_id;

select * from tb_produto inner join tb_categoria
on tb_categoria.id = tb_produtos.categoria_id 
where tb_categoria.id = 1;