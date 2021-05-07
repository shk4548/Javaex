package com.javaex.api.objectclass.v2;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point (10,10);
		Point p2 = new Point (10,10);
		
		// ==  > 주소비교
		// .equals > 값비교
		System.out.println("p == p2 ?" + (p == p2));
		System.out.println("p.equals(p2) ?" + p.equals(p2)); // equals를 override 두 객체 비교 방법 정의
		
	}

}
