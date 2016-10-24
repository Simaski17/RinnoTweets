package com.example.jimmyhernandez.rinnotwets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    EditText edt_nombre_user;
    String prueba;
    private ListaTweets lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_nombre_user = (EditText) findViewById(R.id.edt_nombre_user);


    }

    public void BuscarUser(View view) {

        //Toast.makeText(this, prueba, Toast.LENGTH_SHORT).show();
        Intent i = new Intent (this, ListaTweets.class);
        i.putExtra("nombre", prueba =  edt_nombre_user.getText().toString());
        startActivity(i);

    }
}
