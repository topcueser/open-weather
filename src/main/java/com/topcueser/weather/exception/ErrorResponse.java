package com.topcueser.weather.exception;

public record ErrorResponse(
        String success,
        Error error
) {
}
