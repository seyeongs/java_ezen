package javaClass;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) { //Ÿ���� �´��� ���
			
				Bus bus = (Bus)vehicle;
				bus.checkFare();
			
		}
		
		vehicle.run();
	}
	
	
}
