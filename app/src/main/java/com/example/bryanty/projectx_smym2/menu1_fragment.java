package com.example.bryanty.projectx_smym2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by BRYANTY on 23/02/2015.
 */
public class menu1_fragment extends Fragment{
    View rootView;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView=inflater.inflate(R.layout.menu1_layout,container,false);
        return rootView;
    }
}
