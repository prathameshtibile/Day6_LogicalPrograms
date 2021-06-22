/**
 * @author PRATHAMESH TIBILE
 * @since 14-6-21
 * To reverse the number using while loop
 */

package Day6_logical;

import java.util.Scanner;

public class Reverse_number {
	public static void main(String[] args) {
		int num = 0;
		int reverseNum = 0;
		System.out.println("Enter your number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
			
			while ( num != 0 )
			{
				reverseNum  = reverseNum * 10;
				reverseNum  = reverseNum  + num%10;
				num = num/10;
			}
			System.out.println("Reverse number is: " + reverseNum );
	}

}
