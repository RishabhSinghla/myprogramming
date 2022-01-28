interface Abaaa{
	public void show();
}

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abaaa obj = () -> System.out.println("Hello");  // -> stands for lamdba
		obj.show();                                       //--------() stands for show function written above
	}

}
