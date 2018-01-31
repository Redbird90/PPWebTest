package com.studio.jkwebplace.ppwebtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

/**
 * Created by JDK on 1/24/2018.
 */

public class WritingActivity extends Activity {

    private ArrayList contactTsil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writing);

        Button toBtn = findViewById(R.id.button6);
        Button sendBtn = findViewById(R.id.button7);

        toBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

}
