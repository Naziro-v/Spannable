package com.nazirov.layoutadvtask5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

     void initViews() {
         TextView textView = findViewById(R.id.tectView);
         String text = "I would #like to do #something similar to the #Twitter app";
         Spannable spannable= new SpannableString(text);
         spannable.setSpan(new ForegroundColorSpan(Color.BLUE),8,13,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
         spannable.setSpan(new ForegroundColorSpan(Color.BLUE),20,30,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
         spannable.setSpan(new ForegroundColorSpan(Color.BLUE),46,54,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

         textView.setText(spannable);
    }
}