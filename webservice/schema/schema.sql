--Apaga as tabelas
DROP TABLE IF EXISTS pedido CASCADE;

--Tabela pedido
CREATE TABLE pedido (
    n_pedido int AUTO_INCREMENT,
    n_mesa integer,
    tamanho varchar(15),
    fruta varchar(15),
    acomp varchar(15),
    cobertura varchar(15),
    PRIMARY KEY (n_pedido)
);
