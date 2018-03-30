
public class Person {
	String imie;
	int wiek;
	
	public Person(String imie, int wiek) {
		this.imie = imie;
		this.wiek = wiek;
	}
	
	public void sayHelloTo(Object obj) {
		System.out.println("Hi " + imie);
	}
	
	
	
	

}
