import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbbreviateTwoWords {
	public static String abbrevName(String name) {
		char firstInitial = name.charAt(0);
		String [] splitString = name.split(" ");
		char secondInitial = splitString[1].charAt(0);
		firstInitial = Character.toUpperCase(firstInitial);
		secondInitial = Character.toUpperCase(secondInitial);
		return firstInitial + "." + secondInitial;
	    
	  }
	
	public static void main(String [] args) throws IOException
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String ime = bf.readLine();
		String inicijali;
		inicijali = abbrevName(ime);
		System.out.println(inicijali);
	}
}
