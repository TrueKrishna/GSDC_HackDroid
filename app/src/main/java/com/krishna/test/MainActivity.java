package com.krishna.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //EditText userName = findViewById(R.id.usrname);
       // String a = userName.getText().toString();
        //EditText pass = (EditText)findViewById(R.id.pswd);
       // String b = pass.getText().toString();
        Intent userIntent = new Intent(MainActivity.this, UserActivity.class);
        startActivity(userIntent);


    }
}