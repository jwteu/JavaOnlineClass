public class Exercise4 {
    public static void main (String [] args){
        String [][] matrix = {{"Tesla", "US"}, {"Proton", "Malaysia"}, {"Toyota", "Japan"}};
        double [] matrix3 = {80000, 40000, 60000};

        System.out.println("Car with price above 50000 RM: ");
        for (int i = 0; i < matrix.length; i++) {
            if (matrix3[i] > 50000) {
                System.out.println(matrix[i][0]+" "+  matrix[i][1]+ " RM" +matrix3[i]);
            }
        }
    }
}