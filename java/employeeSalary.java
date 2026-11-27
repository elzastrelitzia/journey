import java.util.Scanner;

public class employeeSalary {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] salary = {5000000, 6500000, 9500000};

        System.out.print("Group A/B/C: ");
        char group = Character.toUpperCase(in.next().charAt(0));


        int index = group - 'A';
        if (index >= 0 && index < salary.length) {
            System.out.print("Overtime hours: ");
            int hours = in.nextInt();

            int base = salary[index];
            int overtime = hours * 100000;
            int total = base + overtime;

            System.out.println("base salary: Rp " + base);
            System.out.println("overtime pay: Rp " + overtime);
            System.out.println("total salary: Rp " + total);
        } else {
            System.out.println("Invalid group");
        }

        in.close();
    }
}

/* if else
if (group == 'A') {
    System.out.println("Grade: A");
    System.out.println("Your Salary is: " + salary[0]);
} else if (group == 'B') {
    System.out.println("Grade: B");
    System.out.println("Your Salary is: " + salary[1]);
} else if (group == 'C') {
    System.out.println("Grade: C");
    System.out.println("Your Salary is: " + salary[2]);
} else {
    System.out.println("Invalid grade ");
}
*/
