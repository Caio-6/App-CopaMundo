package com.example.appcopa;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.appcopa.TBancoDados.database.DDL.ConfiguracaoDDL;
import com.example.appcopa.TBancoDados.database.DDL.EstadiosDDL;
import com.example.appcopa.TBancoDados.database.DDL.GrupoDDL;
import com.example.appcopa.TBancoDados.database.DDL.GrupoSelecaoDDL;
import com.example.appcopa.TBancoDados.database.DDL.LinguaDDL;
import com.example.appcopa.TBancoDados.database.DDL.SelecaoDDL;

public class ConexaoSqlite extends SQLiteOpenHelper {

    // Configurações do Banco de Dados
    private static final String NOME_BANCO = "app_copa.db";
    private static final int VERSAO_BANCO = 1;

    // Constantes da Tabela Estadios


    public ConexaoSqlite(Context context) {
        super(context, NOME_BANCO, null, VERSAO_BANCO);
        // Caminho oficial onde o Android armazena e lê os bancos de dados
    }

    //Configuração pra foreign key
    @Override
    public void onConfigure(SQLiteDatabase db)
    {
        super.onConfigure(db);
        db.setForeignKeyConstraintsEnabled(true);
    }
    // Método chamado na primeira vez que o banco de dados é criado
    @Override
    public void onCreate(SQLiteDatabase db) {

        // Executa o script SQL de criação
        db.execSQL(EstadiosDDL.SCRIPT_CRIACAO);
        db.execSQL(LinguaDDL.SCRIPT_CRIACAO);
        db.execSQL(ConfiguracaoDDL.SCRIPT_CRIACAO);
        db.execSQL(SelecaoDDL.SCRIPT_CRIACAO);
        db.execSQL(GrupoDDL.SCRIPT_CRIACAO);
        db.execSQL(GrupoSelecaoDDL.SCRIPT_CRIACAO);
    }

    // Método chamado quando você altera a VERSAO_BANCO (útil para atualizações futuras)
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Por enquanto, deleta a tabela antiga e recria uma nova
        db.execSQL(EstadiosDDL.SCRIPT_DELELTAR);
        db.execSQL(LinguaDDL.SCRIPT_DELETAR);
        db.execSQL(ConfiguracaoDDL.SCRIPT_DELETAR);
        db.execSQL(SelecaoDDL.SCRIPT_DELETAR);
        db.execSQL(GrupoDDL.SCRIPT_DELETAR);
        db.execSQL(GrupoSelecaoDDL.SCRIPT_DELETAR);
        onCreate(db);
    }
}