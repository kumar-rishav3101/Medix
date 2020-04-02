package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VendorDrawer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor_drawer);
    }
    public void Profile(View view)
    {
        Intent i = new Intent(this,VendorProfile.class);
        startActivity(i);
    }
    public void Logout(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void contact(View view)
    {
        Intent i = new Intent(this,ContactUs.class);
        startActivity(i);
    }
}
