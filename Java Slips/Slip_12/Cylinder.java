// Define the abstract class Shape
abstract class Shape {
    public abstract double area();
    public abstract double volume();
}

// Define the Cylinder class that extends Shape
class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Implement the area method for Cylinder
    @Override
    public double area() {
        // Calculate the surface area of the cylinder
        double baseArea = Math.PI * radius * radius;
        double lateralArea = 2 * Math.PI * radius * height;
        return 2 * baseArea + lateralArea;
    }

    // Implement the volume method for Cylinder
    @Override
    public double volume() {
        // Calculate the volume of the cylinder
        return Math.PI * radius * radius * height;
    
    }

      public static void main(String[] args) {
        // Create a Cylinder object with a specific radius and height
        Cylinder cy = new Cylinder(2.4, 3.8);

        // Calculate and display the area and volume
        System.out.println("Cylinder Area: " + cy.area());
        System.out.println("Cylinder Volume: " + cy.volume());
    }
}
