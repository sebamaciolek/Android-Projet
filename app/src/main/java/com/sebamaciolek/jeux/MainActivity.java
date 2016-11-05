package com.sebamaciolek.jeux;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickPlay(View view) {
        startActivity(new Intent(MainActivity.this, MainActivity2.class));
    }

    public void onClickCar(View view) {
        TextView textViewVehiculeChoisi = (TextView) findViewById(R.id.textViewVehiculeChoisi);
        textViewVehiculeChoisi.setText("Voiture");
    }

    public void onClickBicycle(View view) {
        TextView textViewVehiculeChoisi = (TextView) findViewById(R.id.textViewVehiculeChoisi);
        textViewVehiculeChoisi.setText("Vélo");
    }

    public void onClickAirplane(View view) {
        TextView textViewVehiculeChoisi = (TextView) findViewById(R.id.textViewVehiculeChoisi);
        textViewVehiculeChoisi.setText("Avion");
    }

    public void onClickBoat(View view) {
        TextView textViewVehiculeChoisi = (TextView) findViewById(R.id.textViewVehiculeChoisi);
        textViewVehiculeChoisi.setText("Bateau");
    }

    public void onClickBaloon(View view) {
        TextView textViewVehiculeChoisi = (TextView) findViewById(R.id.textViewVehiculeChoisi);
        textViewVehiculeChoisi.setText("Montgolfière");
    }
}
