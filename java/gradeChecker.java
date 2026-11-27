import java.util.Scanner;

public class gradeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = "Grade: ";
        System.out.print("Input your score: ");
        int score = scanner.nextInt();

        if (score  < 0 || score > 100) {
            System.out.println("Invalid score");
        } else if (score >= 90) {
            System.out.println(message + "A");
        } else if (score >= 80) {
            System.out.println(message + "B");
        } else if (score >= 70) {
            System.out.println(message + "C");
        } else {
            System.out.println(message + "D");
        }

        scanner.close();
    }
}
