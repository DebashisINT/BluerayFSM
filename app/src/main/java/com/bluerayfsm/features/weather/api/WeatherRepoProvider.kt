package com.bluerayfsm.features.weather.api

import com.bluerayfsm.features.task.api.TaskApi
import com.bluerayfsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}