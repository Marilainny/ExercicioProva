package br.com.senaigo.mobile.exercicioprova.atividades;

import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.com.senaigo.mobile.exercicioprova.model.Pessoa;

public class DefaultAtctivity extends AppCompatActivity {

    public EditText txtNome;
    public List<Pessoa> lista = new ArrayList<>();
    public ListView minhaLista;
}
