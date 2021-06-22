/**
 * @author PRATHAMESH TIBILE
 * @since 14-6-21
 * To get the prime number using for loop
 */


package Day6_logical;

import java.util.Scanner;

public class Prime_Number {
	public static void main(String[] args) {
		int num = 0;

		boolean flag = false;
		System.out.println("Enter your number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
			for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
			{
				flag = true;
				break;
			}
			
			}
			if (!flag)
				System.out.println("Prime number is " + num);
			else
				System.out.println( num + " its a not prime number");
}
}