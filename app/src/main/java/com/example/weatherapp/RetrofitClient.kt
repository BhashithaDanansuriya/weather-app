package com.example.weatherapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Singleton object that provides a Retrofit instance for network operations.
 */
object RetrofitClient {
    private const val BASE_URL = "https://api.openweathermap.org/"

    /**
     * The single instance of [WeatherApiService] used throughout the app.
     */
    val instance: WeatherApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(WeatherApiService::class.java)
    }
}