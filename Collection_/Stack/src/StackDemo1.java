import java.util.Collections;
import java.util.Stack;

public class StackDemo1 {
    public static void main(String[] args) {
        Stack<String> list = new Stack<>();
        list.push("Java");
        list.push("Python");
        list.push("C++");
        list.push("HTML");

        System.out.println(list.peek());
        System.out.println(list.pop());
        System.out.println(list);
    }
}
