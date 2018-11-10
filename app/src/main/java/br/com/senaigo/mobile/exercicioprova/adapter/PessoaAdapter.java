package br.com.senaigo.mobile.exercicioprova.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import br.com.senaigo.mobile.exercicioprova.model.Pessoa;
import br.com.senaigo.mobile.exercicioprova.R;


import java.util.List;

public class PessoaAdapter extends BaseAdapter {

    Context context;
    List<Pessoa> colecao;
    LayoutInflater inflter;

    public PessoaAdapter(final Context applicationContext,
                         final List<Pessoa> colecao) {
        this.context = applicationContext;
        this.colecao = colecao;

    }

    @Override
    public int getCount() {
        return this.colecao != null ? this.colecao.size() : 0;
    }

    @Override
    public Object getItem(int i) {
        return this.colecao.get(i);
    }

    private Pessoa parsetItem(int i) {
        return this.colecao.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null) {
            view = LayoutInflater.from(context).
                    inflate(R.layout.activity_main,
                            viewGroup, false);
        }

        Pessoa pessoa = parsetItem(i);

        TextView campoNome;

        campoNome = view.findViewById(R.id.nome);

        campoNome.setText(pessoa.getNome());

        return view;
    }
}
