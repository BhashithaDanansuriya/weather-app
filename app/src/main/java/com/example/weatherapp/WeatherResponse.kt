package com.example.weatherapp

/**
 * Data class representing the weather response from OpenWeatherMap API.
 */
data class WeatherResponse(
    val name: String,
    val main: Main,
    val weather: List<WeatherCondition>,
    val wind: Wind,
    val cod: Int
)

/**
 * Main weather information including temperature and humidity.
 */
data class Main(
    val temp: Double,
    val humidity: Int
)

/**
 * General weather condition details.
 */
data class WeatherCondition(
    val main: String,
    val description: String
)

/**
 * Wind speed information.
 */
data class Wind(
    val speed: Double
)