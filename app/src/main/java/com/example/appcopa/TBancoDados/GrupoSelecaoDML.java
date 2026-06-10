package com.example.appcopa.TBancoDados; // Substitua pelo package real do seu projeto

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.example.appcopa.ConexaoSqlite;

public class GrupoSelecaoDML {

    private final ConexaoSqlite conexao;

    public GrupoSelecaoDML(Context context) {
        this.conexao = new ConexaoSqlite(context);
    }

    /**
     * DML: INSERT - Associa um ID de grupo a um ID de seleção
     */
    public boolean associarGrupoSelecao(int idGrupo, int idSelecao) {
        SQLiteDatabase db = conexao.getWritableDatabase();
        ContentValues valores = new ContentValues();

        valores.put(GrupoSelecaoDDL.COL_ID_GRUPO, idGrupo);
        valores.put(GrupoSelecaoDDL.COL_ID_SELECAO, idSelecao);

        long resultado = db.insert(GrupoSelecaoDDL.TABELA_NOME, null, valores);
        db.close();

        return resultado != -1;
    }

    /**
     * DML: DELETE - Remove a associação específica entre o grupo e a seleção
     */
    public boolean removerAssociacao(int id) {
        SQLiteDatabase db = conexao.getWritableDatabase();

        String condicaoWhere = GrupoSelecaoDDL.COL_ID + " = ?";
        String[] argumentosWhere = { String.valueOf(id) };

        int linhasEliminadas = db.delete(GrupoSelecaoDDL.TABELA_NOME, condicaoWhere, argumentosWhere);
        db.close();

        return linhasEliminadas > 0;
    }

    /**
     * DML: SELECT - Busca todos os cruzamentos da tabela
     */
    public Cursor buscarTodosRelacionamentos() {
        SQLiteDatabase db = conexao.getReadableDatabase();
        String query = "SELECT * FROM " + GrupoSelecaoDDL.TABELA_NOME;
        return db.rawQuery(query, null);
    }
}