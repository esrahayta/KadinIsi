package com.haytaesra.kadinisi.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.haytaesra.kadinisi.R;

/**
 * Created by esra on 10.9.2017.
 */

public class Fragment_AddProduct extends Fragment {

    View rootView;
    public static Fragment_AddProduct newInstance() {
        Fragment_AddProduct fragment = new Fragment_AddProduct();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_add_product, container, false);

        return rootView;
    }
}
