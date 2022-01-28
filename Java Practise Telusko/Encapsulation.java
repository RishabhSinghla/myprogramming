class Boy3{
	private int a;
	private int b;
	
	public void Boy3(){                      //----------->>> Encapsulation means binding variables with methods.
		System.out.println(a);              //-------------->>> those private variables can only be accessed by method and
	}                                       //------------>> not by object created.
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boy3 obj = new Boy3();
		obj.Boy3();
	}

}
