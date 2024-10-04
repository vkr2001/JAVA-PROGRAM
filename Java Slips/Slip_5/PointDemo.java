class Point {
    private int x;
    private int y;

    // Default constructor
    public Point() {
        x = 5;
        y = 8;
    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}

class ColorPoint extends Point {
    private String color;

    public ColorPoint() {
        super(); // Calls the default constructor of the superclass Point
        color = "GOLD";
    }

    public ColorPoint(int x, int y, String color) {
        super(x, y); // Calls the parameterized constructor of the superclass Point
        this.color = color;
    }

    public void display() {
        super.display(); // Call the display method of the superclass Point
        System.out.println("Color: " + color);
    }
}

public class PointDemo {
    public static void main(String[] args) {
        Point point1 = new Point();
        point1.display();

        Point point2 = new Point(10, 14);
        point2.display();

        ColorPoint colorPoint1 = new ColorPoint();
        colorPoint1.display();

        ColorPoint colorPoint2 = new ColorPoint(1, 2, "ORANGE");
        colorPoint2.display();
    }
}

