import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("how many loops: ");
        int number = scanner.nextInt();

        for(int i = 1 ; i <= number ; i++ ) {
            System.out.println(i);

        }
        scanner.close();
    }
}
