package br.com.integracao.apicep.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CepInfo {
    //Como eu pego dados da api, os nomes do modelo devem ser exatamente iguais ao da api externa
    //caso eu queira colocar meu proprio nome
    //devo adicionar o @JsonProperty(value = "") com o nome correto do atributo da api externa
    @JsonProperty(value = "bairro")
    private String neiborgood;

    private String cidade;

    @JsonProperty(value = "estado_info")
    private EstadoInfo estadoInfo;

    private String cep;

    @JsonProperty(value = "cidade_info")
    private CidadeInfo cidadeInfo;

    private String estado;

    public String getNeiborgood() {
        return neiborgood;
    }

    public void setNeiborgood(String neiborgood) {
        this.neiborgood = neiborgood;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public EstadoInfo getEstadoInfo() {
        return estadoInfo;
    }

    public void setEstadoInfo(EstadoInfo estadoInfo) {
        this.estadoInfo = estadoInfo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public CidadeInfo getCidadeInfo() {
        return cidadeInfo;
    }

    public void setCidadeInfo(CidadeInfo cidadeInfo) {
        this.cidadeInfo = cidadeInfo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "CepInfo{" +
                "neiborgood='" + neiborgood + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estadoInfo=" + estadoInfo +
                ", cep='" + cep + '\'' +
                ", cidadeInfo=" + cidadeInfo +
                ", estado='" + estado + '\'' +
                '}';
    }
}



//        "complemento": "de 1500/1501 ao fim",
//        "bairro": "Vila Maceno",
//        "cidade": "São José do Rio Preto",
//        "logradouro": "Rua São Paulo",
//        "estado_info": {
//        "area_km2": "248.221,996",
//        "codigo_ibge": "35",
//        "nome": "São Paulo"
//        },
//        "cep": "15060035",
//        "cidade_info": {
//        "area_km2": "431,944",
//        "codigo_ibge": "3549805"
//        },
//        "estado": "SP"
