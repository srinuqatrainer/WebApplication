package com.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		//List<dataType>ArrayName = new ArrayList<>();
		
		List<String>a = new ArrayList<>();
		
		a.add("Selenium"); // a - index(0) - Selenium
		a.add("LoadRunner");
		a.add("QTP");
		a.add("10");
		
		for(int i=0;i<a.size();i++)
		{
			String data=a.get(i);
			System.out.println(data);
		}
		
		

	}

}
