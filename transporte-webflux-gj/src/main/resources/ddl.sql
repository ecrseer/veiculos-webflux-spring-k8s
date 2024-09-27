CREATE TABLE transporte
(
    id                 BIGINT AUTO_INCREMENT PRIMARY KEY,
    veiculo          BIGINT NULL,
    CEP                VARCHAR(255) NULL,
    estado             VARCHAR(255) NULL,
    cidade             VARCHAR(255) NULL,
    bairro             VARCHAR(255) NULL,
    logradouro         VARCHAR(255) NULL
);

