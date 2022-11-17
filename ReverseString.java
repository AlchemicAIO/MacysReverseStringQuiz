package reverseString;

import java.util.*;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			System.out.print("Input a string with 5-25 characters: ");
			String string = sc.nextLine();

			try {

				if (string.length() < 5 || string.length() > 25) {
					throw new Exception("String length should be between 5-25");
				}

				String rev = "";
				for (int i = string.length() - 1; i >= 0; i--) {
					rev += string.charAt(i);
				}

				System.out.println("Reverse String: " + rev);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			System.out.print("Do you want to reverse again (y/n)? ");
			choice = sc.nextLine();
			System.out.println("");
		}

	}
}
