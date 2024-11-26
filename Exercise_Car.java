public class Exercise_Car {
    private int year;
    private double price;
    private String name;

    public Exercise_Car(int year, double price, String name) {
        this.year = year;
        this.price = price;
        this.name = name;
    }

    public void displayCarDetail(){
        double value = (price * year)/1000;
        System.out.println("Car Name: " + name);
        System.out.println("Car Year: " + year);
        System.out.printf("Car Price: RM%.2f%n", price);
        System.out.printf("Car Value: RM%.2f%n", value);
    }

    public static void main(String[] args) {
        Exercise_Car car = new Exercise_Car(2008, 45000, "Toyota");
        car.displayCarDetail();
    }
}