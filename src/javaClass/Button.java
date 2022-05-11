package javaClass;

public class Button {
	
	//필드
	OnClickListener listener; //인터페이스 타입 필드
	
	//메ㅅㅓ드
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
		
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener{
		void onClick();
	}
}
