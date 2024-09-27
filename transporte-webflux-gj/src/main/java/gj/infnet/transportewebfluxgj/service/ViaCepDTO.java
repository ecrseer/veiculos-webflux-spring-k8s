package gj.infnet.transportewebfluxgj.service;

import lombok.Data;

@Data
public class ViaCepDTO {

    private String cep;
    private String logradouro;
    private String complemento;
    private String unidade;
    private String bairro;
    private String localidade;
    private String uf;
    private String estado;
    private String regiao;
    private String ibge;
    private String gia;
    private String ddd;


    public ViaCepDTO( String CEP, String estado, String cidade, String bairro, String logradouro) {
        this.cep = CEP;
        this.estado = estado;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.localidade = cidade;
    }
}
