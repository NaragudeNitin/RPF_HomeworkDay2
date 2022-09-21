package Day2;

import java.util.Scanner;

public class ReverseNumFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to reverse");
		int num = sc.nextInt();
		int reverse=0;
		sc.close();
		for ( ; num!=0; num = num/10) {
			int remai=num%10;
			reverse=reverse*10+remai;
			num=num/10;
		}
		System.out.println("Reverse of num is: "+ reverse);
		
	}
}
