package com.haytaesra.kadinisi.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.haytaesra.kadinisi.R;

/**
 * Created by esra on 8.9.2017.
 */

public class Fragment_Add extends android.support.v4.app.Fragment{

    Button btnEkle;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, final Bundle savedInstance) {

        if (container == null) {
            return null;


        }
        View rootView = inflater.inflate(R.layout.fragment_add, container, false);
        btnEkle = (Button) rootView.findViewById(R.id.btnUrunEkle);
        btnEkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                    Fragment_AddProduct nextFrag = Fragment_AddProduct.newInstance();
                    Fragment_Add.this.getFragmentManager().beginTransaction()
                            .add(R.id.root_view, nextFrag, "Fragment_AddProduct")
                            .addToBackStack(null)
                            .commit();


            }
        });
        return rootView;
    }
}
