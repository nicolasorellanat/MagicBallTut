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

    private String[] respuestaArray = {"Es cierto", "Definitivamente es así", "Sin duda", "Sí definitivamente", "Puede confiar en él", "Como yo lo veo, sí",
            "Lo más probable", "Perspectiva buena", "Sí", "Las señales apuntan a sí", "Respuesta confusa intente de nuevo", "Pregunte de nuevo más tarde",
            "Mejor no decirte ahora", "No puedo predecir ahora", "Concéntrate y pregunta de nuevo", "No cuentes con eso",
            "Mi respuesta es no", "Mis fuentes dicen que no", "Outlook no es tan bueno", "Muy dudoso"};

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
