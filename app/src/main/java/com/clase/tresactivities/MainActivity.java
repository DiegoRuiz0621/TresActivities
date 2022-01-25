package com.clase.tresactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
        // la actividad esta a punto de hacerse visible
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
        // la actividad se ha vuelto visible(se "reanuda" )

    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
        // al enfocarse en otra actividad la aplicacion se pausa
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
        // al enfocarse en otra actividad la aplicacion se pausa
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
        // la aplicacion sera destruida
    }
    //Metodo de los botones
    public void Siguiente(View view){
        Intent siguiente = new Intent(this, SegundoTresActivities.class);
        startActivity(siguiente);
    }
    public void Anterior(View view){
        Intent anterior = new Intent(this, TercerTresActivities.class);
        startActivity(anterior);
    }
}