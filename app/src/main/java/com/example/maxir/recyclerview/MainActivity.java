package com.example.maxir.recyclerview;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.maxir.recyclerview.adapter.ContactoAdaptador;
import com.example.maxir.recyclerview.adapter.PageAdapter;
import com.example.maxir.recyclerview.fragment.PerfilFragment;
import com.example.maxir.recyclerview.fragment.RecyclerViewFragment;
import com.example.maxir.recyclerview.pojo.Contactos;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements PerfilFragment.OnFragmentInteractionListener {
    private ArrayList<Contactos> contactos = new ArrayList<Contactos>();
    private RecyclerView listaContactos;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(toolbar);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setUpViewPager();

        /*
        inicializarListaContactos();
        listaContactos = (RecyclerView) findViewById(R.id.rvContactos);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        GridLayoutManager glm = new GridLayoutManager(this, 2);


        listaContactos.setLayoutManager(glm);
        inicializarAdaptador();
        */

    }

    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(new RecyclerViewFragment());
        fragments.add(new PerfilFragment());

        return fragments;
    }

    private void setUpViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);
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

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
