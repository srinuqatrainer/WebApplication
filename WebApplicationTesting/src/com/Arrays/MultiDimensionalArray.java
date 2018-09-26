package com.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args)
	{
		// dataType [][]ArrayName = new dataType[size][size];
		// dataType ArrayName[][] = new dataType[size][size];
		
		String a[][] = new String[2][2];
		
		a[0][0] = "Gayatri";
		a[0][1] = "Hello";
		
		a[1][0] = "Mani";
		a[1][1] = "Hi";
		
		/*System.out.println(a[0][1]);
		System.out.println(a[1][1]);*/
		
		for(int i=0;i<2;i++) // All the Rows
		{
			for(int j=0;j<2;j++) // Of every Row this loop is going to ever column and get the data
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		

	}

}
