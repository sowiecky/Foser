package com.example.foser;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_start = findViewById(R.id.buttonStart);

        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickStart(v);
            }
        });


        Button button_stop = findViewById(R.id.buttonStop);

        button_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickStop(v);
            }
        });


        Button button_restart = findViewById(R.id.buttonRestart);

        button_restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickRestart(v);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch(item.getItemId()){

            case R.id.itemSettings:
                startActivity(new Intent(this, SettingsActivity.class));
                return true;

            case R.id.itemExit:
                finishAndRemoveTask();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void clickStart(View view){
        Toast.makeText(this, "Start", Toast.LENGTH_SHORT).show();
    }

    public void clickStop(View view){
        Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show();
    }

    public void clickRestart(View view){
        clickStop(view);
        clickStart(view);
    }



}