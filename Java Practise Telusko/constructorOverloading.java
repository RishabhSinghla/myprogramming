class Casio1{
	public Casio1() {
		System.out.println("Hello");
	}                                                //This is called constructor overloading...calling same method with diff parameters
	public Casio1(float i, float j) {               //Only one is called at a time..or else another object needs to be created
		System.out.println(i+j);
	}
}

public class constructorOverloading {

	public static void main(String[] args) {
		Casio1 var = new Casio1(45.5f, 67.8f);
		Casio1 var2 = new Casio1();
	}

}
