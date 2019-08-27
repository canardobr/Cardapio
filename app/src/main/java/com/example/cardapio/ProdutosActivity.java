package com.example.cardapio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.cardapio.modelos.Produto;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ProdutosActivity extends AppCompatActivity {

    private TextView textView_Titulo;
    private ArrayList<Produto> produtos= new ArrayList<>();
    private LinearLayout linearLayout;
    private ImageView imageView_categoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

        Intent intentProdutos = getIntent();
        String titulo = intentProdutos.getStringExtra(MainActivity.TITULO);
        textView_Titulo = findViewById(R.id.text_view_titulo);
        textView_Titulo.setText(titulo);
        linearLayout = findViewById(R.id.layout);
        imageView_categoria = findViewById(R.id.image_view_categoria);

        criarProdutos(titulo);

    }

    public void criarProdutos(String titulo)
    {
        switch (titulo)
        {
            case "Bebidas":
                imageView_categoria.setImageResource(R.drawable.batida);
                produtos.add(new Produto("Coca Cola Lata", 6.50, titulo, "Coca lata 350ml"));
                produtos.add(new Produto("Fanta Lata", 6.50, titulo, "Fanta lata 350ml"));
                produtos.add(new Produto("Água Mineral", 3.50, titulo, "Garrafa 600ml"));
                produtos.add(new Produto("Coca Cola 2L", 10.50, titulo, "Coca lata 2 Litros"));
                break;

            case "Hamburguers":
                imageView_categoria.setImageResource(R.drawable.hamburguer);
                produtos.add(new Produto("Hamburguer Jr C/ Catupiry", 14.90, titulo, "Pão de Hambúrguer, 1 Carne de Hamburguer, Presunto, Mussarela, Alface, Tomate, Milho, Ovo, Bacon, Maionese, Catchup, Mostarda e Catupiry"));
                produtos.add(new Produto("X-Salada", 13.0, titulo, "Pão de Hamburguer, Carne de Hamburguer, Alface, Tomate, Milho, Mussarela, Maionese, Catchup e Mostarda"));
                produtos.add(new Produto("X-Bacon", 15.0, titulo, "Pão de Hamburguer, Carne de Hamburguer, Bacon, Alface, Tomate, Milho, Mussarela, Maionese, Catchup e Mostarda"));
                produtos.add(new Produto("X-Tudo", 25.0, titulo, "Pão de Hamburguer, Quatro Carnes de Hamburguer, Salsicha, Bacon, Duas fatias de Presunto, Duas Fatias de Mussarela, Ovo, Alface, Tomate, Milho, Catupiry, Maionese, Catchup e Mostarda"));
                break;

            case "Sobremesas":
                imageView_categoria.setImageResource(R.drawable.sobremesa);
                produtos.add(new Produto("1 Fatia Bolo de Morango", 7.80, titulo, "Bolo de gelatina com cobertura de morango"));
                produtos.add(new Produto("Sorvete com calda quente de chocolate", 16.0, titulo, ""));
                produtos.add(new Produto("Sorvete de creme ou flocos", 12.00, titulo, ""));
                produtos.add(new Produto("Cheescake com calda de frutas vermelhas", 16.0, titulo, ""));
                break;

            case "Pastéis":
                imageView_categoria.setImageResource(R.drawable.pastel);
                produtos.add(new Produto("Carne", 11.80, titulo, "Carne moida, tomate e azeitona"));
                produtos.add(new Produto("Carne com Queijo", 16.40, titulo, "Carne moida, mussarela, tomate e azeitona"));
                produtos.add(new Produto("Baiana", 18.70, titulo, "Linguiça calabresa acebolada, mussarela, pimenta calabresa, tomate e azeitona"));
                produtos.add(new Produto("Frango", 15.0, titulo, "Frango, Queijo, Catupiry, Ovo e Azeitona"));
            default:
                break;
        }

        listarProdutos();
    }

    public void listarProdutos()
    {
        /*RelativeLayout.LayoutParams params1 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,  RelativeLayout.LayoutParams.WRAP_CONTENT);

        params1.setMargins(0, 32, 0, 32);*/

        for(int i =0; i < produtos.size(); i++) {
            TextView textViewNome = new TextView(this);
            TextView textViewPreco = new TextView(this);
            TextView textViewDesc = new TextView(this);

            textViewNome.setText(produtos.get(i).getNome());
            textViewNome.setTextSize(18);

            //textViewPreco.setText("R$ " + produtos.get(i).getPreco().toString().replace(".", ","));
            textViewPreco.setText("R$ "+String.format("%.2f", produtos.get(i).getPreco()));
            textViewPreco.setTextSize(18);
            //textViewPreco.setLayoutParams(params1);

            textViewDesc.setText(produtos.get(i).getDescricao());
            textViewDesc.setTextSize(18);

            linearLayout.addView(textViewNome);
            linearLayout.addView(textViewPreco);
            linearLayout.addView(textViewDesc);
        }
    }

}
