public class BreakContinue {
    public static void main(String[] args) {
        
        System.out.println("for loop");
        for (int counter =1; counter <=5; counter++) {
            if (counter == 3) {
                break;     // run到3他就停
            }
            System.out.println("For Loop Counter: " + counter);
        }

        System.out.println("while loop");
        int counter = 1;
        while (counter <= 5) {
            if (counter == 3) {
                counter++;
                continue;
            }
            System.out.println("While Loop Counter: " + counter);
            counter++;
        }

        System.out.println("do-while loop");
        counter = 1;
        do {
            if (counter == 3) {
                counter++;
                continue;
            }
            System.out.println("Do-While Loop Counter: " + counter);
            counter++;
        } while (counter <= 5);
    }
    
}
