package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Hospital extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);
    }
    public void vendor(View view) {
        Intent i = new Intent(this, vendorMain.class);
        startActivity(i);
    }
    public void order(View view) {
        Intent i = new Intent(this, User.class);
        startActivity(i);
    }
}
