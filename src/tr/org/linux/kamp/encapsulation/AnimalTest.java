package tr.org.linux.kamp.encapsulation;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		
		animal.setKind("Sürüngen");
		animal.setColor("sarı");
		animal.setAge(3);
		
		
		animal.hunt();
		animal.eat();
		
		System.out.println("Türü :  " + animal.getKind() + " Rengi :  " + animal.getColor()
		+ " Yaşı :  " + animal.getAge());
	}

}
