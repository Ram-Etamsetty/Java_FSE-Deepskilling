package com.example.Ex6_verifying_interaction_order;

import static org.mockito.Mockito.doNothing;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

public class EcommerceServiceTest {
	
	@Test
	public void test() {
		EcommerceService ecommerceService = Mockito.mock(EcommerceService.class);
		
		doNothing().when(ecommerceService).login();
		doNothing().when(ecommerceService).placeOrder();
		doNothing().when(ecommerceService).logout();
		
		ecommerceService.login();
		ecommerceService.logout();
		ecommerceService.placeOrder();
		
		InOrder inorder = Mockito.inOrder(ecommerceService);
		
		inorder.verify(ecommerceService).login();
		inorder.verify(ecommerceService).placeOrder();
		inorder.verify(ecommerceService).logout();
	}
}