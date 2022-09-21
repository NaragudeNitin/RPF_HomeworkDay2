package Day2;

import java.util.Scanner;

public class SpringSeason {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month first: ");
		int m= sc.nextInt();
		System.out.println("now enter day: ");
		int d= sc.nextInt();
		
		if ((m<=6 && d<=20) && d>=1 && (m>=3 && d>=20) && d<=31) {
			System.out.println("True");
		}
		else {
			System.out.println("false");
		}
		sc.close();
	}
}
