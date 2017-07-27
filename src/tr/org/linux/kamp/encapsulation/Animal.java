package tr.org.linux.kamp.encapsulation;

public class Animal {
	//field states durumlar
	private String gender;
	private String kind;
	private int age;
	private int foot;
	private String nutrition;
	private String color;
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getFoot() {
		return foot;
	}
	public void setFoot(int foot) {
		this.foot = foot;
	}
	public String getNutrition() {
		return nutrition;
	}
	public void setNutrition(String nutrition) {
		this.nutrition = nutrition;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void eat() {
		System.out.println("Animal yemek yedi");
	}
	
	public void hunt() {
		System.out.println("Animal avlandı.");
	}
	

	
	
	
}
