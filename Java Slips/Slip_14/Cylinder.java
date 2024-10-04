// Define the Operation interface
interface Operation {
    float PI = 3.142f; // Constant PI as a float

    float area();

    float volume();
}

// Implement the Operation interface in the Cylinder class
class Cylinder implements Operation {
    private float radius;
    private float height;

    // Constructor to initialize the radius and height of the cylinder
    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    // Implement the area method to calculate the surface area of the cylinder
    @Override
    public float area() {
        return 2 * PI * radius * (radius + height);
    }

    // Implement the volume method to calculate the volume of the cylinder
    @Override
    public float volume() {
        return PI * radius * radius * height;
    }

    // Display the area and volume of the cylinder
    public void displayAreaAndVolume() {
        System.out.println("Cylinder Area: " + area());
        System.out.println("Cylinder Volume: " + volume());
    }
        
   public static void main(String[] args) {
   float cylinderRadius = 5.0f; // Set the radius as a float
   float cylinderHeight = 10.0f; // Set the height as a float

   // Create a Cylinder object
   Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);

   // Display the area and volume of the cylinder
   cylinder.displayAreaAndVolume();
    }
}

