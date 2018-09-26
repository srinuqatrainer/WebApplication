package com.Arrays;

public class ObjectArrayExample {

	public static void main(String[] args)
	{
		// An Object Array can store diffent dataType Values
		//Object []ArrayName = new Object[size];
		//Object ArrayName[] = new Object[size];
		
		Object a[] = new Object[3];
		
		a[0] = 10;
		a[1] = "Hello";
		a[2] = 10.123;
		
		// for each loop
		
		for(Object var:a)
		{
			System.out.println(var);
		}
		

	}

}
