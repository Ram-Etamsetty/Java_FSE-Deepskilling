package com.example.verifying_interactions;


import static org.mockito.Mockito.*; 
import org.junit.jupiter.api.Test; 
import org.mockito.Mockito; 
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {
	@Test
	public void testService() {
		CalculatorApi mockApi = Mockito.mock(CalculatorApi.class);
		CalculatorService service = new CalculatorService(mockApi);
		when(mockApi.add(2, 3)).thenReturn(5);
		
		assertEquals(5,service.add(2, 3));
		verify(mockApi).add(2,3);
	}
}
