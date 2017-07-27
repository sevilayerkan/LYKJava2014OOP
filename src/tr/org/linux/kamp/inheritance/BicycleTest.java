package tr.org.linux.kamp.inheritance;

public class BicycleTest {

	public static void main(String[] args) {
		MountainBicycle a = new MountainBicycle();
		
		a.setColor("blue");
		a.setSpeed(10);
		a.setGear(5);
		a.setSpin(6);
		
		MountainBicycle b = new MountainBicycle(7, 8, "yellow", 12);
		
		
		a.changeSpeed(500);
		
		System.out.println("Speed of a is :  " + a.speed);
		
		Bicycle myBike = new Bicycle(10,2,"orange");
		
		myBike.changeSpeed(8);
		b.changeSpeed(8);
		b.changeSpin(2);
		
		System.out.println(myBike.toString());
		System.out.println(b.toString());

	}

}
