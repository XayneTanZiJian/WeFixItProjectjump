package com.example.xayne.wefixitproject;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

public class feedbackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference mRef = database.getReference("Feedback");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        Button submitBtn = (Button) findViewById(R.id.submitBtn);



        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView validateTextView = (TextView) findViewById(R.id.validateTextView);
                EditText feedbackText = (EditText) findViewById(R.id.feedbackText);
                String feedback = feedbackText.getText().toString();

                if(feedback.equals("") || feedback.equals(null)) {
                    validateTextView.setVisibility(View.VISIBLE);
                }
                else {
                    mRef.push().setValue(feedback);
                    Context context = getApplicationContext();
                    CharSequence text = "Feedback Submitted.";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });
    }
}
