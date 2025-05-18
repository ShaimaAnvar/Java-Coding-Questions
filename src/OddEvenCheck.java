import java.util.Scanner;
public class OddEvenCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input

        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); // Read an integer from the user

        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }
        scanner.close(); // Close the scanner
    }
}
