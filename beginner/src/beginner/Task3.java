package beginner;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		System.out.println("Can you tell me one number?");
		
		Scanner s = new Scanner(System.in);
		String number = s.nextLine();
		
		System.out.println("Can you tell me another number?");
		String text = s.nextLine();
		Integer secondnumber = Integer.parseInt(text);
		Integer firstNumber = Integer.parseInt(number);
	
		
		Integer sum = secondnumber + firstNumber;
		
		System.out.println("Okay, the sum of these two numbers is " + sum);
	}

}
