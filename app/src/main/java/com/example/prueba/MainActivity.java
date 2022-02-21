package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSiguiente;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSiguiente = this.findViewById(R.id.btnSiguiente);
        editText = this.findViewById(R.id.editTxt);

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String t = editText.getText().toString();

                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                intent.putExtra("nombre", t);
                startActivity(intent);
                //Toast.makeText(MainActivity.this, t, Toast.LENGTH_SHORT).show();
            }
        });

        //Toast.makeText(MainActivity.this, "Hola Mundo", Toast.LENGTH_SHORT).show();
    }

}