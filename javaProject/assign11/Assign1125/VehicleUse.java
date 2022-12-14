package Assign1125;

public class VehicleUse {

	public static void main(String[] args) {
	
		Plane p = new Plane();
		p.speedUp();
		p.speedDown();
		p.handle();
		
		System.out.println();
		
		Boat b = new Boat();
		b.speedUp();
		b.speedDown();
		b.handle();
}
}
