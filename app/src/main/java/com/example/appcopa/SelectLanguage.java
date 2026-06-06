package com.example.appcopa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.intellij.lang.annotations.Language;

import java.util.Locale;

public class SelectLanguage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_select_language);

        int[] btnIdiomas={R.id.portugues,R.id.english,R.id.espanhol,R.id.nihongo,R.id.koreano,
                R.id.francais,R.id.italiano,R.id.russo,R.id.portugal};
        Intent intent=new Intent(SelectLanguage.this,MainActivity.class);
        View.OnClickListener listenerIdiomas= new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int idClick= view.getId();

                if(idClick==R.id.portugues)
                {
                    String cdIdioma="pt";
                }
            }
        }
        for(int id:btnIdiomas)
        {
            Button btn=findViewById(id);
            btn.setOnClickListener()
        }
    }
    private void mudarIdioma(String codigoIdioma){
        Locale locale = new Locale(codigoIdioma);
        Locale.setDefault(Lo);
    }
}