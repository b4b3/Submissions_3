package online.b4b3.submissions3;


import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private WeatherAdapter adapter;
    private ProgressBar progressBar;

    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        mainViewModel.getWeathers().observe(this, getWeather);

        adapter = new WeatherAdapter();
        adapter.notifyDataSetChanged();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        progressBar = findViewById(R.id.progressBar);
        mainViewModel.setWeather();
        showLoading(true);



    }

    private Observer<ArrayList<WeatherItems>> getWeather = new Observer<ArrayList<WeatherItems>>() {
        @Override
        public void onChanged(ArrayList<WeatherItems> weatherItems) {
            if (weatherItems != null) {
                adapter.setData(weatherItems);
                showLoading(false);
            }
        }
    };

    private void showLoading(Boolean state) {
        if (state) {
            progressBar.setVisibility(View.VISIBLE);
        } else {
            progressBar.setVisibility(View.GONE);
        }
    }
}
