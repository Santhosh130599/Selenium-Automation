package CoreJava_Concept_To_Start_Selenium;

public class Conditional_Statements {

	public static void main(String[] args) {
		
		
		int [] value = {10,20,30,35,40,45,77};
		
		/* Now I want all the numbers to print in variable of value So , I will use for loop to print all the numbers in the Value array */
		
		for(int i = 0 ; i<value.length ; i++)
		{
			System.out.println(value[i]);
		}
		
		/* Now I want value variable multiple of 2 only i want , which means what are the vales present in the Value variable scan all the value and take
		 * only the multiple 0f 2 , So I will use for loop and if conditional statements  */
		
		for (int j = 0; j<value.length; j++)
		{
			if (value[j] % 2 == 0)
			{
				System.out.println(value[j]);
			}
			
			else
			{
				System.out.println(value[j] +"is not multiple of 2.");
			}
		}
		
		/* Now I want when first number of multiple 2 comes means I need to stop the loop */
		
		for (int j = 0; j<value.length; j++)
		{
			if (value[j] % 2 == 0)
			{
				System.out.println(value[j]);
				break;
			}
			
			else
			{
				System.out.println(value[j] +"is not multiple of 2.");
			}
		}
		

	}

	
}
