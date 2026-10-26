import java.util.Collections;
import java.util.LinkedList;

public class SecondLargest {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        Collections.addAll(list, 10, 80, 50, 90, 40);

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : list) {

            if (num > largest) {

                secondLargest = largest;
                largest = num;

            } else if (num > secondLargest && num != largest) {

                secondLargest = num;
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);
    }
}