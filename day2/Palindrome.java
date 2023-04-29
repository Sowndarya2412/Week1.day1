package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int n = 34343;
		int temp = 0, rem ;
		int num = n;
		for (n = 34343; n>0; n=n/10) {
			rem = n%10;
			temp = temp*10 + rem;
			}
		if (num==temp) {
			System.out.println( num +" is a Palindrome");
		}else {
			System.out.println( num +" is not a Palindrome");
		}
		}
}
