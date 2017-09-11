package com.haytaesra.kadinisi.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.haytaesra.kadinisi.R;


/**
 * Created by esra on 24.8.2017.
 */

public class Fragment_Home extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, final Bundle savedInstance) {

        if (container == null) {
            return null;


        }
        View rootView2 = inflater.inflate(R.layout.fragment_home, container, false);
        return rootView2;
    }
}