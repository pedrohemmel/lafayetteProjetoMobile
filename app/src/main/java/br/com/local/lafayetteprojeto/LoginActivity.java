package br.com.local.lafayetteprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    TextInputLayout txtUser;
    TextInputLayout txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        //criando botão e referenciando o mesmo
        Button button = findViewById(R.id.btnEntrar);
        txtUser = findViewById(R.id.txtUser);
        txtPass = findViewById(R.id.txtPass);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(txtUser.getEditText().getText().toString().equals("aps@gmail.com") && txtPass.getEditText().getText().toString().equals("123456")) {
                    startActivity(new Intent(getApplicationContext(), MainManageActivity.class));
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Usuário ou senha incorretos", Toast.LENGTH_SHORT).show();
                    txtUser.getEditText().setText("");
                    txtPass.getEditText().setText("");
                    txtUser.requestFocus();
                }

            }
        });

    }
}