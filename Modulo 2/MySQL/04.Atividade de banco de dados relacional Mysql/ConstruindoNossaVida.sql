create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;


create table tb_categorias(
	id bigint auto_increment,
	tipo varchar(20),
    estoque boolean,
	primary key (id)
);

insert into tb_categorias(tipo, estoque) values ("Cimento",true);
insert into tb_categorias(tipo, estoque) values ("Tijolo",true);
insert into tb_categorias(tipo, estoque) values ("Cabos",true);
insert into tb_categorias(tipo, estoque) values ("Tinta",true);
insert into tb_categorias(tipo, estoque) values ("Areia",true);

select * from tb_categorias;

create table tb_produto(
	id bigint auto_increment,
	nome varchar(255),
    quant int,
    preco decimal(8,3),
    categoria_id bigint,
	foreign key (categoria_id) references tb_categorias(id),
    primary key (id)
);

insert into tb_produto(nome, quant, preco, categoria_id) values ("Tinta Suvinil",500,20.00 ,4);
insert into tb_produto(nome, quant, preco, categoria_id) values ("Areia AB Areias",600, 4.59,5);
insert into tb_produto(nome, quant, preco, categoria_id) values ("Bloco Cerâmico Nova Conquista",1000, 1.99,2);
insert into tb_produto(nome, quant, preco, categoria_id) values ("Tinta Coral",500, 20,4);
insert into tb_produto(nome, quant, preco, categoria_id) values ("Cimento Nacional",2500, 20,1);
insert into tb_produto(nome, quant, preco, categoria_id) values ("Cabo Flexível Cobrecom",1500, 199.89,3);
insert into tb_produto(nome, quant, preco, categoria_id) values ("Cabo de Rede Forceline",2000, 17.76,3);
insert into tb_produto(nome, quant, preco, categoria_id) values ("Cimento Argos",200, 2.09 ,1);

select * from tb_produto;

select * from tb_produto where preco > 50;
select * from tb_produto where preco between 3 and 60;
select * from tb_produto where preco >= 3 and preco <= 60;
select * from tb_produto where nome like "%C%";


select * from tb_produto inner join tb_categorias
on tb_categorias.id = tb_produto.categoria_id;

select * from tb_produto inner join tb_categorias
on tb_categorias.id = tb_produto.categoria_id
where tb_categorias.id = 4;
);