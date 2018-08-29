package com.example.maxir.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Contactos> contactos = new ArrayList<Contactos>();
    private RecyclerView listaContactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        inicializarListaContactos();
        listaContactos = (RecyclerView) findViewById(R.id.rvContactos);

        /*LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);*/

        GridLayoutManager glm = new GridLayoutManager(this, 2);


        listaContactos.setLayoutManager(glm);
        inicializarAdaptador();
    }

    public void inicializarAdaptador(){
        ContactoAdaptador adaptador = new ContactoAdaptador(contactos,this);
        listaContactos.setAdapter(adaptador);
    }


    public void inicializarListaContactos(){
        contactos.add(new Contactos("15/7", "Vault Boy", "0761411", "fo76@opgg.com", "BOooyyy", R.drawable.vault_boy));
        contactos.add(new Contactos("15/7", "Vault Boy", "0761411", "fo76@opgg.com", "BOooyyy", R.drawable.vault_boy));
        contactos.add(new Contactos("15/7", "Vault Boy", "0761411", "fo76@opgg.com", "BOooyyy", R.drawable.vault_boy));
        contactos.add(new Contactos("15/7", "Vault Boy", "0761411", "fo76@opgg.com", "BOooyyy", R.drawable.vault_boy));
        contactos.add(new Contactos("15/7", "Vault Boy", "0761411", "fo76@opgg.com", "BOooyyy", R.drawable.vault_boy));
    }
}
