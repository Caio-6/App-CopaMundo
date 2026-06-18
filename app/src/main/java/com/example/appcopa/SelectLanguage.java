package com.example.appcopa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.appcopa.TBancoDados.model.ConfiguracaoModel;
import com.example.appcopa.TBancoDados.util.CodigoLinguaEnum;


public class SelectLanguage extends AppCompatActivity {
    private ConfiguracaoModel banco_dados= new ConfiguracaoModel(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_select_language);

        configBotao(R.id.portugues,CodigoLinguaEnum.PORTUGUES_BR);
        configBotao(R.id.english,CodigoLinguaEnum.INGLES);
    }

    private void configBotao(int idBtn, final CodigoLinguaEnum linguaEnum)
    {
        Button btn=findViewById(idBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processLingua(linguaEnum);
            }
        });
    }
    private void processLingua(CodigoLinguaEnum codLingua)
    {
        String cod=codLingua.getCodLingua();
        if(!cod.isBlank())
        {
            //Configuração do banco de dados
            banco_dados.SalvarLingua(cod);

            Toast.makeText(this,"Lingua salva no banco",Toast.LENGTH_SHORT).show();
            //Start de Intent
            Intent intent = new Intent(this,GrupoSelecao.class);
            startActivity(intent);
            finish();
        }else{
            Toast.makeText(this,"Erro ao salvar lingua",Toast.LENGTH_SHORT).show();
        }
    }
}