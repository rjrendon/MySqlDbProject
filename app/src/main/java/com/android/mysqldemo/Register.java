package com.android.mysqldemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
EditText name, surname, age, username, password ,LinkEtReg;
@Override
    protected void onCreate (Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_register);
    name = (EditText) findViewById(R.id.et_name);
    surname = (EditText) findViewById(R.id.et_surname);
    age = (EditText) findViewById(R.id.et_age);
    username = (EditText) findViewById(R.id.et_username);
    password = (EditText) findViewById(R.id.et_password);
    LinkEtReg=(EditText) findViewById(R.id.etLinkReg);

}

    public void OnReg (View view){
        String str_name = name.getText().toString();
        String str_surname = surname.getText().toString();
        String str_age = age.getText().toString();
        String str_username = username.getText().toString();
        String str_password = password.getText().toString();
        String linkReg=LinkEtReg.getText().toString();
        String type = "register";
        Background background = new Background(this);
        background.execute(type, str_name, str_surname, str_age, str_username, str_password, linkReg);

    }

    public void IpConfigReg(View view) {
        String linkReg=LinkEtReg.getText().toString();
        Background background = new Background(this);
        background.execute(linkReg);

        Toast toastDbUrl = new Toast (getApplicationContext());
        toastDbUrl.setGravity(Gravity.CENTER, 0, 0);
        toastDbUrl.makeText(Register.this, LinkEtReg.getText(),toastDbUrl.LENGTH_LONG ).show();

    }
}