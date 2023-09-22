package com.example.fatorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        TextView txt_fatorial = findViewById(R.id.txt_fatorial);

        TextView txt_result = findViewById(R.id.txt_result);

        EditText edt_numftr = findViewById(R.id.edt_numftr);

        Button btn_fator = findViewById(R.id.btn_fator);



        btn_fator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(edt_numftr.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this,"Insira um valor",Toast.LENGTH_SHORT).show();
                }
                else {
                    long ftr = Integer.parseInt(String.valueOf(edt_numftr.getText()));

                    if (ftr == 1 || ftr == 0) {
                        txt_result.setText("1");
                    } else {
                        long loop = ftr;
                        long res = 0;
                        for (int i = 1; i < loop; i++) {
                            res = ftr *= i;
                        }
                        txt_result.setText(String.valueOf(res));
                    }
                }
            }
        });
    }
}