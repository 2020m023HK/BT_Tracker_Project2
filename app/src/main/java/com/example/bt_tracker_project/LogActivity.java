package com.example.bt_tracker_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        //get the ID of the EditText on the layout
        userInput = (EditText) findViewById(R.id.LogInputData);
}
    public void confirmBT(View view) {
        Intent toConfirm = new Intent(this, ConfirmActivity.class);
        //append user input to the toConfirm Intent
        //the 2nd argument means: get user input from the EditText View,
        //and convert the text to a string
        toConfirm.putExtra("BT_data",userInput.getText().toString());
        //start ConfirmActivity
        startActivity(toConfirm);
    }

}
