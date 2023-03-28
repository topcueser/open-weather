package com.topcueser.weather.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Location(
        String name,
        String country,
        String region,
        @JsonProperty("localtime")
        String localTime
) {
}
