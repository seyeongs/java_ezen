package IOpakage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputEx1 {

	public static void main(String[] args) {
		File saveF = new File("C:\\seyoung\\javaproject\\File\\save.txt"); //������ �����ȴ�
		try {
			FileOutputStream fileOut = new FileOutputStream(saveF);
			String memo = "�� ������ ����� �ڹ� ������ ���� �����մϴ�";
			fileOut.write(memo.getBytes());
			fileOut.close();
		} catch (IOException e) {
			System.out.println("������ ���� �� �� �����ϴ�");
		}
		
	}

}
