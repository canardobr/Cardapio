package com.example.cardapio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TITULO = "com.example.cardapio.TITULO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirBebidas(View v) {
        Intent intentProdutos = new Intent(this, ProdutosActivity.class);
        intentProdutos.putExtra(TITULO,"Bebidas");
        startActivity(intentProdutos);

    }

    public void abrirHamburguers(View v)
    {
        Intent intentProdutos = new Intent(this, ProdutosActivity.class);
        intentProdutos.putExtra(TITULO,"Hamburguers");
        startActivity(intentProdutos);

    }

    public void abrirSobremesas(View v)
    {
        Intent intentProdutos = new Intent(this, ProdutosActivity.class);
        intentProdutos.putExtra(TITULO,"Sobremesas");
        startActivity(intentProdutos);

    }

    public void abrirPasteis(View v)
    {
        Intent intentProdutos = new Intent(this, ProdutosActivity.class);
        intentProdutos.putExtra(TITULO,"Pastéis");
        startActivity(intentProdutos);

    }


}
