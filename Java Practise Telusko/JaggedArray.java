
public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d[][] = {
				{1,2,3,},
				{5,6,7,8,12},                             //>>>>>>>>>>>>when no of columns not fixed...that is called jagged array
				{9,10}
			};
		
		for(int i=0; i<d.length; i++) //->>>>>>>>>>> This is for row (as there are 3 rows) 
			//length calculates rows in array
		{
			for(int j=0; j<d[i].length; j++)  //->>>>>>>>>>>> This if for column
			{
				System.out.print(d[i][j]);
			}
			System.out.println();
		}
		
		}
	}

