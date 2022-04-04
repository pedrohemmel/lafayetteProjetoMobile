package br.com.local.lafayetteprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.appbar.MaterialToolbar;

public class EditBlogActivity extends AppCompatActivity {

    private TextView txtEditBlog;
    private ImageView imgArtigo;
    private MaterialToolbar topBarEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_blog_layout);

        imgArtigo = findViewById(R.id.imgEditBlog);
        txtEditBlog = findViewById(R.id.txtEditBlog);
        topBarEdit = findViewById(R.id.topAppBar);

        topBarEdit.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainManageActivity.class);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();

        String txtEdit = intent.getExtras().getString("Sinopse");
        int imgArt = intent.getExtras().getInt("Imagem");

        imgArtigo.setImageResource(imgArt);
        txtEditBlog.setText(txtEdit);
    }
}