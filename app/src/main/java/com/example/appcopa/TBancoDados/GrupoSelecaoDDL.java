package com.example.appcopa.TBancoDados; // Substitua pelo package real do seu projeto

public class GrupoSelecaoDDL {
    // Nome da tabela e das colunas
    public static final String TABELA_NOME = "GrupoSelecao";
    public static final String COL_ID = "id";
    public static final String COL_ID_GRUPO = "id_grupo";
    public static final String COL_ID_SELECAO = "id_selecao";

    // Cria a tabela vinculando os IDs de Grupo e Selecao
    public static final String SCRIPT_CRIACAO = "CREATE TABLE IF NOT EXISTS " + TABELA_NOME + " ("
            + COL_ID + " INTEGER NOT NULL UNIQUE, "
            + COL_ID_GRUPO + " INTEGER NOT NULL, "
            + COL_ID_SELECAO + " INTEGER NOT NULL, "
            + "PRIMARY KEY(" + COL_ID + " AUTOINCREMENT), "
            + "FOREIGN KEY(" + COL_ID_GRUPO + ") REFERENCES Grupo(id), "
            + "FOREIGN KEY(" + COL_ID_SELECAO + ") REFERENCES Selecoes(id)"
            + ");";

    public static final String SCRIPT_DELETAR = "DROP TABLE IF EXISTS " + TABELA_NOME;
}