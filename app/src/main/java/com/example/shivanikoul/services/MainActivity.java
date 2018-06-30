package com.example.shivanikoul.services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button start,pause,stop;
    String order =null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start =findViewById(R.id.startbtn);
        pause =findViewById(R.id.pausebtn);
        stop =findViewById(R.id.stopbtn);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,MyService.class);
                order="pause";
                intent.putExtra("order",order);
                start.setText("Resume");
                startService(intent);

                pause.setEnabled(false);
                stop.setEnabled(true);
                start.setEnabled(true);
            }
        });


        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,MyService.class);
                order="pause";
                intent.putExtra("order",order);

                startService(intent);

                pause.setEnabled(false);
                stop.setEnabled(true);
                start.setEnabled(true);
            }
        });

    }
}
