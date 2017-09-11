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
 * Created by esra on 17.8.2017.
 */

public class OpenStoreActivity extends AppCompatActivity {
    TextView mDisplayDate;
    TextView mDisplayDate1;
    EditText editTextStore,editTextCinsiyet;

    private DatePickerDialog.OnDateSetListener mDateSetListener;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_openstore);
        mDisplayDate=(TextView)findViewById(R.id.showDate);
        mDisplayDate1=(TextView)findViewById(R.id.showDate2);
        mDisplayDate.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Calendar cal = Calendar.getInstance();
                    int year = cal.get(Calendar.YEAR);
                    int month = cal.get(Calendar.MONTH);
                    int day = cal.get(Calendar.DAY_OF_MONTH);

                    DatePickerDialog dialog = new DatePickerDialog(OpenStoreActivity.this,android.R.style.Theme_Holo_Light_Dialog_MinWidth,mDateSetListener,year,month,day);
                    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    dialog.show();
                }


            });




        mDateSetListener= new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month=month+1;
                String date=day+"/"+month+"/"+year;
                mDisplayDate1.setText(date);
            }
        };

        editTextStore=(EditText)findViewById(R.id.showDate);
        editTextCinsiyet=(EditText)findViewById(R.id.txtCinsiyet);
        editTextStore.setFocusable(false);//veri girişi engellendi
        editTextCinsiyet.setFocusable(false);




    }
    public static void show(Bundle extras, Context from){
    Intent myIntent = new Intent(from, OpenStoreActivity.class);
    if(extras!=null)
        myIntent.putExtras(extras);
    from.startActivity(myIntent);
}
}
