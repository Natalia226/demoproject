package beginner;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int total = 0;
		
		while (true) {
			System.out.println("Can you tell me a number?");
			String number = s.nextLine();
			int snumber = Integer.parseInt(number);
			total += snumber;
				if (snumber == 0) {
					
		System.out.println("Total: " + total);
			System.exit(0);
				}
		}
				
			

	}

}
