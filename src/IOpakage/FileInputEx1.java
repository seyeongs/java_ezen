package IOpakage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputEx1 {
	//C:\seyoung\javaproject\File
	public static void main(String[] args) {
		File folder = new File("C:/seyoung/javaproject/File");
		File file = new File("C:\\seyoung\\javaproject\\File\\Info.txt");
		if(folder.exists()) {
			System.out.println("�̹� ������ �����մϴ�");
		}else {
			folder.mkdir();
			System.out.println("������ �������� �ʽ��ϴ�");
		}
		
		try {
			FileInputStream fileIS = new FileInputStream(file);
			byte[] readByte = new byte[fileIS.available()];
			fileIS.read(readByte);
			String str = new String(readByte);
			System.out.println(str);
			fileIS.close();
		} catch (IOException e) {
			System.out.println("������ �о�� �� �������ϴ�");
		}
		
		
		
		
		
		
		
		

	}

}
