class Point {
    protected double x;
    protected double y;

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("Point Coordinates: (" + x + ", " + y + ")");
    }
}

class Point3D extends Point {
    private double z;

    public Point3D() {
        super(); // Calls the default constructor of the superclass
        this.z = 0.0;
    }

    public Point3D(double x, double y, double z) {
        super(x, y); // Calls the parameterized constructor of the superclass
        this.z = z;
    }

    @Override
    public void display() {
        System.out.println("3D Point Coordinates: (" + x + ", " + y + ", " + z + ")");
    }
}

public class PointDemo {
    public static void main(String[] args) {
        Point point2D = new Point(2.0, 3.0);
        point2D.display();

        Point3D point3D = new Point3D(1.0, 2.0, 3.0);
        point3D.display();
    }
}

