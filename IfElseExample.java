public class IfElseExample {
    public static void main(String[] args) {
        int x = 4;
        String color = "red";
        
        if (x >= 0) {
            System.out.println("x is positive");
        } else {
            System.out.println("x is not positive");
        }

        String result = (x > 0) ? "Positive" : "Negative";
        String res = (color.equals("red")) ? "red" : "don't know";
        System.out.println("Ternary result: " + res);
        System.out.println("Ternary result: " + result);
    }
}