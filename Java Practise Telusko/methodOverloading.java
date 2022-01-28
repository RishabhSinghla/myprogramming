class Casio{
	public void add(int i, int j) {
		System.out.println(i+j);
	}                                                //This is called method overloading...calling same method with diff parameters
	public void add(float i, float j) {               // All can work simultaneoulsy
		System.out.println(i+j);
	}
}

public class methodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casio obj = new Casio();
		obj.add(23, 24);
		obj.add(45.5f, 46.7f);
	}

}
