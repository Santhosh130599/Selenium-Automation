package CoreJava_Concept_To_Start_Selenium;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class String_Concept {
	
	public static void main(String[] args)
	{
	
	/*String is an Object
	 * here we can create the String by Two ways,
	 * i) String Literal
	 * ii) Using new Memory Allocate
	 */
	
	// String Literal
	
	String S = "Santhosh Sandy Java";
	String S1 = "Santhosh Sandy Java";
	
	String S2 = "Santhosh Sandy";
	
	/*Here Above is the String Literal , S, &S1 will not create the Separate MEmory Allocation , It will allocate a Single menory only beacuse
	 * S & S1 both are same value is there , but in S2 it will create the Separate Memory allocation. This is the oneway of String we can Assign */
	
	//  Using new Memory Allocate
	
	String S3 = new String ("Santhosh Sandy Java");
	String S4 = new String ("Santhosh Sandy Java");
	
	/*Here Above is the String , S3, &S4 will create the Separate MEmory Allocation , It will allocate a two memory beacuse
	 * S3 & S4 Are create by using object*/
	
	// Examples//
	
	String S5 = new String( "Santhosh Sandy Java");
	
	String[] Split = S5.split(" "); // Here we need to use the Array then only for that String what are the methods available that we can able to Access//
	
	System.out.println(Split[0]);
	System.out.println(Split[1]);
	System.out.println(Split[2]);
	
	// By String to char by Straight method using//
	
	for (int i = 0; i<S5.length();i++)
	{
		System.out.println(S5.charAt(i));
	}
	
	// By String to char by Reverse method using//
	
	for (int i=S5.length()-1;i>=0;i--)
	{
		System.out.println(S5.charAt(i));
	}
		

	
	// Now we need to trim the Space means we can use the Trim method which present inside the String Class//
	
	String S6 = new String( "Nivesh Kumar Java");
	String[] Split1 = S6.split("Kumar");
	System.out.println(Split1[0]);
	System.out.println(Split1[1]);
	System.out.println(Split1[1].trim());
	
	//Length of the string//
	
	String sc = new String("Salai Sanjeevi");
	int len = sc.length();
	System.out.println("Length of the String is :"+ len);
	
		
	String Name = new String ("Salai Sanjeevi");
	for (int i = 0 ; i<Name.length();i++)
	{
		System.out.println(Name.charAt(i));
	}
	}
}
