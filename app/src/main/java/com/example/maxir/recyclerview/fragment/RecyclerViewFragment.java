package com.example.maxir.recyclerview.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.maxir.recyclerview.R;
import com.example.maxir.recyclerview.adapter.ContactoAdaptador;
import com.example.maxir.recyclerview.pojo.Contactos;

import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment {

    private ArrayList<Contactos> contactos = new ArrayList<Contactos>();
    private RecyclerView listaContactos;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        inicializarListaContactos();
        listaContactos = (RecyclerView) v.findViewById(R.id.rvContactos);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        GridLayoutManager glm = new GridLayoutManager(getActivity(), 2);


        listaContactos.setLayoutManager(glm);
        inicializarAdaptador();

        return v;
    }

    public void inicializarAdaptador(){
        ContactoAdaptador adaptador = new ContactoAdaptador(contactos,getActivity());
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
