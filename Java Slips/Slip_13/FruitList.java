import java.util.LinkedList;
import java.util.Iterator;

public class FruitList {
    public static void main(String[] args) {
        // Step 1: Create a linked list
        LinkedList<String> fruitList = new LinkedList<>();

        // Step 2: Add the names of fruits to the linked list
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Guava");
        fruitList.add("Orange");

        // Step 3: Use an iterator to display the contents of the list
        Iterator<String> iterator = fruitList.iterator();
        System.out.println("Fruits in the list:");
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}

