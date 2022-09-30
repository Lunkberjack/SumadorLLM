package com.example.sumador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Clase que recrea el funcionamiento de una calculadora simple
 * con las operaciones suma, resta, multiplicación y división.
 *
 * @author LuciaLM
 * @version 1.0
 */
public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.editTextNumber);
        et2=findViewById(R.id.editTextNumber2);
        tv1=findViewById(R.id.textView);
    }

    public void sumar(View view) {

        // Obtenemos los números
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());

        // Hacemos la suma
        int suma = n1 + n2;

        // Establecemos el resultado en el TextView
        tv1.setText("" + suma);
    }

    public void restar(View view) {

        // Obtenemos los números
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());

        // Hacemos la resta
        int resta = n1 - n2;

        // Establecemos el resultado en el TextView
        tv1.setText("" + resta);
    }

    public void multiplicar(View view) {

        // Obtenemos los números
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());

        // Hacemos la multiplicación
        int multi = n1 * n2;

        // Establecemos el resultado en el TextView
        tv1.setText("" + multi);
    }

    public void dividir(View view) {

        // Obtenemos los números
        // La división de dos enteros puede ser double.
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());

        // Si el denominador es 0, no se realiza la división
        // y se imprime en el texto un mensaje informando.
        if(n2 == 0) {
            tv1.setText("No se puede dividir por 0");
        } else {
            // Hacemos la división
            double divi = (double)n1 / (double)n2;

            // Establecemos el resultado en el TextView
            tv1.setText("" + divi);
        }
    }
}
