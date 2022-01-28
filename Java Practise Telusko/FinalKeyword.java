final class Kl{                        //------------> Once a class if final, another class cannot use it or extend it.
	final int a = 22;
	public void mai() {
		a = 32;                         //--------> Once a variable is final, its value cannot be changed
	}
	public final void show() { 
		System.out.println("In Kl Show");
	}
}

class Kl1 extends Kl{
	public void show() {                        //----------> Once a method is final, another class cannot use same method name or override it
		System.out.println("In Kl1 Show");
	}
}
public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
