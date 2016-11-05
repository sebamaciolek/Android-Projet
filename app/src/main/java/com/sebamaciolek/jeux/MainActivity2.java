package com.sebamaciolek.jeux;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private GameView gameView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        gameView = new GameView(this);
        setContentView(gameView);
    }
}
