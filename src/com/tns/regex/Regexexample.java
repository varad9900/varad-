package com.tns.regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regexexample 
{
	public static void main (String[]args)
	{
		// first way
		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("as");
		boolean b1=m.matches();
	    System.out.println(b1);
	    
	    //second way
	    boolean b2=Pattern.compile(".s").matcher("as").matches();
	    System.out.println(b2);
	    
	    //third way
	    boolean b3 = Pattern.matches(".s", "as");
	    System.out.println(b3);
	}
}
