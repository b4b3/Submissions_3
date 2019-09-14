package online.b4b3.submissions3;


import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import java.util.ArrayList;


public class BlankFragment extends Fragment {
    ProgressBar progressBar;
    RecyclerView mRecyclerView;
    WeatherAdapter movieTvAdapter;
    private MainViewModel mainViewModel;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        mRecyclerView = view.findViewById(R.id.recyclerMovies);
        mRecyclerView.setHasFixedSize(true);

        progressBar = view.findViewById(R.id.progressBar);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        movieTvAdapter = new WeatherAdapter();
        movieTvAdapter.notifyDataSetChanged();
        mRecyclerView.setAdapter(movieTvAdapter);

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        mainViewModel.setWeather();
        showLoading(true);
        mainViewModel.getWeathers().observe(this, getMvData);
   }

    private Observer<ArrayList<WeatherItems>> getMvData = new Observer<ArrayList<WeatherItems>>() {
        @Override
        public void onChanged(final ArrayList<WeatherItems> movies) {
            movieTvAdapter.setData(movies);
            showLoading(false);

        }
    };

    private void showLoading(boolean loading) {
        if (loading) {
            progressBar.setVisibility(View.VISIBLE);
        } else {
            progressBar.setVisibility(View.GONE);
        }
    }


}
