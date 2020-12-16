package com.example.whatsappstatusdownloader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button statusbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        statusbutton=findViewById(R.id.statusbutton);
    }
    public void statusClicked(View view)
    {
        Intent i=new Intent(getApplicationContext(),StatusScreen.class);
        startActivity(i);
    }
}