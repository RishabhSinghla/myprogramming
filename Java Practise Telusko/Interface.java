interface Aba{
	void A();
}

class Pen implements Aba
{
	public void A(){                     // Interface is like abstract class, you can only declare it
		System.out.println("Holo");           //implements is used to use interface in a class
	}                                        //methods in interface are automatically public abstract
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aba obj = new Pen();                   //We can create reference of interface and object of class
		obj.A();
	}

}
