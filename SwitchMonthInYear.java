package Day2;

import java.util.Scanner;

public class SwitchMonthInYear {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Month no.");
		int monthno =sc.nextInt();		
		
		switch(monthno) {
		case 1: 
			System.out.println(monthno + ". Januari");
		break;
		case 2: 
			System.out.println(monthno + ". February");
		break;
		case 3: 
			System.out.println(monthno + ". March");
		break;
		case 4: 
			System.out.println(monthno + ". April");
		break;
		case 5: 
			System.out.println(monthno + ". May");
		break;
		case 6: 
			System.out.println(monthno + ". June");
		break;
		case 7: 
			System.out.println(monthno + ". Jully");
		break;
		case 8: 
			System.out.println(monthno + ". August");
		break;
		case 9: 
			System.out.println(monthno + ". Septber");
		break;
		case 10: 
			System.out.println(monthno + ". October");
		break;
		case 11: 
			System.out.println(monthno + ". November");
		break;
		case 12: 
			System.out.println(monthno + ". December");
		break;
		default:
			System.out.println("Enter proper month number to show name");
			break;
		}
		sc.close();
		}	
}
