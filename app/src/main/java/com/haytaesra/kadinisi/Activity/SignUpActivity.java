package com.haytaesra.kadinisi.Activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.haytaesra.kadinisi.R;


public class SignUpActivity extends Activity{

    EditText emailText;
    EditText passwordText;
    EditText nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        findViewById(R.id.back_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        findViewById(R.id.btnAlisveris).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenStoreActivity.show(null,SignUpActivity.this);
            }
        });
        findViewById(R.id.btnDukkan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShoppingRegisterActivity.show(null,SignUpActivity.this);
            }
        });


    }
    public static void show(Bundle extras,Context from){
        Intent myIntent = new Intent(from, SignUpActivity.class);
        if(extras!=null)
            myIntent.putExtras(extras);
        from.startActivity(myIntent);
    }
}
