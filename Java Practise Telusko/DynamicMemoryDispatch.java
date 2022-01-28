class Ben{
	public void show() {
		System.out.println("In Ben");
	}
}
class Ben1 extends Ben{
	public void show() {
		System.out.println("In Ben1");
	}
}
class Ben2 extends Ben{
	public void show() {
		System.out.println("In Ben2");
	}
}
public class DynamicMemoryDispatch {
	//Compile Time Polymorphism
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ben obj = new Ben1(); //Ben1 object is created but Ben reference is used.
		// this is called run time polymorphism.
		obj.show();
		
		obj = new Ben2();
		obj.show(); //This is called Dynamic Memory Dispatch
		
	}

}
