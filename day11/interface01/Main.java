package day11.interface01;

public class Main {

	public static void main(String[] args) {
		Car c1 = new Car("MK");
		c1.Accel();
		c1.Accel();
		c1.Accel();
		c1.Accel();
		c1.getStatus();
		c1.Break();
		c1.getStatus();
		c1.refuel();
		c1.getStatus();
		
		Train t1 = new Train("MK");
		t1.Accel();
		t1.getStatus();
		t1.Break();
		t1.getStatus();
		t1.refuel();
		t1.getStatus();
		
		Airplane a1 = new Airplane("MK");
		a1.Accel();
		a1.getStatus();
		a1.Break();
		a1.getStatus();
		a1.refuel();
		a1.getStatus();

	}

}
