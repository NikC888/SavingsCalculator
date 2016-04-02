import java.util.*;

/**
 *   File Name: SavingsCalculator.java<br>
 *
 *   Cui, Nicolas<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 30, 2016
 *
 */
/**
 * SavingsCalculator //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Cui, Nicolas
 * @version 1.0.0
 * @since 1.0
 */
// Let the user know what the balance would be at the end of each year, for the
// total of years requested (ex: 10).
public class SavingsCalculator {

	static double initialAmount, depositAmount, compoundInterestPercent, termInYears;

	static Scanner scanner = new Scanner(System.in);

	static String username;

	public static void main(String[] args) {
		welcomeUserToApp();
		do {
			requestUserInformation();
			calculatePaymentInfo();
			returnInfo();
			System.out.println("\nWould you like to find out the savings amount of a different account?");
		} while (requestToContinue());
		exit();
	}

	/**
	 *
	 */
	private static void calculatePaymentInfo() {
		// TODO Auto-generated method stub
		System.out.println("suppose to be calculations here");
	}

	private static void exit() {
		System.out.println("Goodbye " + username + ", thank you for using the Savings Calculator!");
		scanner.close();
		// Exit the application.
		System.exit(0);
	}

	private static boolean requestToContinue() {
		while (true) {
			// Ask the user if they would like to find out the mortgage of
			// another home and if not, exit.
			String input = scanner.nextLine();
			if (input.equalsIgnoreCase("No") || input.equalsIgnoreCase("N"))
				return false;
			else if (input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("Y"))
				return true;
			else {
				System.out.println("Invalid option (" + input + "), please use Yes/Y or No/n");
			}
		}
	}

	private static void requestUserInformation() {
		String input;
		System.out.print("What is your Initial Amount? ");
		input = scanner.nextLine();
		initialAmount = Double.parseDouble(input);
		System.out.print("What is your Monthly Set Payment? ");
		input = scanner.nextLine();
		depositAmount = Double.parseDouble(input);
		System.out.print("What is your Interest Rate? ");
		input = scanner.nextLine();
		compoundInterestPercent = Double.parseDouble(input);
		System.out.print("what is your Term in Years? ");
		input = scanner.nextLine();
		termInYears = Double.parseDouble(input);
	}

	private static void returnInfo() {
		System.out.println(
				"Based on your input values, it seems you will have the following in your savings account within the next "
						+ termInYears + " years:\n");
		for (double i = 0, j = 1; i < termInYears; i++, j++) {
			System.out.println("Year " + (int) j + ") $");
		}
	}

	private static void welcomeUserToApp() {
		System.out.println("Welcome to NC Savings Calculator App :D");
		System.out.print("Could I please get your name? ");
		username = scanner.nextLine();
	}
}
