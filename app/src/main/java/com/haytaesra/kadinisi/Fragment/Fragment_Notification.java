package com.haytaesra.kadinisi.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.haytaesra.kadinisi.R;

/**
 * Created by esra on 25.8.2017.
 */

public class Fragment_Notification extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (container == null) {
            return null;


        }
        View rootView = inflater.inflate(R.layout.fragment_notification, container, false);
        return rootView;
    }

}
