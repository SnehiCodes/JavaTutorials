
import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args){

        // Queue         =  FIFO data structure ; First In First Out
        //                  A collection designed for holding elements prior to processing
        //                  Linear data structure
        //
        //                  add = enqueue , offer()
        //                  remove = dequeue , poll()

        Queue<String> queue = new LinkedList<String>();

        System.out.println(queue.isEmpty());

        queue.offer("Rahul");
        queue.offer("Priyanka");

        System.out.println(queue.size());

        queue.offer("Snehi");
        queue.offer("Vedant");
        queue.offer("Coco");

        System.out.println(queue.peek());

        System.out.println(queue.isEmpty());

        System.out.println(queue.contains("Rahul"));

        queue.poll();
        queue.poll();

        System.out.println(queue.contains("Rahul"));

        System.out.println(queue.peek());

        System.out.println(queue);

        // Where are queues used ?

        //  1. Keyboard Buffer (letters should appear on the screen in the order they are pressed .)
        //  2. Printer Queue  (Print jobs should be completed in order)
        //  3. Used in linkedLists , PriorityQueues, Breadth-first searches .
        //
        //



    }
}
