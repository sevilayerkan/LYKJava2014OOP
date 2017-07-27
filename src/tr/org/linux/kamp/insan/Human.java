package tr.org.linux.kamp.insan;

public class Human {
	int age;
	String gender;
	String name;
	String id;
	
	public Human() {
		System.out.println("İnsan nesnesi yaratıldı.");
	}
	
	public Human(String id ,String name , String gender, int age) {
		this(); //
		this.name = name;
		this.id = id;
		this.age = age;
		this.gender = gender;
	}
	
	public void sleep() {
		System.out.println("İnsan uyudu");
	}
	
	public void eat() {
		System.out.println("İnsan yemek yedi");
	}
	
	public void speak() {
		System.out.println("İnsan konuştu");
	}
	
	public void code() {
		System.out.println("ve insan kod yazdı");
	}

}
