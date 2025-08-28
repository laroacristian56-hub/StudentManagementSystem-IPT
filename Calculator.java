import java.util.Scanner;

public class Calculator {
	public static void main(String [] args) {

		Scanner input = new Scanner(System.in);
		Scanner stringInput = new Scanner(System.in);

		boolean restart = false;
		String inputRestart;


		System.out.println("\t\t_____________");
		System.out.println("\t      ACTIVITY IN IPT 1");
		System.out.println("\t\t_____________\n\n");

		System.out.println("  ========================================");
		System.out.println("            • BASIC CALCULATOR •");
		System.out.println("  ========================================");

		do {

			int firstNumber, secondNumber, choice, answer;

			System.out.print("   Enter first number: ");

			firstNumber = input.nextInt();

			System.out.print("   Enter second number: ");
			secondNumber = input.nextInt();

			System.out.println("\nChoose operation: \n1 => Addition \n2 => Subtraction \n3 => Multiplication \n4 => Division");

			System.out.print("Enter your choice => ");
			choice = input.nextInt();

			switch (choice) {
			case 1:
				answer = firstNumber + secondNumber;
				System.out.print("\nAnswer: " + answer + "\n");
				break;
			case 2:
				answer = firstNumber - secondNumber;

				System.out.print("\nAnswer: " + answer + "\n");
				break;
			case 3:
				answer = firstNumber * secondNumber;

				System.out.print("\nAnswer: " + answer + "\n");
				break;
			case 4:
				answer = firstNumber / secondNumber;

				System.out.print("\nAnswer: " + answer + "\n");
				break;
			default:
				System.out.print("Error!");
			}

			System.out.println("\nDo you want to calculate again? ( y / n )");

			inputRestart = stringInput.nextLine();

			if (inputRestart.equals("y") || inputRestart.equals("Y")) {
				restart = true;

			} else {
				restart = false;
			}

		} while (restart);

	}

}