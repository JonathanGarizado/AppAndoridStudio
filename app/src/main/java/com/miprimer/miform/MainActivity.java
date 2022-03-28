package com.miprimer.miform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mensjaeTextView;
    EditText nombreEditText;

    public void presionarBoton(View view){
        Log.i("Info", "Botón presionado");

        nombreEditText = findViewById(R.id.nombreEditText);

        String nombreString = nombreEditText.getText().toString();
        mensjaeTextView.setText(nombreString);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mensjaeTextView = findViewById(R.id.mensajeTextView);
        mensjaeTextView.setText("Nombre");
    }
}