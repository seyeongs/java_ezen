package javaException;
//멀티 catch (권장하지 않음)
public class ExceptionEx6 {

	public static void main(String[] args) {
		try {
			
			String[] data = {"100", "a200"};
			int value1 = Integer.parseInt(data[0]);
			int value2 = Integer.parseInt(data[2]);
			int result = value1+value2;
			System.out.println("계산 결과: " + result);
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException  e) { //멀티 catch
			System.out.println("숫자로 변환 할 수 없거나 배열 인덱스를 초과했습니다");
		}catch(Exception e) { //모든 예외 처리
			System.out.println("프로그램 개발자에게 문의하세요 010-0000-0000" + e.getMessage());
		}finally { //예외 발생 유무와 관계 없이 무조건 실행
			System.out.println("화이팅");
		}

	}

}
