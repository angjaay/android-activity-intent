package studio.angzai.tugas_1_akb_10119123;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/*
    Tanggal pengerjaan : 21 april 2022
    NIM : 10119123
    Nama : Angga Cahya Abadi
    Kelas : IF-3
*/

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    TextView btnLogin, btnDaftar;
    EditText username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin = (TextView)findViewById(R.id.login_btn);
        btnDaftar = (TextView)findViewById(R.id.daftar_btn);
        username = (EditText)findViewById(R.id.username_input);
        btnLogin.setOnClickListener(this);
        btnDaftar.setOnClickListener(this);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }


    public void onClick(View view) {
        switch (view.getId()){
            case R.id.login_btn:

                    Intent intent = new Intent(LoginActivity.this , MainActivity.class);
                    startActivity(intent);
                    finish();

                break;
            case R.id.daftar_btn:
                Intent daftar = new Intent(LoginActivity.this , RegistrationActivity.class);
                startActivity(daftar);
                break;

        }
    }
}