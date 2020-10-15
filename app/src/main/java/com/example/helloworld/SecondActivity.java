package com.example.helloworld;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String[] names = {"Himanshu", "Jagdish", "Tushar", "MAnish", "Rohan"};
        int frnd = new Random().nextInt(names.length);
        String name = names[frnd];
        Toast.makeText(this, name,
                Toast.LENGTH_LONG).show();
        TextView t = findViewById(R.id.textView);
        t.setText(name);
    }
}