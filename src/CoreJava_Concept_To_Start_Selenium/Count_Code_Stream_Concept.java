package CoreJava_Concept_To_Start_Selenium;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Count_Code_Stream_Concept {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Add the list of Names and Get the Count which Name started as alphabets A//

		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Avinesh");
		names.add("Abhishek");
		names.add("Santhosh");
		names.add("Selvam");
		names.add("Abhinaya");
		names.add("Ameer");
		
		Long Result = names.stream().filter(res -> res.startsWith("A")).count();
		
		System.out.println(Result);
		
		//Concept//
		
		/*
		 * here we stored all the names in 'names' variable after stored 
		 * That names Variable we converting to the stream 
		 * After converting to the Stream what we need , we need Name starts with A , so We using the Filter Method here
		 * This Filter Method called Intermediate stream
		 * In that Filter method we using the Lambda Expression ---> Operator is'->'
		 * First create one variable and use Lambda operator and put condition
		 * At last we use Actual what we want count , so Count method is using here..
		 * This Count Method called as the terminate stream..
		 * This count method return type is 'Long' Store it in one varibale and print it in OP
		 * */
		
		
		//Another way Write this program by using Stream concept is...//
		
		Stream.of("Santhosh","Selvam","Sandy","Reeta","NiveshKumar").forEach(S->System.out.println(S));
		
		//Just want 5 letter names want to print 
		
	Stream.of("Santhosh","Selvam","Sandy","Reeta","NiveshKumar").filter(A->A.length()>5).forEach(A->System.out.println(A));
		
	}

}
