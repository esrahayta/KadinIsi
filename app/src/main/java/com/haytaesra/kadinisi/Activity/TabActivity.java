package com.haytaesra.kadinisi.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.haytaesra.kadinisi.Fragment.Fragment_Add;
import com.haytaesra.kadinisi.Fragment.Fragment_Home;
import com.haytaesra.kadinisi.Fragment.Fragment_Notification;
import com.haytaesra.kadinisi.Fragment.Fragment_Profile;
import com.haytaesra.kadinisi.Fragment.Fragment_Search;
import com.haytaesra.kadinisi.R;


public class TabActivity extends AppCompatActivity {




    /**
     * The {@link ViewPager} that will host the section contents.
     */



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction transaction=fragmentManager.beginTransaction();
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    transaction.replace(R.id.content,new Fragment_Home()).commit();
                    return true;
                case R.id.navigation_profile:
                    transaction.replace(R.id.content,new Fragment_Profile()).commit();
                    return true;
                case R.id.navigation_search:
                    transaction.replace(R.id.content,new Fragment_Search()).commit();
                    return true;

                case R.id.navigation_notifications:
                    transaction.replace(R.id.content,new Fragment_Notification()).commit();
                    return true;
                case R.id.navigation_plus:
                    transaction.replace(R.id.content,new Fragment_Add()).commit();
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.content,new Fragment_Home()).commit();

    }

    public static void show(Bundle extras,Context from){
        Intent myIntent = new Intent(from, TabActivity.class);
        if(extras!=null)
            myIntent.putExtras(extras);
        from.startActivity(myIntent);
    }

}
