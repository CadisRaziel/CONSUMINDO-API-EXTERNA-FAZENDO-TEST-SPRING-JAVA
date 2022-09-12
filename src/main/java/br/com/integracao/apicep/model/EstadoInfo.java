package br.com.integracao.apicep.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EstadoInfo {

    @JsonProperty(value = "area_km2")
    private String area;

    @JsonProperty(value = "codigo_ibge")
    private String codigoIBGE;

    private String nome;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(String codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "EstadoInfo{" +
                "area='" + area + '\'' +
                ", codigoIBGE='" + codigoIBGE + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}

// "estado_info": {
//        "area_km2": "248.221,996",
//        "codigo_ibge": "35",
//        "nome": "São Paulo"
//        },