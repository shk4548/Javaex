package com.javaex.api.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	
	// 입력방향과 출력 방향이 반대
	// First Input First Output(FIFO)
	public static void main(String[] args) {
		// 실체 클래스가 없다. 인터페이스만 존재
		Queue<Integer> queue = new LinkedList<>();
		
		// 데이터의 제공
		for (int i =1; i <= 10; i ++ ) {
			queue.offer(i);
			System.out.println("OFFER:" + queue);
		}
		
		System.out.println("PEEK:" + queue.peek());  // peek는 삭제하지 않고 조회만 한다.
		System.out.println("QUEUE:" + queue);
		
		while(!queue.isEmpty()) {  // queue 가 비어있지 않으면 인출
			System.out.println("POLL :" + queue.poll());  // 인출 후 삭제
			System.out.println("QUEUE : " + queue);

		
		}
	}
}
