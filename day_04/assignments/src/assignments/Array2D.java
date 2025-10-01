/*
8.Addition , Substraction and Multiplication of 2D Array.
9. Transpose of an Array.
10. Matrix Boundry Traversing.
11. Sprial Matrix Traversing 
12. Find median of matrix.
13. Print even and odd from 2D Array.
*/


package assignments;

public class Array2D {
	
	int[][] a1;
	int[][] a2;
	int[][] res;
	
	public Array2D(int[][] a1, int[][] a2, int[][] res)
	{
		this.a1 = a1;
		this.a2 = a2;
		this.res = res;\
	}
	
	// addition of 2 matrix
	public int[][] addition(int[][] a1, int[][]a2, int[][] res)
	{
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				res[i][j] = a1[i][j] + a2[i][j];
			}
		}
		return res;
	}
	
	// Subtraction of 2 matrix
	public int[][] subtraction(int[][] a1, int[][]a2, int[][] res)
	{
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				res[i][j] = a1[i][j] - a2[i][j];
			}
		}
		return res;
	}
	
	// multiplication of 2 matrix
	public int[][] multiplication(int[][] a1, int[][] a2, int[][] res)
	{
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				for(int k=0; k<3; k++)
				{
					res[i][j] += a1[i][j] * a2[k][i] ;
				}
			}
		}
		return res;
	}
	
	// transpose of matrix
	
	public int[][] transpose(int[][] a, int[][] res)
	{
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				for(int k=0; k<3; k++)
				{
					
				}
			}
		}
		return res;
	}
	
	public void desplay(int[][] r)
	{
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(r[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int[][] a1 = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] a2 = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] res = new int[3][3];
		
		Array2D obj = new Array2D( a1, a2, res);
		
		System.out.println("Addtion");
		obj.addition(a1, a2, res);
		obj.desplay(res);
		
		System.out.println("\nsubtraction");
		obj.subtraction(a1, a2, res);
		obj.desplay(res);
		
		System.out.println("\nmultiplication");
		obj.multiplication(a1, a2, res);
		obj.desplay(res);
	}

}
