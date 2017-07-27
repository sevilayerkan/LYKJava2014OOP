package tr.org.linux.kamp.inheritance;

public class Bicycle {
	private int gear;
	protected int speed;
	protected String color;
	
	public Bicycle() {
		System.out.println("Bicycle nesnesi yaratıldı.");
	}
	
	public Bicycle(int gear ,int speed , String color) {
		this(); //
		this.gear = gear;
		this.color = color;
		this.speed = speed;
	}
	
	
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int changeSpeed(int speed) {
		return this.speed = speed ;
	}
	
	public void changeGear(int gear) {
		if(gear > 0) {
			this.gear = gear;
		}
		else System.out.println("Vites değeri pozitif olmalı.");
	}

	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + ", color=" + color + "]";
	}
	
	

}
