package javaClass;

public class Anonymous {
	//�ʵ尪���� Ŭ���� ����
	Person pField = new Person() {
		void work() {
			System.out.println("����մϴ�.");
		}
		
		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�");
			work();
		}
	};
	
	
	void method1(Person person) {
		person.wake();
	}
	
	void method2() {
		//���� ������ ��ü ����
		Person localPerson = new Person() {
			void walk() {
				System.out.println("��å");
			}
			@Override
			void wake() {
				System.out.println("5�� ���");
				walk();
			}
		};
		
		localPerson.wake();
		
	}
	
	
}
