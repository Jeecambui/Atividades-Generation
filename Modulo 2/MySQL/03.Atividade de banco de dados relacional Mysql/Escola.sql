create database db_escola;
use db_escola;

CREATE TABLE tb_estudantes(
	id bigint auto_increment,
    nome varchar(255),
    nascimento date,
    turma int,
	media decimal(8,3),
    primary key (id)
);

INSERT INTO tb_estudantes (nome, nascimento, turma, media) VALUES ("Irmão do Jorel", "2009-02-20", 1, 9);
INSERT INTO tb_estudantes (nome, nascimento, turma, media) VALUES ("Jorel ", "2005-07-14", 3, 3);
INSERT INTO tb_estudantes (nome, nascimento, turma, media) VALUES ("Juliano Enrico", "2006-12-25", 1, 7);
INSERT INTO tb_estudantes (nome, nascimento, turma, media) VALUES ("Débora", "2008-11-25", 4, 4);
INSERT INTO tb_estudantes (nome, nascimento, turma, media) VALUES ("Carlos Felino", "1990-10-03", 1, 6);
INSERT INTO tb_estudantes (nome, nascimento, turma, media) VALUES ("Márcio Ririzon", "2008-05-23", 4, 8);
INSERT INTO tb_estudantes (nome, nascimento, turma, media) VALUES ("Lara", "2008-04-10", 2, 10);
INSERT INTO tb_estudantes (nome, nascimento, turma, media) VALUES ("Nico", "2000-07-03", 2, 2);

SELECT * FROM tb_estudantes;
SELECT * FROM tb_estudantes WHERE media < 7.00;
SELECT * FROM tb_estudantes WHERE media > 7.00;

UPDATE tb_estudantes SET media = 8.00 WHERE id = 4;