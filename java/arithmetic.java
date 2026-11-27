import java.util.Scanner;
public class arithmetic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("input first number: ");
		int firstNumber = scanner.nextInt();

		System.out.print("input second number: ");
		int secondNumber = scanner.nextInt();

		int addition = firstNumber + secondNumber;
		int subtraction = firstNumber - secondNumber;
		int multiplication = firstNumber * secondNumber;
		int division = firstNumber / secondNumber;
		int modulus = firstNumber % secondNumber;

		scanner.close();
		System.out.println("");
		System.out.println(firstNumber + "+" + secondNumber + "=" + addition);
		System.out.println(firstNumber + "-" + secondNumber + "=" + subtraction);
		System.out.println(firstNumber + "x" + secondNumber + "=" + multiplication);
		System.out.println(firstNumber + "/" + secondNumber + "=" + division);
		System.out.println(firstNumber + "%" + secondNumber + "=" + modulus);
		System.out.println("");
	}
}
