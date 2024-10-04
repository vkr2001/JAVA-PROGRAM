import java.util.*;

public class ColorLinkedList {
    public static void main(String[] args) {
        List<String> colorList = new LinkedList<>();
        
        // Adding colors to the list
        colorList.add("RED");
        colorList.add("BLUE");
        colorList.add("YELLOW");
        colorList.add("ORANGE");
        
        // Displaying the contents of the list using an Iterator
        System.out.println("Colors in the List:");
        Iterator<String> iterator = colorList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Displaying the contents of the list in reverse order using a ListIterator
        System.out.println("\nColors in Reverse Order:");
        ListIterator<String> listIterator = colorList.listIterator(colorList.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        
        // Create another list with new colors
        List<String> newColors = new LinkedList<>();
        newColors.add("PINK");
        newColors.add("GREEN");
        
        // Insert elements of newColors between "blue" and "yellow"
        ListIterator<String> listIterator2 = colorList.listIterator();
        while (listIterator2.hasNext()) {
            if (listIterator2.next().equals("BLUE")) {
                listIterator2.add(newColors.get(0));
                listIterator2.add(newColors.get(1));
            }
        }
        
        // Display the updated list
        System.out.println("\nUpdated List:");
        iterator = colorList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

