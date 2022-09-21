package Day2;

import java.util.Scanner;

public class WhileSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the values upto Which you want sum");
		int num = sc.nextInt();
		int i=1, sum=0;
		while (i<=num) {
			sum = sum+i;
			i++;
			System.out.println(sum);
		}
//		System.out.println(sum);
		sc.close();
	}
}
