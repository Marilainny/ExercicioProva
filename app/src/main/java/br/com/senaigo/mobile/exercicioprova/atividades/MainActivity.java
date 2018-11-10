package br.com.senaigo.mobile.exercicioprova.atividades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import br.com.senaigo.mobile.exercicioprova.R;

public class MainActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void simpleAdapterExemplo(View view) {

        startActivity(new Intent(this,SimpleAdapterExemplo.class));
    }

   /* public void arrayAdapterExemplo(View view) {
        startActivity(new Intent(this,ArrayAdapterExemplo.class));
    }

    public void baseAdapterExemplo(View view) {
        startActivity(new Intent(this,BaseAdapterExemplo.class));
    }*/
}
