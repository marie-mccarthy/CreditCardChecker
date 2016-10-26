
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class Runner
	{
		public static void main(String[] args)throws IOException
		{
	      Scanner file = new Scanner( new File( "CreditCardNumbers.txt" ) );
	//      long num = file.nextLong();
	      long correctNum = 5424180123456789L;
	      long evenTotal = 0;
	      long oddTotal = 0;
	      long [] digits = new long [16];
	      for(int i = 0; i< 100; i++)
	    	  {	    		  
	    		  long digit = correctNum % 10;
	    		  correctNum = correctNum / 10;
	    //		  total = 0+digit;
	    		  digits [i] =digit;
//	    		  if(i == 2||i == 4 || i == 8 ||i == 10|| i == 12||i == 16 )
//	    			  {
//	    				  digit.set(digit*2)
//	    			  }
	    		  if(digits[i]%2!==1)
	    			  {
	    				  digit = digit*2;
	    				  evenTotal = digit+evenTotal;
	    			  }
	    		  
//	    		  if(num.length() = 1)
//	    			  {
//	    				  num = num;
//	    			  }
//	    		  if(num.length>1)
//	    			  {
//	    				  
//	    			  }
	    	  }
//	    		  for(long a : digits)
//	    			  {
//	    				  System.out.println(a+" ");
//	    			  }
	    	  }
		}
	}