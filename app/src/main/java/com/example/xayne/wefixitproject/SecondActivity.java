package com.example.xayne.wefixitproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();

        String service = intent.getStringExtra("service");

        TextView serviceTextView = (TextView) findViewById(R.id.serviceText);

        serviceTextView.setText(service);
        Log.d("ayy", service);
    }
}
