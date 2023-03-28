package com.topcueser.weather.dto;

import com.topcueser.weather.model.WeatherEntity;

public record WeatherDto(
        String cityName,
        String country,
        Integer temperature
) {

    public static WeatherDto convert(WeatherEntity weatherEntity) {
        return new WeatherDto(weatherEntity.getCityName(), weatherEntity.getCountry(), weatherEntity.getTemperature());
    }
}
