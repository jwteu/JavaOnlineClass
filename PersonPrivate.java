public class PersonPrivate {

    //private fields

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
        double bmi = height / (weight + age);
        System.out.println("BMI is: "+ bmi);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + "m");
        System.out.println("Weight: " + weight + "kg");
    }

    public static void main(String[] args) {
        PersonPrivate person = new PersonPrivate("TEU JIAN WEE",22,1.68,55.0);
        person.displayDetails();
    }
    
}
