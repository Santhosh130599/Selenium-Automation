package CoreJava_Concept_To_Start_Selenium;

import java.util.ArrayList;

public class Count_Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// Add the list of Names and Get the Count which Name started as alphabets A//
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Avinesh");
		names.add("Abhishek");
		names.add("Santhosh");
		names.add("Selvam");
		names.add("Abhinaya");
		names.add("Ameer");
		
		int count=0;
		
		for (int i=0; i<names.size();i++)
		{
			String SingleName = names.get(i);
			
			if(SingleName.startsWith("A"))
			{
				// we want count so declare the variable and use it...//
				
				count++;
			}
		}
		
		System.out.println("Count of Stored Name Starts with 'A' is " +count);

	}

}
