package javaClass;

public class Button {
	
	//�ʵ�
	OnClickListener listener; //�������̽� Ÿ�� �ʵ�
	
	//�ޤ��õ�
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
