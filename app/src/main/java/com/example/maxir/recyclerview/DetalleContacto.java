package com.example.maxir.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

public class DetalleContacto extends AppCompatActivity {
    private TextView tvNombre;
    private TextView tvTelefono;
    private TextView tvMail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_contacto);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Declaracion de elementos
        tvNombre = (TextView) findViewById(R.id.tvNombre);
        tvTelefono = (TextView) findViewById(R.id.tvTelefono);
        tvMail = (TextView) findViewById(R.id.tvMail);

        // Obtencion de parametros de intent
        Bundle parametros   = getIntent().getExtras();
        String nombre       = parametros.getString("nombre");
        String telefono     = parametros.getString("telefono");
        String mail         = parametros.getString("mail");

        // Seteado de texto
        tvNombre.setText(nombre);
        tvTelefono.setText(telefono);
        tvMail.setText(mail);
    }
}
