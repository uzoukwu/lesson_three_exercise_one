package com.example.lesson_three_exercise_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ДЗ 1 - 1
        int years = 0;
        double money = 1000;

        while (money <= 2000) {
            money = money * 1.05;
            years++;
        }
        Log.d("myLog", "The value will reach 2000$ in:  " + years + " years.");

        // ДЗ 1 - 2
        int counter = 0;
        for (int i = 1; i <= 45; i++) {
            //counter = (i)*(i+1)/2 ;
            counter += i;
        }
        Log.d("myLog", "The sum: " + counter);
    }
}