import java.util.Scanner;

public class userInput {
	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
    		
		boolean isItTrue = false;


	while (!isItTrue) {

		System.out.println("");
		System.out.print("Who is this? ");
		String name = scanner.nextLine();

		System.out.print("how old are you? ");
		int age = scanner.nextInt();
		scanner.nextLine();
						
		System.out.print("where do you live? ");
		String live = scanner.nextLine();
		

		System.out.println("");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Home: " + live);
		
		System.out.print("is that correct? ");
		String validate = scanner.nextLine();

		System.out.println("");

		if (validate.equalsIgnoreCase("yes")) {
			System.out.println("Have a good day!");
			isItTrue = true;
		} else { 
			System.out.println("Try again");	
		}
	}

		scanner.close();
	
	}
}
