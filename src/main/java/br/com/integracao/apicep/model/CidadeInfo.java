package br.com.integracao.apicep.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CidadeInfo {

    @JsonProperty(value = "area_km2")
    private String area;


    @JsonProperty(value = "codigo_ibge")
    private String codigoIBGE;

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

    @Override
    public String toString() {
        return "CidadeInfo{" +
                "area='" + area + '\'' +
                ", codigoIBGE='" + codigoIBGE + '\'' +
                '}';
    }
}

//"cidade_info": {
//        "area_km2": "431,944",
//        "codigo_ibge": "3549805"
//        },