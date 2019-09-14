package online.b4b3.submissions3;



import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;



public class BlankFragment extends Fragment {
    private WeatherAdapter adapter;

    private RecyclerView recyclerView;
    private ArrayList<WeatherItems> listMovie = new ArrayList<>();
    private static String[] dataName;
    private static String[] dataDescription;
    private static TypedArray dataPhoto;
    View v;
    public static String EXTRA_MOVIE = "extra_movie";


    public BlankFragment() {
        // Required empty public constructor


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_blank, container, false);

        return v;
    }
    private void updateView(String lang) {

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);




    }



}