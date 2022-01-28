class Boy{
	int a;
	
	public void show() {
		System.out.println(a);
	}
	class Girl{
		int b;
		                                  //Class inside a class...
		public void show2() {
			System.out.println(b);
		}
	}
}
public class ClassinaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boy obj = new Boy();
		
		Boy.Girl obj2 = obj.new Girl(); // To access class inside another class
		Boy.Girl obj2 = new Boy.Girl(); // If class inside is static

	}

}
