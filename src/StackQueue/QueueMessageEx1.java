package StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMessageEx1 {

	public static void main(String[] args) {
		Queue<QueueMessage> msgQ = new LinkedList<QueueMessage>(); //Queue �������̽��� ��ǥ���� ������ü�� LinkedList�̴�
		
		msgQ.offer(new QueueMessage("�̸���", "ȫ�浿"));
		msgQ.offer(new QueueMessage("ī��", "��ȫ��"));
		msgQ.offer(new QueueMessage("����", "������"));
		msgQ.offer(new QueueMessage("���", "��μ�"));
		
		while(!msgQ.isEmpty()) {
			QueueMessage msg = msgQ.poll();
			System.out.println(msg.cmd + "�� " + msg.to + "���� �޽����� �����ϴ�");
		}
		
		
		
	}

}
