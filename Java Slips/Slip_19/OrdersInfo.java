import java.util.Scanner;

abstract class Order {
    protected int id;
    protected String description;

    public abstract void accept();
    public abstract void display();
}

class PurchaseOrder extends Order {
    private String customerName;

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Order ID: ");
        id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter Order Description: ");
        description = scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        customerName = scanner.nextLine();
    }

    public void display() {
        System.out.println("Order ID: " + id);
        System.out.println("Order Description: " + description);
        System.out.println("Customer Name: " + customerName);
    }
}

public class OrdersInfo {
    public static void main(String[] args) {
        PurchaseOrder[] orders = new PurchaseOrder[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Purchase Order " + (i + 1));
            orders[i] = new PurchaseOrder();
            orders[i].accept();
        }

        System.out.println("\nDisplaying Purchase Orders:");
        for (PurchaseOrder order : orders) {
            order.display();
            System.out.println();
        }
    }
}

