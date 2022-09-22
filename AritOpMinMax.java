package Day2;

import java.util.Scanner;

public class AritOpMinMax {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter the Value of b: ");
		int b = sc.nextInt();
		System.out.println("Enter the Value of c: ");
		int c = sc.nextInt();
		int eq1=a+b*c;
		int eq2=c+a/b;
		int eq3=a%b+c;
		int eq4=a*b+c;
		
		if(eq1>eq2 && eq1>eq3 && eq1>eq4) {
			System.out.println(eq1 + " is maximum value than other equation value");
		}
		else if(eq2>eq1 && eq2>eq3 && eq2>eq4) {
			System.out.println(eq2 + " is maximum value than other equation value");
		}
		else if(eq3>eq1 && eq3>eq2 && eq3>eq4) {
			System.out.println(eq3 + " is maximum value than other equation value");
		}
		else if(eq4>eq1 && eq4>eq3 && eq4>eq2) {
			System.out.println(eq4 + " is maximum value than other equation value");
		}
		
		if(eq1<eq2 && eq1<eq3 && eq1<eq4) {
			System.out.println(eq1 + " has minimum value than other equations");
		}
		else if(eq2<eq1 && eq2<eq3 && eq2<eq4) {
			System.out.println(eq2 + " has minimum value than other equations");
		}
		else if(eq3<eq1 && eq3<eq2 && eq3<eq4) {
			System.out.println(eq3 + " has minimum value than other equations");
		}
		else if(eq4<eq1 && eq4<eq3 && eq4<eq2) {
			System.out.println(eq4 + " has minimum value than other equations");
		}
		sc.close();
	}
}
