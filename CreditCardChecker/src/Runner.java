import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class Runner
	{
		public static void main(String[] args) throws FileNotFoundException
		{
			int counter = 0;
			long digit = 0;
			long amountTwo = 0;
			long amountOne = 0;
			long total = 0;
			long creditCardNumber = 0;
			long totalEven = 0;
			long totalOdd = 0;
	      Scanner file = new Scanner( new File( "CreditCardNumbers.txt" ) );
	      long correctNum = 5424180123456789L;
	      for(int i = 0; i< 100; i++)
	    	  {	    	
	    	  creditCardNumber = file.nextLong();
	    	  long number = 0;
	    	  for(int place = 0; place<16 ; place++)
	    	  {
	    		  if(place%2==1)
	    		  {
	    			  digit= creditCardNumber%10*2;
	    			  if(digit>9)
	    			  {
	    				  // if there is more than one digit in the double
	    				  amountOne = digit%10;
	    				  digit=digit/10;
	    				  amountTwo= digit;
	    				  totalEven = totalEven+ amountOne+amountTwo;
	    				  creditCardNumber= creditCardNumber/10;
	    			  }
	    			  else
	    			  {
	    				  //if there is not more than one digit in the double
	    				  total = total+digit;
	    				  creditCardNumber = creditCardNumber /10;
	    			  }
	    		  }
	    		  else
	    		  {
	    			  total = digit
	    			  totalAll= total+creditCardNumber/10;
	    			  creditCardNumber= creditCardNumber/10;
	    		  }
//	    		  if(total%10 == 0)
//	    		  {
//	    			  counter++;
//	    			  System.out.println("possible Credit card Number #"+counter);
//	    		  }
//	    		  else
//	    		  {
//	    			  System.out.println("Not a valid number");
//	    		  }
	    		  if(total%10 != 0)
	    		  {
	    			  
	    			  System.out.println("not a valid number");
	    		  }
	    		  else
	    		  {
	    			  counter++; 
	    			  System.out.println("This could be a valid number   "+counter);
	    		  }
	    	  }
		}
	}
	}