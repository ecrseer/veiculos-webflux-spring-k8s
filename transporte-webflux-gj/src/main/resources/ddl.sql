CREATE TABLE transporte
(
    id                 BIGINT NOT NULL,
    veiculoId          BIGINT,
    dataInicio         DATETIME,
    dataFim            DATETIME,
    responsavelEntrega VARCHAR(255),
    CEP                VARCHAR(255),
    estado             VARCHAR(255),
    cidade             VARCHAR(255),
    bairro             VARCHAR(255),
    logradouro         VARCHAR(255),
    duracaoHoras       INT,
    PRIMARY KEY (id)
);

