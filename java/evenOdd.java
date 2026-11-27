/* Task: Even or odd + sum of array

Teacher: Claude
Write a program that:
1. Creates an int array: `{4, 7, 12, 9, 20, 3}`
2. Uses a loop to go through each number and prints `4 is even` or `7 is odd`, one per line.
3. After the loop, prints the total sum of all numbers.

Expected output:
4 is even
7 is odd
12 is even
9 is odd
20 is even
3 is odd
Sum: 55

Hints: use a `for` loop with `arr.length`, `%` (modulo) to check even/odd, and a separate `int sum` variable that you add to inside the loop.*/
public class evenOdd {

    public static void main(String[] args) {

        int[] arr = {4, 7, 12, 9, 20, 3};
        int sum = 0;

        for(int i = 0 ; i < arr.length ;  i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " is even");
            } else {
                System.out.println(arr[i] + " is odd");
            }

            sum += arr[i];
        }

        System.out.println("Sum: " + sum);
    }
}
