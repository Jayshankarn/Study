import java.util.LinkedList;
import java.util.Scanner;

public class DeleteGreaterthan25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();


        System.out.print("How many numbers do you want to enter? ");
        int n = sc.nextInt();

        

        // Taking input
        for (int i = 0; i <=n; i++) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            if (num >= 1 && num <= 50) {
                list.add(num);
            } else {
                System.out.println("Enter numbers between 1 and 50 only.");
                i--; // repeat this iteration
            }
        }

        // Delete elements greater than 25
        list.removeIf(num -> num > 25);

        System.out.println("Updated Linked List: " + list);

        sc.close();
    }
}