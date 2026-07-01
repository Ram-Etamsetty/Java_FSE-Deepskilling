package com.example.mocking_and_stubbing;


import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class WeatherServiceTest {
	@Mock
	WeatherApi mockApi;
	
	@InjectMocks
	WeatherService weatherService;
	
	@Test
	public void testWeather() {
		when(mockApi.getTemperature()).thenReturn(24);
		WeatherService ws = new WeatherService(mockApi);
		System.out.println(ws.getTemp());
		assertNotNull(ws.getTemp());
	}
}
