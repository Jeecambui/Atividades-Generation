create database db_cidade_das_frutas;
use db_cidade_das_frutas;

create table tb_categoria(
id bigint auto_increment unique,
tipo varchar(255),
estoque boolean,
delivery varchar(255),
primary key (id)
);

insert into tb_categoria(tipo,estoque,delivery) values ("Congelados",true,true);
insert into tb_categoria(tipo,estoque,delivery) values ("Congelados",false,true);
insert into tb_categoria(tipo,estoque,delivery) values ("Frescos",true,true);
insert into tb_categoria(tipo,estoque,delivery) values ("Frescos",true,false);
insert into tb_categoria(tipo,estoque,delivery) values ("Frescos",false,false);

select * from tb_categoria;


create table tb_produto(
id bigint auto_increment unique,
nome varchar(255),
quantidade int,
preco decimal(8,2),
tipo varchar(255),
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria(id)
);

insert into tb_produto(nome,quantidade,preco,tipo,categoria_id) values ("Morango",59,10.99,"Fruta",3);
insert into tb_produto(nome,quantidade,preco,tipo,categoria_id) values ("Melancia",25,8.50,"Fruta",1);
insert into tb_produto(nome,quantidade,preco,tipo,categoria_id) values ("Kiwi",17,14.90,"Fruta",4);
insert into tb_produto(nome,quantidade,preco,tipo,categoria_id) values ("Alface",37,10.99,"Verdura",3);
insert into tb_produto(nome,quantidade,preco,tipo,categoria_id) values ("Rúcula",41,3.80,"Hortaliça",5);
insert into tb_produto(nome,quantidade,preco,tipo,categoria_id) values ("Tomate",32,5.80,"Fruta",4);
insert into tb_produto(nome,quantidade,preco,tipo,categoria_id) values ("Cebola",18,4.99,"Legume",3);
insert into tb_produto(nome,quantidade,preco,tipo,categoria_id) values ("Espinafre",28,3.50,"Hortaliça",3);

select * from tb_produto;

select * from tb_produto where preco > 50;
select * from tb_produto where preco >= 3 and preco <= 60;
select * from tb_produto where nome like "%c%";


select tb_categoria.tipo, tb_categoria.estoque, tb_categoria.delivery,
tb_produto.nome, tb_produto.quantidade, tb_produto.preco, tb_produto.tipo, tb_produto.categoria_id
from  tb_categoria inner join tb_produto on tb_categoria.id = tb_produto.categoria_id;

select tb_categoria.tipo, tb_categoria.estoque, tb_categoria.delivery,
tb_produto.nome, tb_produto.quantidade, tb_produto.preco, tb_produto.tipo, tb_produto.categoria_id
from  tb_categoria inner join tb_produto on tb_categoria.id = tb_produto.categoria_id
where categoria_id = 4;