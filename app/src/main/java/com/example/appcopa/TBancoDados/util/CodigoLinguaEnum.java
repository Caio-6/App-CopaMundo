package com.example.appcopa.TBancoDados.util;

public enum CodigoLinguaEnum {
    PORTUGUES_BR("pt-BR"),
    PORTUGUES_PT("pt-PT"),
    INGLES("en"),
    ESPANHOL("es"),
    JAPONES("ja"),
    COREANO("ko"),
    FRANCES("fr"),
    RUSSO("ru"),
    ITALIANO("it");

    private final String codLingua;
    CodigoLinguaEnum(String codLingua) {
        this.codLingua = codLingua;
    }

    public String getCodLingua() {
        return codLingua;
    }

}
