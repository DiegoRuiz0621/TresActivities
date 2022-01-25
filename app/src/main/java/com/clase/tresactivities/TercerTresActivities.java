package com.clase.tresactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TercerTresActivities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer_tres_activities);
    }
    // Metodos de los botones(
    public void Siguiente(View view) {
        Intent siguiente = new Intent(this, MainActivity.class);
        startActivity(siguiente);
    }
    public void Anterior(View view){
        Intent anterior = new Intent(this, SegundoTresActivities.class);
        startActivity(anterior);
    }
}