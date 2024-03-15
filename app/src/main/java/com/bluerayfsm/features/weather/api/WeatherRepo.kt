package com.bluerayfsm.features.weather.api

import com.bluerayfsm.base.BaseResponse
import com.bluerayfsm.features.task.api.TaskApi
import com.bluerayfsm.features.task.model.AddTaskInputModel
import com.bluerayfsm.features.weather.model.ForeCastAPIResponse
import com.bluerayfsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}