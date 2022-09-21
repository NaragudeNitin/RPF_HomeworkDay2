package Day2;

import java.util.Scanner;

public class ForPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to reverse");
		int num = sc.nextInt();
		int C=num;
		int reverse=0;
		sc.close();
		for ( ; num != 0;num=num/10) {
			int remai=num%10;
			reverse=reverse*10+remai;
			
		}
		System.out.println("Reverse of num is: "+ reverse);
		if (reverse==C) {
			System.out.println("Number is palindrome Number.");
		}
		else {
			System.out.println("Number is not Palindrome.");
		}
		
	}
}
