--Apaga as tabelas
DROP TABLE IF EXISTS tarefa CASCADE;


--Tabela tarefa
CREATE TABLE tarefa (
    id serial,
    titulo varchar(20),
    texto varchar,
    criador varchar(30),
    PRIMARY KEY (id)
);

INSERT INTO tarefa VALUES (DEFAULT, 'Teste 1', 'Texto de texte para a primeira tarefa cadastrada no banco, com isso pretende-se verificar se os
recursos de acesso ao banco estão funcionando corretamente, desde o webservice até o retrofit do android, é matematico. :v','usuario155');

SELECT * FROM tarefa;
