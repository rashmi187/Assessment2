package mod11;
import java.util.*;

public class PrinterQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Doc1");
        queue.add("Doc2");
        queue.add("Doc3");

        while (!queue.isEmpty()) {
            System.out.println("Printing: " + queue.poll());
        }

        System.out.println("All documents printed");
    }
}