abstract class Shape {
    public abstract double area();
    public abstract double volume();
}

class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public void display() {
        System.out.println("Sphere with radius " + radius);
        System.out.println("Area: " + area());
        System.out.println("Volume: " + volume());
    }

    public static void main(String[] args) {
        Sphere sp = new Sphere(3.5);
        sp.display();
    }
}

