package com.example.verifying_interactions;

public class CalculatorService {
	
	private CalculatorApi api;
	
	public CalculatorService(CalculatorApi api) {
		this.api = api;
	}
	
	public int add(int a,int b) {
		return api.add(a,b);
	}
}
