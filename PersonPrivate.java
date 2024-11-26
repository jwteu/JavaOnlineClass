public class PersonPrivate {
    private String name;
    private int age;
    private double height;
    private double weight;

    public PersonPrivate(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }

    public static void main(String[] args) {
        PersonPrivate person = new PersonPrivate("TEU JIAN WEE",22,168,55);
        person.displayDetails();
    }
    
}
