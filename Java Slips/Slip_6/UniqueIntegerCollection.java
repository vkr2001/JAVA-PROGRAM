import java.util.*;

public class UniqueIntegerCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> integerSet = new HashSet<>();
        
        System.out.print("Enter the number of integers (n): ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();
            integerSet.add(num);
        }
        
        // Convert the HashSet to a sorted list
        ArrayList<Integer> sortedList = new ArrayList<>(integerSet);
        Collections.sort(sortedList);
        
        System.out.println("Unique integers in sorted order:");
        for (int num : sortedList) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.print("Enter an integer to search for: ");
        int searchElement = scanner.nextInt();
        
        if (integerSet.contains(searchElement)) {
            System.out.println("The element " + searchElement + " is in the collection.");
        } else {
            System.out.println("The element " + searchElement + " is not in the collection.");
        }
        
        scanner.close();
    }
}

