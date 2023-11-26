package com.senai.produtos;

public enum CondicaoEnum {

    USADO("Usado"),
    SEMINOVO("Semi-novo"),
    NOVO("Novo");

    private String condicao;

    private CondicaoEnum(String condicao)  {this.condicao = condicao; }

    public String getStatus() { return condicao;}
}
