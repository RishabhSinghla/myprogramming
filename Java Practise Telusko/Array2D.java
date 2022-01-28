
public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
			};
		
		for(int i=0; i<3; i++) //->>>>>>>>>>> This is for row (as there are 3 rows)
		{
			for(int j=0; j<4; j++)  //->>>>>>>>>>>> This if for column
			{
				System.out.print(d[i][j]);
			}
			System.out.println();
		}
		
		}
	}

