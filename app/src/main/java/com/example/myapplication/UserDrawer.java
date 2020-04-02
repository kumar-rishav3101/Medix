package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UserDrawer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_drawer);
    }
    public void Profile(View view)
    {
        Intent i = new Intent(this,UserEdit.class);
        startActivity(i);
    }
    public void contact(View view)
    {
        Intent i = new Intent(this,ContactUs.class);
        startActivity(i);
    }
    public void Logout(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
