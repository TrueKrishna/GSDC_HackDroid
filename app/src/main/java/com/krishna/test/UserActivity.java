package com.krishna.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);
        int CID = 1234; //Complaint ID
        //int USERID = 4321;
        int CTS = 0000; //Created TimeStamp
        int RTS = 111; //Resolved TimeStamp
        boolean status = false; // Status

        FloatingActionButton button =  findViewById(R.id.floatingActionButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent addIntent = new Intent(UserActivity.this, add.class);
                startActivity(addIntent);
            }
        });



    }
}