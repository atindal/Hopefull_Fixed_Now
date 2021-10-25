package com.example.vandalstats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button pushButton = findViewById(R.id.changebutton);
        TextView hw = findViewById(R.id.changeable);
        TextView testing1 = findViewById(R.id.test1);

        pushButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hw.setText("Button has absolutely for sure been pressed.");
            }
        });
    }
}