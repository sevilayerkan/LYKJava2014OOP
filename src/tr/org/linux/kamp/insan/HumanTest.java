package tr.org.linux.kamp.insan;

public class HumanTest {
	public static void main(String[] args) {
		
		//nesneyi yaratma işlemi
		Human sevilay = new Human();
		Human x = new Human("1","Undefined" ,"robot" ,3);
		
		//nesnenin durumları
		sevilay.name = "Sevilay";
		sevilay.age = -1;
		sevilay.gender = "no";
		sevilay.id = "000";
		
		//nesnenin davranışları
		sevilay.eat();
		sevilay.sleep();
		sevilay.code();
	}
}
