package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText numero_uno, numero_dos;
    private TextView resultado;//NULL
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero_uno = findViewById(R.id.txtNumeroUno);
        numero_dos = findViewById(R.id.txtNumeroDos);
        resultado = findViewById(R.id.lbResultado);

    }
        public void sumar (View v){
            if (numero_uno.getText().length() > 0 && numero_dos.getText().length() > 0) {
                int num_uno, num_dos, suma;
                num_uno = Integer.parseInt(numero_uno.getText().toString());
                num_dos = Integer.parseInt(numero_dos.getText().toString());
                suma = num_uno + num_dos;
                resultado.setText(""+suma);
            }
            else {
                Toast.makeText(MainActivity.this, "Digite todos los campos",
                        Toast.LENGTH_LONG).show();
            }
         }

    public void restar (View v){
        if (numero_uno.getText().length() > 0 && numero_dos.getText().length() > 0) {
            int num_uno, num_dos, resta;
            num_uno = Integer.parseInt(numero_uno.getText().toString());
            num_dos = Integer.parseInt(numero_dos.getText().toString());
            resta = num_uno - num_dos;
            resultado.setText(""+resta);
        }
        else {
            Toast.makeText(MainActivity.this, "Digite todos los campos",
                    Toast.LENGTH_LONG).show();
        }
    }

    public void multilicar (View v){
        if (numero_uno.getText().length() > 0 && numero_dos.getText().length() > 0) {
            int num_uno, num_dos, mult;
            num_uno = Integer.parseInt(numero_uno.getText().toString());
            num_dos = Integer.parseInt(numero_dos.getText().toString());
            mult = num_uno * num_dos;
            resultado.setText(""+mult);
        }
        else {
            Toast.makeText(MainActivity.this, "Digite todos los campos",
                    Toast.LENGTH_LONG).show();
        }
    }

    public void dividir (View v){
        if (numero_uno.getText().length() > 0 && numero_dos.getText().length() > 0) {
            int num_uno, num_dos, div;
            num_uno = Integer.parseInt(numero_uno.getText().toString());
            num_dos = Integer.parseInt(numero_dos.getText().toString());
            div = num_uno / num_dos;
            resultado.setText(""+div);
        }
        else {
            Toast.makeText(MainActivity.this, "Digite todos los campos",
                    Toast.LENGTH_LONG).show();
        }
    }

    public void limpiar(View v){
        numero_uno.setText("");
        numero_dos.setText("");
        resultado.setText("");
        numero_uno.requestFocus();
    }
}
