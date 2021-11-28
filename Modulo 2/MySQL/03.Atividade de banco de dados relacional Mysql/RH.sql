create database db_rh;
use db_rh;

create table tb_funcionaries(
	id bigint auto_increment,
    nome varchar(255),
    nascimento date,
    cargo varchar(255),
    salario decimal(8,3),
    primary key(id)    
);

INSERT INTO tb_funcionaries (nome, nascimento, cargo, salario) VALUES ("Harry James Potter", "1990-04-20", "Estoquista", 1200.00);
INSERT INTO tb_funcionaries (nome, nascimento, cargo, salario) VALUES ("Lord Voldemort", "1850-02-25", "Entregador", 1300.00);
INSERT INTO tb_funcionaries (nome, nascimento, cargo, salario) VALUES ("Hermione Granger", "1990-07-24", "Gerente", 1200.00);
INSERT INTO tb_funcionaries (nome, nascimento, cargo, salario) VALUES ("Draco Malfoy", "1989-07-30", "Atendente", 1250.00);
INSERT INTO tb_funcionaries (nome, nascimento, cargo, salario) VALUES ("Ronald Weasley", "1992-11-22", "Atendente", 1250.00);

SELECT * FROM tb_funcionaries;
SELECT * FROM tb_funcionaries WHERE salario < 2000.00;
SELECT * FROM tb_funcionaries WHERE salario > 2000.00;

UPDATE tb_funcionaries SET salario = 2100.00 WHERE id = 2;

