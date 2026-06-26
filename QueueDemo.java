import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(49);
        q.add (50);

        System.out.println("Queue: " + q);

        q.poll();

        System.out.println("Front: " + q.peek());

        System.out.println("Removed: " + q.poll());


        System.out.println("Queue After Remove: " + q);
        int size = q.size();
        System.out.println("Size of queue: " + size);

        int evenNum = 0;
        for (int element : q) {
            if (element % 2 == 0) {
                evenNum++;
            }
        }
        System.out.println("Number of even elements: " + evenNum);

        int search = (49);
        boolean found = q.contains(search);
        System.out.println("RCB Lowest score " + search + " found: " + found);
    }
}