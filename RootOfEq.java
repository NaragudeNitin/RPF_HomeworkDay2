package Day2;

import java.util.Scanner;

public class RootOfEq {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		double a = sc.nextDouble();
		System.out.println("Enter b: ");
		double b= sc.nextDouble();
		System.out.println("Enter c: ");
		double c = sc.nextDouble();
		
		//roots of equation are x1 and x2
		double delta,x1,x2;
		delta= b*b-4.0*a*c;
		
		if (delta>0) {
			x1=(-b+Math.sqrt(delta))/(2*a);
			x2=(-b-Math.sqrt(delta))/(2*a);
			System.out.println("root1= "+ x1 +" & root2= "+x2);
		}
		else if(delta==0) {
			x1=x2=-b/(2*a);
			System.out.println("root1= "+ x1 +" & root2= "+x2);
		}
		else {
			System.out.println("Roots are imaginary");
		}
		sc.close();
	}
}
