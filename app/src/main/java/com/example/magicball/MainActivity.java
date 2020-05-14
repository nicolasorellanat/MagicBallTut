package com.example.magicball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView ballI;
    private TextView respuesta;

    private String[] respuestaArray = {"Es cierto lo que dices", "Jajajaja perdio la razon?", "Sin duda", "Sí definitivamente", "Salga, el mundo lo espera", "Si, no lo piense tanto",
            "Hay mas opciones en camino", "Se siente usted bien?", "Sí", "No es para ti", "Quizas, quizas, quizas", "Preguntame cuando este de humor",
            "Mejor no decirte ahora", "No puedo predecir ahora", "No cuentes con eso", "Eso que buscas está muy cerca", "Estas jugando conmigo?", "Tu puedes con todo",
            "Mi respuesta es no", "Como un maestro espadachin diria, que diablos te pasa?", "Podrias preguntar de nuevo?", "Huele a peligro"};

    @Override //convertire con esto al "hijo" onCreate en super clase
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ballI = findViewById(R.id.boton); // con esto inicializare mis var en el inicio
        respuesta = findViewById(R.id.respuesta);

        ballI.setOnClickListener((View.OnClickListener) this); //"this" es la funcion de inicializacion R.id
        Toast.makeText(MainActivity.this, "Buscando tu destino", Toast.LENGTH_SHORT).show();
        //Mostrara un texto cuando alguien apriete el boton
    }

    @Override
    public void onClick(View v) { //Ira a la pantalla dps del "click"
        //creacion de metodo de respuesta aleatorio
        switch (v.getId()){
            case R.id.boton:
                int random = new Random().nextInt(respuestaArray.length);
                //se le iran sumando valores a mi respuesta
                respuesta.setText(respuestaArray[random]);
                //ira a buscar una respuesta segun su numero en el array (ej n°8="concentrate)
                break;
        }
    }
}
