interface Operation {
    double PI = 3.142; // Constant PI

    double area();   // Method to calculate area
    double volume(); // Method to calculate volume
}

class Circle implements Operation {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius; // Area of a circle: π * r^2
    }

    @Override
    public double volume() {
        // Circles are 2D, so volume is not applicable; return 0.
        return 0;
    }

    public void display() {
        System.out.println("Circle with radius " + radius);
        System.out.println("Area: " + area());
        System.out.println("Volume: " + volume());
    }
}

public class MainCircle {
    public static void main(String[] args) {
        double circleRadius = 2.5;
        Circle circle = new Circle(circleRadius);
        circle.display();
    }
}

