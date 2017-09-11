package com.haytaesra.kadinisi.Activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.haytaesra.kadinisi.R;


public class OnBoardActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_board);
        setButtons();
    }
    private void setButtons(){
        findViewById(R.id.facebook_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        findViewById(R.id.twitter_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        findViewById(R.id.signup_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignUpActivity.show(null,OnBoardActivity.this);
            }
        });

        findViewById(R.id.login_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginActivity.show(null,OnBoardActivity.this);
            }
        });
        findViewById(R.id.no_login_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TabActivity.show(null,OnBoardActivity.this);
            }
        });

    }
    public static void show(Bundle extras,Context from){
        Intent myIntent = new Intent(from, OnBoardActivity.class);
        if(extras!=null)
            myIntent.putExtras(extras);
        from.startActivity(myIntent);
    }

}
