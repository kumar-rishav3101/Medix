package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Hospital_Info extends AppCompatActivity {

    public EditText email,password;
    Button signup;
    FirebaseAuth mFirebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital__info);

        mFirebaseAuth = FirebaseAuth.getInstance();
        email = findViewById(R.id.editText7);
        password = findViewById(R.id.editText8);
        signup = findViewById(R.id.button);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String emails=email.getText().toString();
                String passwords=password.getText().toString();
                mFirebaseAuth.createUserWithEmailAndPassword(emails,passwords).addOnCompleteListener(Hospital_Info.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        startActivity(new Intent( Hospital_Info.this,Hospital_Login.class));
                    }
                });
            }
        });
    }
    public void Back(View view)
    {
        Intent i = new Intent(this,Hospital_Login.class);
        startActivity(i);
    }
}
