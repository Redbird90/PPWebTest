package com.studio.jkwebplace.ppwebtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button writeBtn = findViewById(R.id.button2);
        Button readBtn = findViewById(R.id.button3);
        Button connectBtn = findViewById(R.id.button4);

        writeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toWriteAct = new Intent(getApplicationContext(), WritingActivity.class);
            }
        });
        readBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toReadAct = new Intent(getApplicationContext(), ReadingActivity.class);
            }
        });
        connectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toConnectAct = new Intent(getApplicationContext(), ConnectActivity.class);
            }
        });
    }
}
