package com.example.appcopa.TBancoDados.util;

public enum CodigoLinguaEnum {
    PORTUGUES_BR("pt-BR",1),
    PORTUGUES_PT("pt-PT",2),
    INGLES("en",3),
    ESPANHOL("es",4),
    JAPONES("ja",5),
    COREANO("ko",6),
    FRANCES("fr",7),
    RUSSO("ru",8),
    ITALIANO("it",9);

    private final String codLingua;
    private final int id;
    CodigoLinguaEnum(String codLingua, int id) {
        this.codLingua = codLingua;
        this.id=id;
    }

    public String getCodLingua() {
        return codLingua;
    }

    public int getId()
    {
        return id;
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
