package com.haytaesra.kadinisi.Activity;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import com.haytaesra.kadinisi.R;

import java.util.Calendar;

/**
 * Created by esra on 18.8.2017.
 */

public class ShoppingRegisterActivity extends AppCompatActivity {
    TextView mDisplayDateShopping;
    TextView mDisplayDate1Shopping;
    EditText editText,editTextShoppingCinsiyet;

    private DatePickerDialog.OnDateSetListener mDateSetListenerShopping;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
        mDisplayDateShopping=(TextView)findViewById(R.id.showDate_shopping);
        mDisplayDate1Shopping=(TextView)findViewById(R.id.showDate2_shopping);
        mDisplayDateShopping.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(ShoppingRegisterActivity.this,android.R.style.Theme_Holo_Light_Dialog_MinWidth,mDateSetListenerShopping,year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }


        });

        mDateSetListenerShopping= new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month=month+1;
                String date=day+"/"+month+"/"+year;
                mDisplayDate1Shopping.setText(date);
            }
        };

        editText=(EditText)findViewById(R.id.showDate_shopping) ;
        editTextShoppingCinsiyet=(EditText)findViewById(R.id.txtCinsiyetShopping);
        editText.setFocusable(false);
        editTextShoppingCinsiyet.setFocusable(false);






    }
    public static void show(Bundle extras, Context from) {
        Intent myIntent = new Intent(from, ShoppingRegisterActivity.class);
        if (extras != null)
            myIntent.putExtras(extras);
        from.startActivity(myIntent);
    }


}
