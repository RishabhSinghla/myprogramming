abstract class Mon{
	public abstract void m();
}

class Mon1 extends Mon{                         //Abstract class must have abstract method 
	public void m() {                              //It can also have normal method;
		System.out.println("Abs");                 //If another class extends abstract class, then it must use the method
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mon obj = new Mon1();
		obj.m();
	}

}
