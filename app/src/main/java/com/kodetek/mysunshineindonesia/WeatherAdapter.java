package com.kodetek.mysunshineindonesia;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ASUS on 04/11/2017.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder> {
    private final List<Weather> weatherList;

    public WeatherAdapter(List<Weather> weatherListData) {
        weatherList = weatherListData;
    }

    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewContent = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_item, parent, false);
        return new WeatherViewHolder(viewContent);
    }

    @Override
    public void onBindViewHolder(WeatherViewHolder holder, int position) {
        holder.itemTitle.setText("Cuaca Hari Ini tanggal" + position);
        holder.weatherItemImage.setImageResource(weatherList.get(position).getWeatherImage());
        holder.weatherItemDate.setText(weatherList.get(position).getWeatherDate());
        holder.weatherItemDesc.setText(weatherList.get(position).getWeatherDesc());
        holder.weatherItemTemperature.setText(weatherList.get(position).getWeatherTemperature());

    }

    @Override
    public int getItemCount() {
        return weatherList.size();
    }

    class WeatherViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.item_title)
        TextView itemTitle;

        @BindView(R.id.weather_item_image)
        ImageView weatherItemImage;

        @BindView(R.id.weather_item_date)
        TextView weatherItemDate;

        @BindView(R.id.weather_item_temperature)
        TextView weatherItemTemperature;

        @BindView(R.id.weather_item_desc)
        TextView weatherItemDesc;

        public WeatherViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this,itemView);
        }
    }
}
