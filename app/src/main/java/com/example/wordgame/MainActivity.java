package com.example.wordgame;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    SharedPreferences words;
    TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = findViewById(R.id.view);
        words = getApplicationContext().getSharedPreferences("word_collection", MODE_PRIVATE);

        String n = words.getString("Word", "");

        int num = words.getAll().size();
        view.setText("Words count " + num + "\n" + n + "");

    }
}
