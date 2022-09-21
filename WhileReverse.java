package Day2;

import java.util.Scanner;

public class WhileReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int reverse=0;
		while (num !=0) {
			int remai=num%10;
			reverse=reverse*10+remai;
			num=num/10;
		}
		System.out.println("The reverse of given no is: "+ reverse);
		sc.close();
	}
}
