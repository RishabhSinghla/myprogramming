class Aa{                                 //----------> Parent Class , Super Class
	public int add(int i, int j)
	{
		return i+j;
	}
}

class Ba extends Aa{                      //------------> Child Class , Sub Class
	public int sub(int i, int j)
	{
		return i-j;
	}
}

class Ca extends Ba{                      //----------> When 3rd comes then it is multilevel 
	public int mul(int i, int j)
	{
		return i*j;
	}
}
public class InheritanceSM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ca obj = new Ca();
		System.out.println(obj.add(5, 6));
		System.out.println(obj.sub(5, 6));
		System.out.println(obj.mul(5, 6));
	}

}
