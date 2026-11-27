import java.util.Scanner;

public class array {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("which gun do you want?");
		System.out.println("i only have these AR's:");
		System.out.println("");
		String[] guns = {"ak47", "m416", "m249", "scar-l"};

		for(int i = 0; i < guns.length; i++) {
			System.out.println((i + 1) + ". " + guns[i] + " ");
		}

		System.out.println("");
		System.out.print("pick your gun: ");
		int choice = scanner.nextInt();

		System.out.println("");
		if (choice >= 1 && choice <= guns.length) {
			System.out.println("you chose: " + guns[choice -1]);
		}

		System.out.println("");
		System.out.println("Have a nice day!");

		/* for(String gun : guns) {
			System.out.println(gun + " ");
		} */

		scanner.close();
		System.out.println("");
	}
}
