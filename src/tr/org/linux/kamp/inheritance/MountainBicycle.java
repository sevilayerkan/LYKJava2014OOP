package tr.org.linux.kamp.inheritance;

public class MountainBicycle extends Bicycle{
	private int spin;
	
	public MountainBicycle() {
		System.out.println("MountainBicycle nesnesi yaratıldı.");
	}
	
	public MountainBicycle(int gear ,int speed , String color,int spin) {
		super(gear,speed,color);
		this.spin = spin;
	}

	public int getSpin() {
		return spin;
	}

	public void setSpin(int spin) {
		this.spin = spin;
	}
	
	public void changeSpin(int spin) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "MountainBicycle [spin=" + spin + " color=" + super.getColor() + "speed: " + super.getSpeed() + " gear =" + super.getGear() ;
	}
}
