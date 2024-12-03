public class TryCatch {
    public static void main(String[] args) {
        try {
            int[] number ={1,2,3};
            System.out.println(number[2]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is out of bounds");
            
        }finally{
            System.out.println("This is the finally block");
        }
        //System.out.println("hahaha");
    }
    
}
