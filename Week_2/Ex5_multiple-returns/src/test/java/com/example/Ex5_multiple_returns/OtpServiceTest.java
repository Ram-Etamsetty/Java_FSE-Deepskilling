package com.example.Ex5_multiple_returns;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OtpServiceTest {
	
	@Test
	public void test() {
		OtpService otpService = Mockito.mock(OtpService.class);
		
		when(otpService.getOtp()).thenReturn(2345).thenReturn(3782).thenReturn(8756);
		
		for(int i=0;i<3;i++) {
			System.out.println((i+1)+" Call : "+otpService.getOtp());
		}
	}
}
