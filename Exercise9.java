import java.util.Scanner;

public class Exercise9 {
    
    public static void main (String [] args ){
        Scanner scan =new Scanner(System.in);
        
        try{
        System.out.println("1 - Matrix 3*4");
        System.out.println("2 - Matrix 2*3");
        System.out.print("Please choose: ");
        int option = scan.nextInt();
        int [][]matrix1=new int[3][4];
        int [][]matrix2=new int[2][3];


        switch (option){
            case 1:
                for(int i=0; i<matrix1.length; i++){
                    for (int j=0; j<matrix1[i].length; j++){
                        System.out.print("Enter the value to Matrix ["+i+"] ["+j+"] : ");
                        matrix1[i][j]=scan.nextInt();
                    }
                }
                    System.out.println("\nThe result of matrix 3*4 is ");
                        for (int i = 0; i < matrix1.length; i++){
                            for (int j=0; j<matrix1[i].length; j++){
                                System.out.print(matrix1[i][j] + " ");
                            }
                            System.out.println();
                        }
                break;

            case 2:
                for(int i=0; i<matrix2.length; i++){
                    for (int j=0; j<matrix2[i].length; j++){
                        System.out.print("Enter the value to Matrix ["+i+"] ["+j+"] : ");
                        matrix2[i][j]=scan.nextInt();
                    }
                }

                System.out.println(matrix2[6][8]);

                    System.out.println("\nThe result of matrix 2*3 is ");
                        for (int i = 0; i < matrix2.length; i++){
                            for (int j=0; j<matrix2[i].length; j++){
                                System.out.print(matrix2[i][j] + " ");
                            }
                            System.out.println();
                        }
                break;

            default:
                System.out.println("invalid option");
        }
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("\nError - result cannot show");
    }

    }
    
}

