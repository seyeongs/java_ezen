package javaAPI;

public class StringBuilderEx1 {

	public static void main(String[] args) {
//		String data = "korea ";
//		data+="fighting "; //���ο� ��ü�� �����ǰ� �ּҰ� ����ȴ�
//		data+="corona"; //���ο� ��ü�� �����ǰ� �ּҰ� ����ȴ�
//		System.out.println(data);
		//��ü�� �޸𸮿� ���� �Ҵ�ǹǷ� ���ڰ��� + �����ڸ� ���� ������ �޸𸮰� ���� ���δ�
		//���� ���ڿ� ���� �۾��� ���� ���� ����(buffer(�ӽ� ���� �޸�)�� ����ϴ� StringBuilder Ŭ������ ����ϴ� ���� ���� 
		
		StringBuilder sb = new StringBuilder();
		sb.append("java "); //���ۿ� �߰�
		sb.append("Pregram Study");//�ռ� �߰��� "java" �ڿ� �߰��ȴ�
		sb.insert(12, "ning"); //12��° �ε����� ����
		sb.setCharAt(12, 'm'); //12��° �ε��� ���� �ٲٱ�
		sb.setCharAt(7, 'o'); //12��° �ε��� ���� �ٲٱ�
		sb.replace(5,16, "API");//5~15�ε����� ��ü
		sb.delete(4, 8);//4~7�ε��� ����
		System.out.println(sb.toString());
		System.out.println("�� ���ڼ� " + sb.length());
		
		String result = sb.toString();
		System.out.println(result);
		
	}

}
