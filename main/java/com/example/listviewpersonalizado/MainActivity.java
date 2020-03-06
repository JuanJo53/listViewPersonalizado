package com.example.listviewpersonalizado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvData;
    ArrayList<ModeloItem> lista;
    Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvData = (ListView)findViewById(R.id.lvData);
        lista = new ArrayList<>();
        adaptador = new Adaptador(this,lista);

        lvData.setAdapter(adaptador);

        lvData.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(),lista.get(position).getTitulo(),Toast.LENGTH_LONG).show();
//                LinearLayout llitem;
//                llitem=(LinearLayout)view.findViewById(R.id.llItem);
//                llitem.setBackgroundColor(0xfff44336);
            }
        });
        cargaLista();
    }

    public void cargaLista() {
        lista.add(new ModeloItem(R.drawable.foto,"Loquita","Se cree Ricardo Milos el Cabron"));
        lista.add(new ModeloItem(R.drawable.foto,"Loquita","Se cree Ricardo Milos el Cabron"));
        lista.add(new ModeloItem(R.drawable.foto,"Loquita","Se cree Ricardo Milos el Cabron"));
        lista.add(new ModeloItem(R.drawable.foto,"Loquita","Se cree Ricardo Milos el Cabron"));
        lista.add(new ModeloItem(R.drawable.foto,"Loquita","Se cree Ricardo Milos el Cabron"));
        lista.add(new ModeloItem(R.drawable.foto,"Loquita","Se cree Ricardo Milos el Cabron"));
    }
}
