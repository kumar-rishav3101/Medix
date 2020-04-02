package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Hospital_Login extends AppCompatActivity {

    EditText email,password;
    Button log;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital__login);
        mFirebaseAuth = FirebaseAuth.getInstance();
        email=findViewById(R.id.username);
        password=findViewById(R.id.password);
        log = findViewById(R.id.login);
        mAuthState = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser mFirebaseUser = mFirebaseAuth.getCurrentUser();
                if(mFirebaseUser!= null) {
                    Toast.makeText(Hospital_Login.this, "Logged In", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Hospital_Login.this, Hospital.class);
                    startActivity(i);
                }
            }
        };

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String emails=email.getText().toString();
                String passwords=password.getText().toString();
                mFirebaseAuth.createUserWithEmailAndPassword(emails,passwords).addOnCompleteListener(Hospital_Login.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if(!task.isSuccessful())
                        {
                            Intent i = new Intent(Hospital_Login.this,Hospital.class);
                            startActivity(i);
                        }else
                        {
                            Intent i = new Intent(Hospital_Login.this,Hospital_Login.class);
                            startActivity(i);
                        }

                    }
                });
            }
        });
    }
    public void info(View view)
    {
        Intent i = new Intent(this,Hospital_Info.class);
        startActivity(i);
    }

    public void Login(View view)
    {
        Intent i = new Intent(this,Hospital.class);
        startActivity(i);
    }
}
