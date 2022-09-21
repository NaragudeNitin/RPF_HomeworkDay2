package Day2;

import java.util.Scanner;

public class IfElseDisplay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers from 1,10,100,1000:");
		int num= sc.nextInt();
		if (num==1) {
			System.out.println("One/unit");
		}
		else if (num==10) {
			System.out.println("Ten");
		}
		else if (num==100) {
			System.out.println("Hundred");
		}
		else if (num==1000) {
			System.out.println("Thousand");
		}
		else {
			System.out.println("Please Enter the values mentioned above");
		}
		sc.close();
	}	
}
