package br.com.local.lafayetteprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.appbar.MaterialToolbar;

public class EditGaleriaActivity extends AppCompatActivity {

    private TextView txtTituloGaleria;
    private TextView txtEditGaleria;
    private ImageView imgEditGaleria;
    private MaterialToolbar topBarEditGaleria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_galeria_layout);

        txtTituloGaleria = findViewById(R.id.txtTituloGaleria);
        txtEditGaleria = findViewById(R.id.txtEditGaleria);
        imgEditGaleria = findViewById(R.id.imgEditGaleria);
        topBarEditGaleria = findViewById(R.id.topAppBarGaleria);

        topBarEditGaleria.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainManageActivity.class);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();

        String txtTitulo, txtGaleria;
        int imgGaleria = intent.getExtras().getInt("Imagem");
        txtTitulo = intent.getExtras().getString("Titulo");
        txtGaleria = intent.getExtras().getString("Sinopse");

        imgEditGaleria.setImageResource(imgGaleria);
        txtTituloGaleria.setText(txtTitulo);
        txtEditGaleria.setText(txtGaleria);


    }
}