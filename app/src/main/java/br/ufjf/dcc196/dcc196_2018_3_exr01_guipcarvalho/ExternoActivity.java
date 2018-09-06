package br.ufjf.dcc196.dcc196_2018_3_exr01_guipcarvalho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExternoActivity extends AppCompatActivity {

    private Button btnSalvar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_externo);

        btnSalvar = (Button)findViewById(R.id.btn_salvar_externo);
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.countExterno++;
                finish();
            }
        });
    }
}
