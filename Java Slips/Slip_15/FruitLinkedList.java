import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class FruitLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList of Fruits
        List<String> fList = new LinkedList<>();
        fList.add("Apple");
        fList.add("Banana");
        fList.add("Guava");
        fList.add("Orange");

        // Display the contents of the List in reverse order
        ListIterator<String> lit = fList.listIterator(fList.size());
        
        System.out.println("Fruits in reverse order:");
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }
    }
}

