package com.example.xayne.wefixitproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;

import adapter.ExpandableListViewAdapter;
import com.*;

import org.w3c.dom.Text;


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
