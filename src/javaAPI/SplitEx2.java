package javaAPI;

import java.util.StringTokenizer;

public class SplitEx2 {

	public static void main(String[] args) {
		String str = "���̵�,�̸�,�н�����";
		String[] strs = str.split(",");
		for(String sstr : strs) {
			System.out.println(sstr);
		}
	
		StringTokenizer st = new StringTokenizer(str, ",");
		while (st.hasMoreTokens()){
			String m = st.nextToken();
			System.out.println(m);
		}
	

	}

}
