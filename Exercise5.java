import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] Vipcar = new String[5][4];
        String[][] Cheapcar = new String[5][4];
        int vipCount = 0;
        int cheapCount = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Please enter the car " + (i + 1) + " price: RM");
            double price = scan.nextDouble();
            if (price >= 70000) {
                Vipcar[vipCount][0] = String.valueOf(price);
                Vipcar[vipCount][1] = "VIP";
                Vipcar[vipCount][2] = "2024";
                Vipcar[vipCount][3] = "pre-order";
                vipCount++;
            } else {
                Cheapcar[cheapCount][0] = String.valueOf(price);
                Cheapcar[cheapCount][1] = "Cheap";
                Cheapcar[cheapCount][2] = "old";
                Cheapcar[cheapCount][3] = "for sale";
                cheapCount++;
            }
        }

        System.out.println("\nVIP Car");
        for (int i = 0; i < vipCount; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(Vipcar[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nCheap Car");
        for (int i = 0; i < cheapCount; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(Cheapcar[i][j] + "\t");
            }
            System.out.println();
        }

        scan.close();
    }
}