package com.example.vic72.test3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Send extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);

        Intent intent = getIntent();
        int value1 = intent.getIntExtra("Val", 0);
        int value2 = intent.getIntExtra("Vall", 0);

        TextView text = (TextView) findViewById(R.id.textView);
        text.setText(String.valueOf(value1 + value2));

    }
}
