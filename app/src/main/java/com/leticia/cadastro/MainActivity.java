package com.leticia.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.leticia.cadastro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activity;
    private Formulario form;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activity.getRoot());

        activity.botaoLimpar.setOnClickListener(
                (view) -> {
                    activity.nomeInput.setText("");
                    activity.cidadeInput.setText("");
                    activity.emailInput.setText("");
                    activity.telefoneInput.setText("");
                    activity.checkEmail.setSelected(false);
                    activity.checkBox.clearCheck();
                }
        );

        activity.botaoSalvar.setOnClickListener(
                (view) -> {
                    String nome = activity.nomeInput.getText().toString();
                    String cidade = activity.cidadeInput.getText().toString();
                    String email = activity.emailInput.getText().toString();
                    String telefone = activity.telefoneInput.getText().toString();
                    String  uf = activity.ufInput.getSelectedItem().toString();
                    Boolean femBool = activity.femBtn.isChecked();
                    Boolean emailBool = activity.checkEmail.isChecked();
                    Character genero = femBool ? 'F' : 'M';

                    form = new Formulario(nome, telefone, email, cidade, uf, genero, emailBool);
                    String resultado = form.toString();
                    Toast.makeText(this, resultado, Toast.LENGTH_LONG).show();

                }
        );

    }
}