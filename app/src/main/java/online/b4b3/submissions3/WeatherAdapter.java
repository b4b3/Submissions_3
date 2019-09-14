package online.b4b3.submissions3;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder> {
    private ArrayList<WeatherItems> mData = new ArrayList<>();
    private Context context;
    private AdapterView.OnItemClickListener mListener;



    public void setData(ArrayList<WeatherItems> items) {
        mData.clear();
        mData.addAll(items);
        notifyDataSetChanged();
    }



    @NonNull
    @Override
    public WeatherViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.weather_items, viewGroup, false);
        return new WeatherViewHolder(mView);
    }
    @Override
    public void onBindViewHolder(@NonNull WeatherViewHolder weatherViewHolder, int position) {

        weatherViewHolder.textViewNamaKota.setText(mData.get(position).getTitle());
        weatherViewHolder.textViewTemperature.setText(mData.get(position).getPosterpath());
        weatherViewHolder.textViewDescription.setText(mData.get(position).getOverview());
        Glide.with(weatherViewHolder.itemView.getContext())
                .load(mData.get(position).getPosterpath())
                .apply(new RequestOptions().override(55, 55))
                .into(weatherViewHolder.imgPhoto);

    }
    @Override
    public int getItemCount() {
        return mData.size();
    }
    class WeatherViewHolder extends RecyclerView.ViewHolder {
        TextView textViewNamaKota;
        TextView textViewTemperature;
        TextView textViewDescription;
        ImageView imgPhoto;

        WeatherViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNamaKota = itemView.findViewById(R.id.textKota);
            textViewTemperature = itemView.findViewById(R.id.textTemp);
            textViewDescription = itemView.findViewById(R.id.textDesc);
            imgPhoto = itemView.findViewById(R.id.movie_poster);


        }

        void bind(WeatherItems weatherItems) {

            textViewNamaKota.setText(weatherItems.getTitle());
            textViewTemperature.setText(weatherItems.getPosterpath());
            textViewDescription.setText(weatherItems.getOverview());



        }


    }
}
