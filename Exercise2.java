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
     
        System.out.print("Enter your car1 model: ");
        String model = scanner.nextLine();
        System.out.print("Enter your car1 make: ");
        String make = scanner.nextLine();
        System.out.print("Enter your car1 price: ");
        double price = scanner.nextDouble();
        Exercise2 car1 = new Exercise2(model, make, price);
        System.out.println();

        scanner.nextLine();
        System.out.print("Enter your car2 model: ");
        String model2 = scanner.nextLine();
        System.out.print("Enter your car2 make: ");
        String make2 = scanner.nextLine();
        System.out.print("Enter your car2 price: ");
        double price2 = scanner.nextDouble();
        Exercise2 car2 = new Exercise2(model2, make2, price2);
        System.out.println();

        scanner.nextLine();
        System.out.print("Enter your car3 model: ");
        String model3 = scanner.nextLine();
        System.out.print("Enter your car3 make: ");
        String make3 = scanner.nextLine();
        System.out.print("Enter your car3 price: ");
        double price3 = scanner.nextDouble();
        Exercise2 car3 = new Exercise2(model3, make3, price3);
        System.out.println();
        
        double average= (car1.getPrice() + car2.getPrice() + car3.getPrice())/3;
        System.out.println("Average price of the cars is: RM" + average);
    }
}