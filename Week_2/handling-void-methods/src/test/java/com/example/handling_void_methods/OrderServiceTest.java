package com.example.handling_void_methods;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OrderServiceTest {
	
	@Test
	public void test() {
		OrderService orderService = Mockito.mock(OrderService.class);
		doNothing().when(orderService).placeOrder();
		orderService.placeOrder();
		verify(orderService).placeOrder();
	}
	
}
