import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] pd = new Product[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Product " + (i + 1) + " details:");

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine(); // Consume the newline character

            pd[i] = new Product(id, name, price);
        }

        Product minPrice = pd[0]; 

        for (int i = 1; i < pd.length; i++) {
            if (pd[i].price < minPrice.price) { 
                minPrice = pd[i];
            }
        }

        System.out.println("Product with Minimum Price: " + minPrice.name);
        sc.close();
    }
}

