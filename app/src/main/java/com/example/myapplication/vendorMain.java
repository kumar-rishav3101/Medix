package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class vendorMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor_main);
    }
    public void ADD(View view)
    {
        Intent i = new Intent(this,Medicine.class);
        startActivity(i);
    }
    public void drawer(View view)
    {
        Intent i = new Intent(this,VendorDrawer.class);
        startActivity(i);
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);

    }
}
