create database db_generation_game_online;
use db_generation_game_online;

create table tb_classe(
	id bigint auto_increment,
    classe varchar(255),
    nivel int,
    vida int,    
    primary key (id)
);

INSERT INTO tb_classe (classe, nivel, vida) VALUES ("Mago(a)", 50, 5000);
INSERT INTO tb_classe (classe, nivel, vida) VALUES ("Arqueira(o)", 64, 4500);
INSERT INTO tb_classe (classe, nivel, vida) VALUES ("Guerreira(o)", 8 , 1800);
INSERT INTO tb_classe (classe, nivel, vida) VALUES ("Bruxa(o)", 70 , 10000);
INSERT INTO tb_classe (classe, nivel, vida) VALUES ("Vampiro", 13 , 8000);
INSERT INTO tb_classe (classe, nivel, vida) VALUES ("Lobo", 23 , 1400);
INSERT INTO tb_classe (classe, nivel, vida) VALUES ("Troll", 35 , 4000);
INSERT INTO tb_classe (classe, nivel, vida) VALUES ("Humano", 1, 500);

create table tb_personagem(
	id bigint auto_increment,
    ataque int,
    superAtaqueApelao char(255),
    defesa int,
    mana int,
    stamina int,
    classe_id bigint,
	primary key (id),
    foreign key (classe_id) References tb_classe(id)
);

INSERT INTO tb_personagem (ataque, superAtaqueApelao, defesa, mana, stamina, classe_id) VALUES (1000, "Super Bola Gigante de Neve", 3000, 5000 ,10000,1);
INSERT INTO tb_personagem (ataque, superAtaqueApelao, defesa, mana, stamina, classe_id) VALUES (3000, "Super Bola Gigante de Fogo", 3000, 7000 ,8000,2);
INSERT INTO tb_personagem (ataque, superAtaqueApelao, defesa, mana, stamina, classe_id) VALUES (1500, "Super Bola Gigante de Chiclete", 8000, 10000 ,5000,3);
INSERT INTO tb_personagem (ataque, superAtaqueApelao, defesa, mana, stamina, classe_id) VALUES (800, "Raio Ultra Gigante", 3000, 5000 ,4000,4);
INSERT INTO tb_personagem (ataque, superAtaqueApelao, defesa, mana, stamina, classe_id) VALUES (900, "Mega Gelo com 3 Laminas", 2500, 7000 ,7500,5);
INSERT INTO tb_personagem (ataque, superAtaqueApelao, defesa, mana, stamina, classe_id) VALUES (50000, "Super Soco", 500, 9000 ,9000,6);
INSERT INTO tb_personagem (ataque, superAtaqueApelao, defesa, mana, stamina, classe_id) VALUES (2500, "Mega Lazer Gigante", 3000, 5000 ,7500,7);
INSERT INTO tb_personagem (ataque, superAtaqueApelao, defesa, mana, stamina, classe_id) VALUES (10000, "MEGA ULTRA BLASTER MASTER VOADORA DE DOIS PÉ", 1000, 3000 ,8500,8);

SELECT * FROM tb_personagem;

SELECT * FROM tb_personagem WHERE ataque < 2000;

SELECT * FROM tb_personagem WHERE defesa between 1000 and 2000;

SELECT * FROM tb_personagem WHERE stamina LIKE "%C%";

SELECT tb_classe.classe,tb_classe.nivel,tb_classe.vida, tb_personagem.ataque, tb_personagem.superAtaqueApelao, tb_personagem.defesa, tb_personagem.mana, tb_personagem.stamina, tb_personagem.classe_id
FROM tb_personagem
INNER JOIN tb_classe
ON tb_classe.id = tb_personagem.id;


SELECT tb_classe.classe,tb_classe.nivel,tb_classe.vida, tb_personagem.ataque, tb_personagem.superAtaqueApelao, tb_personagem.defesa, tb_personagem.mana, tb_personagem.stamina, tb_personagem.classe_id
FROM tb_personagem
INNER JOIN tb_classe
ON tb_classe.id = tb_personagem.id where tb_classe.id = 5;