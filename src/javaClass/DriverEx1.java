package javaClass;

public class DriverEx1 {

	public static void main(String[] args) {
		try {
			Driver me = new Driver();
			Taxi taxi = new Taxi();
			Truck truck = new Truck();
			Bus bus = new Bus();
			me.drive(truck);
			me.drive(taxi);
			me.drive(bus);
		}catch(ClassCastException e) {
			System.out.println("타입을 변환할 수 없습니다");
		}
		
	}

}
