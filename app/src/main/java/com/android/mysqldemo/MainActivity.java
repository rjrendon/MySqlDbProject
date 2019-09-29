package com.android.mysqldemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.android.mysqldemo.R.id;

public class MainActivity extends AppCompatActivity {
    EditText UsernameEt, PasswordEt, LinkEtLogin ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UsernameEt = (EditText) findViewById(id.etUserName);
        PasswordEt = (EditText) findViewById(id.etPassword);
        LinkEtLogin=(EditText) findViewById(id.etLinkLogin);


    }

    public void OnLogin(View view) {
        String username = UsernameEt.getText().toString();
        String password = PasswordEt.getText().toString();
        String linkLog=LinkEtLogin.getText().toString();

        String type = "login";
        Background background = new Background(this);
        background.execute(type, username, password,linkLog);

    }

    public void OpenReg(View view) {
        startActivity(new Intent(this, Register.class));
    }


    public void IpConfigLogin(View view) {
        String linkLog=LinkEtLogin.getText().toString();
        Background background = new Background(this);
        background.execute(linkLog);

        Toast toastDbUrl = new Toast (getApplicationContext());
        toastDbUrl.setGravity(Gravity.CENTER, 0, 0);
        toastDbUrl.makeText(MainActivity.this, LinkEtLogin.getText(),toastDbUrl.LENGTH_LONG ).show();

    }
}

