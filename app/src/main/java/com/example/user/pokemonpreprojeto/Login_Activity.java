package com.example.user.pokemonpreprojeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Login_Activity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button Login = (Button) findViewById(R.id.LoginButton);
        Button Register = (Button) findViewById(R.id.RegisterButton);
    }

    public void RegisterLay(View view){
        Intent registerpage = new Intent(this,RegisterActivity.class);
        startActivity(registerpage);
    }

    public void Login(View view){
        Intent pokepage = new Intent(this,PokemonMain.class);
        startActivity(pokepage);
    }

}
