package Day2;
import java.util.Scanner;
public class ReadSingDigNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number between 0 to 9");
		int num = sc.nextInt();
		System.out.println("You have Entered the digit " + num + ", and it is read as");
		if (num==0) {
			System.out.println("Zero");
		}
		else if (num==1) {
			System.out.println("One");
		}
		else if (num==2) {
			System.out.println("Two");
		}
		else if (num==3) {
			System.out.println("Three");
		}
		else if (num==4) {
			System.out.println("Four");
		}
		else if (num==5) {
			System.out.println("Five");
		}
		else if (num==6) {
			System.out.println("Six");
		}
		else if (num==7) {
			System.out.println("Seven");
		}
		else if (num==8) {
			System.out.println("Eight");
		}
		else if (num==9) {
			System.out.println("Nine");
		}
		else {
			System.out.println("Please Enter the number between 0-9");
		}
		sc.close();
	}
	
}
