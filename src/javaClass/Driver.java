package javaClass;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) { //타입이 맞는지 물어봄
			
				Bus bus = (Bus)vehicle;
				bus.checkFare();
			
		}
		
		vehicle.run();
	}
	
	
}
