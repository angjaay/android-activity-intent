package studio.angzai.tugas_1_akb_10119123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
/*
    Tanggal pengerjaan : 21 april 2022
    NIM : 10119123
    Nama : Angga Cahya Abadi
    Kelas : IF-3
*/
public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener {
    TextView btnLogin, btnDaftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        btnLogin = (TextView)findViewById(R.id.login_btn);
        btnDaftar = (TextView)findViewById(R.id.daftar_btn);
        btnLogin.setOnClickListener(this);
        btnDaftar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.daftar_btn:
                Intent intent = new Intent(RegistrationActivity.this , LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.login_btn:
                Intent daftar = new Intent(RegistrationActivity.this , LoginActivity.class);
                startActivity(daftar);
                break;

        }
    }
}