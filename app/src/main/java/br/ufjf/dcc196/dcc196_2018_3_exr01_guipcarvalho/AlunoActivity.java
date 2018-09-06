package br.ufjf.dcc196.dcc196_2018_3_exr01_guipcarvalho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AlunoActivity extends AppCompatActivity {

    private Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno);

        btnSalvar = (Button)findViewById(R.id.btn_salvar_aluno);
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.countAluno++;
                finish();
            }
        });

    }
}
