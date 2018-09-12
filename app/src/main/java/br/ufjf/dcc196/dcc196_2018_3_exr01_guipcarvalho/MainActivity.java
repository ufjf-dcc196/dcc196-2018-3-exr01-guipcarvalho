package br.ufjf.dcc196.dcc196_2018_3_exr01_guipcarvalho;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static int countAluno = 0;
    public static int countExterno = 0;
    public static int countServidor = 0;

    private static final int REQUEST_CODE = 1;

    private Button btnAluno;
    private Button btnExterno;
    private Button btnServidor;

    private TextView txtCountAluno;
    private TextView txtCountServidor;
    private TextView txtCountExterno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCountAluno = (TextView)findViewById(R.id.txtCountAluno);
        txtCountExterno = (TextView)findViewById(R.id.txtCountExterno);
        txtCountServidor = (TextView)findViewById(R.id.txtCountServidor);

        atualizaCounts();

        btnAluno = (Button)findViewById(R.id.btn_cad_aluno);
        btnAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AlunoActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });

        btnExterno = (Button)findViewById(R.id.btn_cad_externo);
        btnExterno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ExternoActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });

        btnServidor = (Button)findViewById(R.id.btn_cad_servidor);
        btnServidor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ServidorActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == MainActivity.REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            atualizaCounts();
        }
    }

    private void atualizaCounts()
    {
        txtCountServidor.setText("Quantidade de servidores: " + MainActivity.countServidor);
        txtCountAluno.setText("Quantidade de alunos: " + MainActivity.countAluno);
        txtCountExterno.setText("Quantidade de externos: " + MainActivity.countExterno);
    }
}
