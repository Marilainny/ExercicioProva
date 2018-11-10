package br.com.senaigo.mobile.exercicioprova.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import br.com.senaigo.mobile.exercicioprova.R;
import br.com.senaigo.mobile.exercicioprova.model.Product;

public class ProductAdapter extends BaseAdapter {

    Context context;
    List<Product> colecao;
    LayoutInflater inflter;

    public ProductAdapter(final Context applicationContext,
                          final List<Product> colecao) {
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

    private Product parsetItem(int i) {
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

        Product product = parsetItem(i);

        TextView campoNome;

        campoNome = view.findViewById(R.id.txtNome);

        campoNome.setText(product.getCodigo());

        return view;
    }
}
