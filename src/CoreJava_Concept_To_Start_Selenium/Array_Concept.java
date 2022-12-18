package CoreJava_Concept_To_Start_Selenium;

public class Array_Concept {

	public static void main(String[] args) {
		
		
		//Array values storing//
		
		// Array is used to store the Multiple Values at single variable//
		
		int [] a1 = new int[4];
		
		a1[0] = 10;
		a1[1] = 20;
		a1 [2] = 30;
		a1 [3] = 40;
		
		int[] arr = {10,20,30,40,50,60};
		
		//to print all the values we can use loop //
		
		for (int i = 0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
		
		for (int i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		// String of Arrays Concepts//
		
		String [] Names = new String[5];
		Names[0] = "Sathya";
		Names[1] = "Jeevana";
		Names[2] = "Sanjeevi";
		Names[3] = "Jayakumar";
		Names[4] = "Padmavathi";
		
		for (int j = 0 ; j < Names.length; j++)
		{
			System.out.println(Names[j]);
		}
		
		String[] name = {"Santhosh","Niveshkumar","Reeta","Selvam"};
		
		// Straight//
		
		for (int j = 0 ; j < name.length; j++)
		{
			System.out.println(name[j]);
		}
		
		// reverse//
		
		for(int i = name.length-1; i>=0;i--)
		{
			System.out.println(name[i]);
		}
		
		// enhanced for loops//
		
		String[] Place = {"Vellore","Chennai","Bangalore","Mumbai","Lucknow"};
		
		for(String s:Place)
		{
			System.out.println(s);
		}
		
		/* Explanation of enhanced for loop:
		
		first store the Array values in one variable and create one loop for print all the values,
		so in loop first we need to provide the Array stored variable and then we need to provide Semicolumn of left side and then check whether the 
		values are in integer or String or character , According to that put the data type and near to that but any one variable . Which means, 
		Place variables what are the data having that are stored in S variable and printing all the values for each time. */
		
	}

}
