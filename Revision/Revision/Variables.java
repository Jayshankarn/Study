import java.util.*;

public class Variables {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int a = sc.nextInt();

        System.out.print("Enter your second number: ");
        int b = sc.nextInt();

        int sum = a + b;
        int diff = a - b;
        int mul = a * b;

        System.out.println("Your Sum is " + sum);
        System.out.println("Your Difference is " + diff);
        System.out.println("Your Multiplication is " + mul);

        if (b == 0) {
            System.out.println("Division and Remainder cannot be calculated because second number is 0.");
        } else {
            int div = a / b;
            int rem = a % b;

            System.out.println("Your Division is " + div);
            System.out.println("Your Remainder is " + rem);
        }

        sc.close();
    }
}