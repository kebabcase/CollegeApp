package com.techhab.collegeapp;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class RichardsonMenuFragment extends Fragment {

    View v;

    public RichardsonMenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_richardson_menu, parent, false);

        // TODO: show the tab menu here

        // Then set up the view.

        return v;
    }

    @Override
    public void onPause() {
        super.onPause();
        // TODO: hide the tab menu here
    }

    @Override
    public void onStop() {
        super.onStop();
        // TODO: hide the tab menu here
    }


}