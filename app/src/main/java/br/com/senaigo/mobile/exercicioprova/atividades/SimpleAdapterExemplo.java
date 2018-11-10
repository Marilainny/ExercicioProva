package br.com.senaigo.mobile.exercicioprova.atividades;

import android.os.Bundle;
import android.view.View;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.senaigo.mobile.exercicioprova.R;
import br.com.senaigo.mobile.exercicioprova.model.Pessoa;

public class SimpleAdapterExemplo extends DefaultAtctivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void adicionar(View view) {

        txtNome = findViewById(R.id.txtNome);


        String nome;

        nome = txtNome.getText().toString();


        Pessoa pessoa = new Pessoa(nome);

        lista.add(pessoa);

        List<String> colecaoArrayAdapter = new ArrayList<>();

        List<HashMap<String, String>> colecao = new ArrayList<>();

        for (Pessoa p : lista) {
            HashMap<String, String> map = new HashMap<>();
            map.put("nome", p.getNome());
            colecao.add(map);
            colecaoArrayAdapter.add(p.getNome());
        }
        String[] de = {"nome"};
        int[] para = {R.id.txtNome};

    }
}
