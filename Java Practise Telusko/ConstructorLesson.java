class Bat{
	int a; //instance variable
	int b;
	
	public Bat() { //Default Constructor
		a = 5;
		b = 6;
	}
	
	public Bat(int d /*local variable*/, int c) { //Parameterised Constructor
		a = d;
		b = c;
	}
}
public class ConstructorLesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bat obj = new Bat(7, 10);
		
		System.out.println(obj.a);
		System.out.println(obj.b);
	}

}
