import utility.CapitalString;

public class Person {
    private String name;
    private String city;

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", city=" + city + "]";
    }
    
      public static void main(String[] args) {
        CapitalString capitalizer = new CapitalString();
        Person person = new Person("kapil Sharma", "Mumbai City");

        // Capitalize the first letter of the person's name
        person.setName(capitalizer.capitalizeFirstLetter(person.getName()));

        // Display the person's name with the first letter capitalized
        System.out.println(person);
    }
}
