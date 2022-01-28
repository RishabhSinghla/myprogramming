
public class EnchancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d[]= {1,2,3,4};
		
		for(int g : d)
		{
			System.out.print(g);
		}   //-------------------------------------->> Enhanced for loop for 1D Array
		
		

		int e[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
			};
		
		for(int g[] : e)
		{
			for(int h : g)
			{
				System.out.print(h);
			}
			System.out.println();
		}
		
		//-------------------------------------->> Enhanced for loop for 2D Array
		
		}
	}

