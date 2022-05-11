package javaConfirm;

public class Chatting {
	
	void startChat(String chatId) {
		//String nickName = null; //내부 메소드 변수는 암묵적으로 파이널의 성격을 가진다 따라서 값을 한 번만 넣을 수 있다
		String nickName = chatId; //startChat 메서드의 지역 변수
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}

	class Chat{
		void start() {}
		void sendMessage(String message) {
			System.out.println(message);
		}
	}
}