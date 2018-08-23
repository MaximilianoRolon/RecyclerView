package com.example.maxir.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Contactos> contactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactos.add(new Contactos("15/7", "Vault Boy", "0761411", "fo76@opgg.com", "BOooyyy", R.drawable.vault_boy));
        contactos.add(new Contactos("15/7", "Vault Boy", "0761411", "fo76@opgg.com", "BOooyyy", R.drawable.vault_boy));
        contactos.add(new Contactos("15/7", "Vault Boy", "0761411", "fo76@opgg.com", "BOooyyy", R.drawable.vault_boy));
        contactos.add(new Contactos("15/7", "Vault Boy", "0761411", "fo76@opgg.com", "BOooyyy", R.drawable.vault_boy));
        contactos.add(new Contactos("15/7", "Vault Boy", "0761411", "fo76@opgg.com", "BOooyyy", R.drawable.vault_boy));



    }
}
