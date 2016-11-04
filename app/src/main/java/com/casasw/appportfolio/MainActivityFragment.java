package com.casasw.appportfolio;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        final GridView gridView = (GridView) rootView.findViewById(R.id.gridViewApps);
        gridView.setAdapter(new ImageAdapter(getContext()));
        final Integer[] apps = {
                R.string.popular_movies, R.string.stock_hawk,
                R.string.build_it_bigger, R.string.make_your_app,
                R.string.go_ubiquitous, R.string.capstone
        };
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getContext(), "This button will launch "+getString(apps[position]), Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}
