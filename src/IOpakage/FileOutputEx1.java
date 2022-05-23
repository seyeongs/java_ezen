package IOpakage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputEx1 {

	public static void main(String[] args) {
		File saveF = new File("C:\\seyoung\\javaproject\\File\\save.txt"); //파일이 생성된다
		try {
			FileOutputStream fileOut = new FileOutputStream(saveF);
			String memo = "이 내용이 저장됨 자바 스맛폰 구현 시작합니다";
			fileOut.write(memo.getBytes());
			fileOut.close();
		} catch (IOException e) {
			System.out.println("파일을 저장 할 수 업습니다");
		}
		
	}

}
