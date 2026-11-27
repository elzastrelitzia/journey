import java.util.Scanner;

public class ifelse {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);


		System.out.print("input your name: ");
		String name = scanner.nextLine();

		System.out.print("input your age: ");
		int age = scanner.nextInt();
		
		if (name.isEmpty()) {
			System.out.println("dont you have a name lil bro?");
		} else {
			System.out.println("well, hello " + name);
		}

		// age 
		if (age >= 40) {
			System.out.println("dont you feel little bit old?");
		} else if (age >= 18) {
			System.out.println("you're an adult");

                } else if (age < 5) {
			System.out.println("you a baby?!");
		} else {
			System.out.println("you still a kid!");
		}

		scanner.close();

	}
}
