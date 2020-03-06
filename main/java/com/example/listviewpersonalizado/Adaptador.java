package com.example.listviewpersonalizado;

import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    Context context;
    ArrayList<ModeloItem> lista = new ArrayList<>();

    public Adaptador(Context context, ArrayList<ModeloItem> lista) {
        this.context = context;
        this.lista=lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ModeloItem item = (ModeloItem)getItem(position);
        convertView = LayoutInflater.from(context).inflate(R.layout.layout_item,null);

        ImageView ivfoto = convertView.findViewById(R.id.imgFoto);
        TextView tvtitulo= convertView.findViewById(R.id.tvTitulo);
        TextView tvdesc= convertView.findViewById(R.id.tvDesc);

        ivfoto.setImageResource(item.getFoto());
        tvtitulo.setText(item.getTitulo());
        tvdesc.setText(item.getContenido());

        return convertView;
    }
}
