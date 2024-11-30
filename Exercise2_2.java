import java.util.Scanner;
public class Exercise2_2 {

    private class Car {
        private String model;
        private String make;
        private double price;

        public Car(String model, String make, double price) {
            this.model = model;
            this.make = make;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exercise2_2 assignment = new Exercise2_2();

        Car car1 = assignment.getCarDetails(scanner);
        Car car2 = assignment.getCarDetails(scanner);
        Car car3 = assignment.getCarDetails(scanner);

        double averagePrice = (car1.getPrice() + car2.getPrice() + car3.getPrice()) / 3;
        System.out.println("The average price of the cars is: " + averagePrice);
        String result = (averagePrice>100000)? "The cars are expensive":
                        (averagePrice<100000 && averagePrice>=50000)? "The cars are normal price": 
                        "The cars are cheap";  //lec said the last condition cannot have the question (.....? "abcde") 

        System.out.println(result);
    }

    private Car getCarDetails(Scanner scanner) {
        System.out.print("Enter car model:");
        String model = scanner.nextLine();
        System.out.print("Enter car make:");
        String make = scanner.nextLine();
        System.out.print("Enter car price:");
        double price = scanner.nextDouble();
        scanner.nextLine(); 
        System.err.println("");
        return new Car(model, make, price);
    }
}
    

