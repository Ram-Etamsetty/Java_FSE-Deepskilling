package com.example.mocking_and_stubbing;

public class WeatherService {
	private WeatherApi api;
	
	public WeatherService(WeatherApi api) {
		this.api = api;
	}
	
	public String getTemp() {
		return "Current Temperature: "+ api.getTemperature()+" Celcius";
	}
}
