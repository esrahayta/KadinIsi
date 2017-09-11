package com.haytaesra.kadinisi.Activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.haytaesra.kadinisi.R;


public class LoginActivity extends Activity {

    EditText emailText;
    EditText passwordText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        emailText = (EditText) findViewById(R.id.email_text);
        passwordText = (EditText) findViewById(R.id.password_text);
        findViewById(R.id.back_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        findViewById(R.id.forgot_password_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ForgotPasswordActivity.show(null,LoginActivity.this);
            }
        });
    }
    public static void show(Bundle extras,Context from){
        Intent myIntent = new Intent(from, LoginActivity.class);
        if(extras!=null)
            myIntent.putExtras(extras);
        from.startActivity(myIntent);
    }

}
