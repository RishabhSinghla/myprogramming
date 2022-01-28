interface Bn{
	public void A();
	default void B() {
		System.out.println("Hey");
	}
}

class Bnm implements Bn{                     //From Java 1.8 we can use interface to define and declare methods
	public void A() {                          //Using default keyword
		System.out.println("Hoi");             //Also method overriding is possible in here
	}
}
public class DefaultKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bn obj = new Bnm();
		obj.A();
	}

}
