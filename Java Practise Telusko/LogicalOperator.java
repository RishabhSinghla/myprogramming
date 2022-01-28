public class LogicalOperator {
	public static void main(String[] args) {
		//Integer bitwise logical operator
		int a = 65; // binary representation 1000001
		int b = 33; // binary representation 0100001
		System.out.println("a & b= " + (a & b));
		System.out.println("a | b= " + (a | b));
		System.out.println("a ^ b= " + (a ^ b));
		System.out.println("~a= " + ~a);
		//boolean logical operator
		boolean bool1 = true;
		boolean bool2 = true;
		boolean bool3 = false;
		System.out.println("bool1 & bool2= " + (bool1 & bool2));
		System.out.println("bool2 & bool3= " + (bool2 | bool3));
		System.out.println("bool2 | bool3= " + (bool2 | bool3));
		System.out.println("bool1 ^ bool2= " + (bool1 ^ bool2));
		System.out.println("!bool1= " + !bool1);
	}

}
