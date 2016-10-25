
import java.util.Scanner;
import java.io.*;
public class Runner
	{
		public static void main(String[] args)throws IOException
		{
	      Scanner file = new Scanner( new File( "CreditCardNumbers.txt" ) );
	      long num = file.nextLong();
	      long correctNum = 5424180123456789L;
	      long total = 0;
	      for(int i = 0; i< 100; i++)
	    	  {	    		  
	    		  long digit = num % 10;
	    		  num = num / 10;
	    		  total = 0+num;
	    		  if(num.length = 1)
	    			  {
	    				  num = num;
	    			  }
	    		  if(num.length>1)
	    			  {
	    				  
	    			  }
	    	  }
		}
	}