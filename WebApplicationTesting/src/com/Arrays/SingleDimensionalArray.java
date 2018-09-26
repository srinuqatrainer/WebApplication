package com.Arrays;

public class SingleDimensionalArray {

	public static void main(String[] args)
	{
		/*int a=20;
		a=30;
		
		System.out.println(a);*/
		
		//dataType []ArrayName = new dataType[size];
		//dataType ArrayName[] = new dataType[size];
		
		int a[] = new int[4];
		// array index always starts with 0
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
				
		/*System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);*/
		
		// using For loop we are executing for every index of Array
		//for(int i=0;i<3;i++) //i is going to be - 0,1,2
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]); // a[0] then a[1] , then a[2]
		}
		
		
		

	}

}
