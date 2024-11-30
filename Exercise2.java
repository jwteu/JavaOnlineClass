import java.util.Scanner;

public class Exercise2 {
    
        private String model;
        private String make;
        private double price;

        public Exercise2(String model, String make, double price) {
            this.model = model;
            this.make = make;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exercise2[] cars = new Exercise2[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter car " + (i + 1) + " model: ");
            String model = scanner.nextLine();
            System.out.print("Enter car " + (i + 1) + " make: ");
            String make = scanner.nextLine();
            System.out.print("Enter car " + (i + 1) + " price: ");
            double price = scanner.nextDouble();
            System.out.println();
            scanner.nextLine(); // Consume the newline character

            cars[i] = new Exercise2(model, make, price);
        }

        double totalPrice = 0;
        for (int i = 0; i < cars.length; i++) {
            totalPrice += cars[i].getPrice();
        }

        double averagePrice = totalPrice / cars.length;
        System.out.printf("The average price of the cars is: %.2f%n", averagePrice);
    }
}