package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
		//	stringBasic();
		//  usefulMethods();
		    StringBufferEx();
		    
	}
	
	// 문자열 객체 : 연결 메서드 수행시 매번 새 String 반환
	// StringBuffer : 버퍼 기반으로 작동
	private static void StringBufferEx() {
		//버퍼 생성
		StringBuffer sb =new StringBuffer("This");
		
		//문자열 추가 : append
		
		sb.append(" is pencil ");
		
		// 문자열 삽입 : result
		
		sb.insert(8, "my");
		
		// 문자열 치환 : replace
		sb.replace(8, 10, "your");
		
		System.out.println(sb);
		
		// 버퍼 사이즈 변경
		sb.setLength(10);  // 내부 버퍼의 크기를 10으로 줄인다.
		System.out.println(sb);
		
		// StirngBuffer의 메서드들은 연속해서 호출 > 메서드 체이닝
		StringBuffer sb2 = new StringBuffer("This")
			.append("is pencil")
			.insert(8, "my")
			.replace(8, 10, "your");
		
		String s = sb2.toString();
		
		System.out.println("결과:" + s);
	}
}
