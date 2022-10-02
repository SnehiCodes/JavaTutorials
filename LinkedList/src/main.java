import java.util.LinkedList;

public class main {
    public static void main(String[] args){

        LinkedList<String> linkedlist = new LinkedList<String>();

        // Linkedlist as a stack
        // linkedlist.push("A");
        //linkedlist.push("B");
        //linkedlist.push("C");
        //linkedlist.push("D");
        //linkedlist.push("F");

        //linkedlist.pop();


        // Linkedlist as a queue
        linkedlist.offer("A");
        linkedlist.offer("B");
        linkedlist.offer("C");
        linkedlist.offer("D");
        linkedlist.offer("F");
        //linkedlist.poll();

        linkedlist.add(4,"E");
        linkedlist.remove("E");

        System.out.println(linkedlist.indexOf("F"));



        System.out.println(linkedlist.peekFirst());
        System.out.println(linkedlist.peekLast());

        System.out.println(linkedlist);

        linkedlist.addFirst("0");
        linkedlist.addLast("G");

        String first = linkedlist.removeFirst();
        String last = linkedlist.removeLast();

        System.out.println(linkedlist);
    }}