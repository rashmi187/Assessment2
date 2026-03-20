package mod11;
import java.util.*;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Original: " + stack);

        Stack<Integer> temp = new Stack<>();

        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }

        System.out.println("Reversed: " + temp);
    }
}