package com.clase.tresactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundoTresActivities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_tres_activities);
    }
    // Metodos de los botones(anterior)
    public void Siguiente(View view) {
        Intent siguiente = new Intent(this, TercerTresActivities.class);
        startActivity(siguiente);
    }
        public void Anterior(View view){
            Intent anterior = new Intent(this, MainActivity.class);
            startActivity(anterior);
        }
}