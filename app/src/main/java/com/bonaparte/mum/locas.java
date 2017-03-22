package com.bonaparte.mum;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.content.res.Configuration;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;


/**
 * A simple {@link Fragment} subclass.
 */
public class locas extends Fragment {


    public locas() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_locas, container, false);
    }

}
