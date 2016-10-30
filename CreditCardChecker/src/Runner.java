import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class Runner
	{
		public static void main(String[] args) throws FileNotFoundException
		{
			int correct = 0;
			long digit = 0;

			long totalEven = 0;
			long totalOdd = 0;
			long totalAll = 0;
	      Scanner file = new Scanner( new File( "CreditCardNumbers.txt" ) );
	      long correctNum = 5424180123456789L;
	      for(int i = 0; i< 100; i++)
	    	  {	    	
	    	  long creditCardNumber = file.nextLong();

	    	  for(int place = 0; place<16 ; place++)
	    	  {
	    		  if(place%2==1)
	    		  {
	    			  digit= creditCardNumber%10*2;

	    			  if(digit>9)
	    			  {

	    				  long digitOne = digit%10;
	    				  digit=digit/10;
	    				  long digitTwo= digit;
	    				  digit = digitOne+digitTwo;

	    			  }
	    			  else
	    			  {

	    				  digit = digit;

	    			  }
	    		  }
	    		  else
	    		  {
	    			  digit = creditCardNumber%10;
	    			  totalOdd = digit+totalOdd;
	    			  totalAll= totalOdd+totalEven;	  
	    		  }

	    	  }
	    		  if(totalAll%10 != 0)
	    		  {
	    			  
	    			  System.out.println(creditCardNumber+" is not a valid number");
	    		  }
	    		  else
	    		  {
	    			  correct++; 
	    			  System.out.println(creditCardNumber+" could be a valid number. #"+correct);
	    		  }
		}
	}
	}