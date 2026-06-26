import java.util.*;

public class StackDemo{

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(50);
        stack.push(3);
        stack.push(30);

        System.out.println("Stack elements: " + stack);

        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);

        int peekedElement = stack.peek();
        System.out.println("Peeked element: " + peekedElement);
        int size = stack.size();
        System.out.println("Size of stack: " + size);
        int searchElement = 50;
        int search = stack.search(searchElement);
        System.out.println("Position of " + searchElement + ": " + search);
        int findlargest = Collections.max(stack);
        System.out.println("Largest element: " + findlargest);
        int findsmallest = Collections.min(stack);
        System.out.println("Smallest element: " + findsmallest);
        double sum = stack.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of elements: " + sum);
        Collections.reverse(stack);
        System.out.println("Stack after reverse: " + stack);
        
      
    }
}