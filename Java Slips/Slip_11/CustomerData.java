import java.io.*;
import java.util.Scanner;

class Customer {
    private int c_id;
    private String cname;
    private String address;
    private long mobile_no;

    public Customer(int c_id, String cname, String address, long mobile_no) {
        this.c_id = c_id;
        this.cname = cname;
        this.address = address;
        this.mobile_no = mobile_no;
    }

    public int getC_id() {
        return c_id;
    }

    public String getCname() {
        return cname;
    }

    public String getAddress() {
        return address;
    }

    public long getMobile_no() {
        return mobile_no;
    }
}

public class CustomerData {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("customer_data.dat");
            DataOutputStream dos = new DataOutputStream(fos);

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of customers (n): ");
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println("Enter customer details for customer " + (i + 1) + ":");
                System.out.print("Customer ID: ");
                int c_id = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                System.out.print("Customer Name: ");
                String cname = scanner.nextLine();
                System.out.print("Address: ");
                String address = scanner.nextLine();
                System.out.print("Mobile Number: ");
                long mobile_no = scanner.nextLong();

                // Create a Customer object with the entered details
                Customer ct = new Customer(c_id, cname, address, mobile_no);

                // Write customer data to the file
                dos.writeInt(ct.getC_id());
                dos.writeUTF(ct.getCname());
                dos.writeUTF(ct.getAddress());
                dos.writeLong(ct.getMobile_no());
            }

            dos.close();
            fos.close();

            System.out.println("Customer data has been written to 'customer_data.dat' file.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

