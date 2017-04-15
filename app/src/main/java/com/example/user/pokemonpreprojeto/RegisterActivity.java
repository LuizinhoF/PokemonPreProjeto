package com.example.user.pokemonpreprojeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button button = (Button) findViewById(R.id.Register);
        button.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.BacktoLogin);
        button2.setOnClickListener(this);
    }

    public void onClick(View v) {
    }

    public void RegisterConfirm(View view){
        Intent loginpage = new Intent(this,Login_Activity.class);
        startActivity(loginpage);
    }

    public void BackToLogin(View view){
        Intent loginpage = new Intent(this,Login_Activity.class);
        startActivity(loginpage);
    }
}
