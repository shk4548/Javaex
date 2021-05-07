package com.javaex.exception;

import java.io.IOException;

//예외의 두종류
// 1. checked Exception >> 반드시 예외처리를 해줘야 한다
// 2. runtime Exception >> 예외 처리를 해주지 않아도 된다
public class ThrowExcept {
	public void executeException() throws IOException // 명시 꼭해
	{
		System.err.println("강제 예외 발생");
		throw new IOException("강제 예외");
	}
	
	
	// Unchecked Excption
	public void executeRuntimeExcption() {
		System.err.println("강제 런타임 예외");
		
		throw new RuntimeException("런타임 예외");
	}
	
	
	public double divide(int num1, int num2) {
		double result;
		
		try {
			//일반적인 예외 > 구체적인 예외 전환 해서 
			//예외 상황에서의 상황 정보를 담고 있는것이 좋다
			
			result =num1/num2;
		} catch(ArithmeticException e) {
			//구체적인 예외 전환 바깥으로 throw
			System.err.println("예외의 전환");
			throw new CustomArithmeticException("사용자 정의 예외", 
					num1,num2);
		}
		return result;
	}
}
