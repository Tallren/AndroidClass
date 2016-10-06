package com.iandavis.android.personaltrainer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    public Button loginButton;
    public EditText usernameInput;
    public EditText passwordInput;
    public String username;
    public String password;
    public String correctPassword;
    public String correctUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginButton = (Button) findViewById(R.id.login);
        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                usernameInput = (EditText) findViewById(R.id.usernameInput);
                passwordInput = (EditText) findViewById(R.id.passwordInput);
                username = usernameInput.getText().toString();
                password = passwordInput.getText().toString();
                correctUsername = getString(R.string.username);
                correctPassword = getString(R.string.password);

                Intent intent = new Intent(Login.this, MainMenu.class);

                if(username.equals(correctUsername) && password.equals(correctPassword)){
                    startActivity(intent);
                }

                else{
                    usernameInput.clearComposingText();
                    passwordInput.clearComposingText();
                }
            }
        });
    }
}
