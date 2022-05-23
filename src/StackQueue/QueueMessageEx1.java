package StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMessageEx1 {

	public static void main(String[] args) {
		Queue<QueueMessage> msgQ = new LinkedList<QueueMessage>(); //Queue 인터페이스의 대표적인 구현객체는 LinkedList이다
		
		msgQ.offer(new QueueMessage("이메일", "홍길동"));
		msgQ.offer(new QueueMessage("카톡", "엄홍길"));
		msgQ.offer(new QueueMessage("문자", "엄복동"));
		msgQ.offer(new QueueMessage("페메", "김민수"));
		
		while(!msgQ.isEmpty()) {
			QueueMessage msg = msgQ.poll();
			System.out.println(msg.cmd + "로 " + msg.to + "에게 메시지를 보냅니다");
		}
		
		
		
	}

}
