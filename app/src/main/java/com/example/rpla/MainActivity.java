package com.example.rpla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etPanjang, etLebar, etTinggi;
    private Button btnHitung;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("mobilku",MainActivity.class.getSimpleName()+" onCreate");
        etPanjang = findViewById(R.id.edtPanjang);
        etLebar = findViewById(R.id.edtLebar);
        etTinggi = findViewById(R.id.edtTinggi);
        btnHitung = findViewById(R.id.btnHitung);
        tvHasil = findViewById(R.id.tvHasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer panjang = Integer.parseInt(etPanjang.getText().toString());
                Integer lebar = Integer.parseInt(etLebar.getText().toString());
                Integer tinggi = Integer.parseInt(etTinggi.getText().toString());

                tvHasil.setText(String.valueOf(panjang*lebar*tinggi));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("mobilku", MainActivity.class.getSimpleName() + "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("mobilku" , MainActivity.class.getSimpleName()+"onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("mobilku",MainActivity.class.getSimpleName()+" onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("mobilku",MainActivity.class.getSimpleName()+" onRestart");
    }
}

