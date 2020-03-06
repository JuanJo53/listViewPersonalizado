package com.example.listviewpersonalizado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

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
        cargaLista();
    }

    public void cargaLista() {
        lista.add(new ModeloItem())
    }
}
