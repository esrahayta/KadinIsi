package com.haytaesra.kadinisi.Activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.haytaesra.kadinisi.R;


public class ForgotPasswordActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        findViewById(R.id.back_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
    public static void show(Bundle extras,Context from){
        Intent myIntent = new Intent(from, ForgotPasswordActivity.class);
        if(extras!=null)
            myIntent.putExtras(extras);
        from.startActivity(myIntent);
    }

}
