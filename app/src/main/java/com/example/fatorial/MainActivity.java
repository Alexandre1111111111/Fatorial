package com.example.fatorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();

        TextView txt_fatorial = findViewById(R.id.txt_fatorial);

        TextView txt_result = findViewById(R.id.txt_result);

        EditText edt_numftr = findViewById(R.id.edt_numftr);

        Button btn_fator = findViewById(R.id.btn_fator);



        btn_fator.setOnClickListener(view -> {

                try {
                long ftr = Integer.parseInt(String.valueOf(edt_numftr.getText()));

                if (ftr == 1 || ftr == 0) {
                    txt_result.setText("1");
                } else {
                    long loop = ftr;
                    long res = 0;
                    for (int i = 1; i < loop; i++) {
                        res = ftr *= i;
                    }
                    txt_result.setText(String.valueOf(Math.abs(res)));
                    }
                }
                catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this,"Insira um valor",Toast.LENGTH_SHORT).show();
                }
        });
    }
}