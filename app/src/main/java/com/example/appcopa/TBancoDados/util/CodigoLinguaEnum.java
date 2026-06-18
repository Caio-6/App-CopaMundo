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

    public static CodigoLinguaEnum procLingua(String cod)
    {
        for(CodigoLinguaEnum lingua:values())
        {
            if(lingua.getCodLingua().equals(cod))
            {
                return lingua;
            }
        }
        throw new IllegalArgumentException("Lingua não mapeada: " + cod);
    }

}
