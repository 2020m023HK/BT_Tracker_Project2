package com.example.bt_tracker_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToLog(View view) {
        Intent i = new Intent(this, LogActivity.class);
        startActivity(i);
    }

    public void goToNormal(View view) {
        Intent i1 = new Intent(this, NormalActivity.class);
        startActivity(i1);
    }




}
