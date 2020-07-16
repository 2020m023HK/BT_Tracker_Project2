package com.example.bt_tracker_project;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
    }
        TextView mainButton1 = findViewById(R.id.MainButton1);
        MainButton1.setOnClickListener(this);
    @Override
    public void normalToHome(View view) {

        switch (view.getId()){
            case R.id.NainButton1:
                //If Mainbutton1 is clicked, do something
                Intent i = new Intent(this,MainActivity.class);
                startActivity(i);
                break;
        }
    }
}
