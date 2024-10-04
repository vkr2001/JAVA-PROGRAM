/* Write a program to accept ‘n’ integers from the user & store them in an Array List collection. 
Display the elements of Array List.*/

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of integers (n): ");
        int n = scanner.nextInt();
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            arrayList.add(num);
        }
        
        System.out.println("Elements in the ArrayList:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        
        scanner.close();
    }
}

