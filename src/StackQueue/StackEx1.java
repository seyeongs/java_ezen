package StackQueue;

import java.util.Stack;

public class StackEx1 {

	public static void main(String[] args) {
		Stack<StackBookBox> box = new Stack<StackBookBox>();
		box.push(new StackBookBox("book of ilai"));
		box.push(new StackBookBox("life of pie"));
		box.push(new StackBookBox("node.js"));
		box.push(new StackBookBox("react"));
		
		while(!box.isEmpty()) {
			System.out.println("²¨³½ Ã¥ : " + box.pop().getBook());
		}

	}

}
