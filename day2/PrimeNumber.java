package week1.day2;

public class PrimeNumber {

public static void main(String args[])
{    
	int num=19;
	boolean flag = true;
	
	for (int i = 2; i < num/2; i++)
	{
	System.out.println(i);	
		if (num %  i==0) {
			flag=false;
			break;
			
		} 
	}
		if(flag) {
			System.out.println(num+"  is prime");
			
			
		}
		
		else {
			System.out.println(num+"  is not a prime number");
		}
    }

   } 
		