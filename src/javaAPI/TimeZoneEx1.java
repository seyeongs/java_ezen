package javaAPI;

import java.util.TimeZone;

public class TimeZoneEx1 {

	public static void main(String[] args) {
		String[] timeZoneID = TimeZone.getAvailableIDs();
		for(String id : timeZoneID) {
			System.out.println(id);
		}

	}

}
