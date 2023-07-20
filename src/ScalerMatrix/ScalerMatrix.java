package ScalerMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class ScalerMatrix {
	
	public static void scaler(int[][] arr,int row,int col)
	{
		int[][] res = new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				res[i][j] = arr[i][j]*2;
			}
		}
		System.out.println(Arrays.deepToString(res));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int col = scan.nextInt();
		int[][] arr = new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j] = scan.nextInt();
			}
		}
		scaler(arr,row,col);

	}

}
