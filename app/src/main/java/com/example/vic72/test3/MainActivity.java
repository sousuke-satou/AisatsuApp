package com.example.vic72.test3;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showTimetDialog();

            }


            private void showTimetDialog() {
                TimePickerDialog timePickerDialog = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                        TextView textView = (TextView) findViewById(R.id.textView);

                        if (hourOfDay >= 2 && hourOfDay <= 9) {
                            if (minute >= 0 && minute <= 59) {
                                textView.setText("おはよう");
                            }
                        } else if (hourOfDay >= 10 && hourOfDay <= 17) {
                            if (minute >= 0 && minute <= 59) {
                                textView.setText("こんにちは");
                            }
                        }
                        if (hourOfDay >= 18 && hourOfDay <= 24 || hourOfDay == 1 ) {
                            if (minute >= 0 && minute <= 59) {
                                textView.setText("こんばんは");
                            }
                        }

                    }


                }, 0, 0, true);
                timePickerDialog.show();
            }
        });


    }
}
