package javaClass;

public class DriverEx1 {

	public static void main(String[] args) {
		Driver me = new Driver();
		Taxi taxi = new Taxi();
		Truck truck = new Truck();
		Bus bus = new Bus();
		me.drive(truck);
//		me.drive(taxi);
//		me.drive(bus);
	}

}
