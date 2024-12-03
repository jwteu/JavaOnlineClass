
import java.util.Scanner;


public class Exercise8 {

    private String name;
    private int age;
    private double height;
    private double weight;
    private double bmi;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getHeight(){
        return height;
    }

    public double getWeight(){
        return weight;
    }

    public double getBMI(){
        bmi=(height-100)/weight;
        return bmi;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        if (age > 0){
            this.age=age;
        }
    }

    public void setHeight(double height){
        this.height=height;
    }

    public void setWeight(double weight){
        this.weight=weight;
    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Please enter the name: ");
        String name=scan.nextLine();

        System.out.print("Please enter the age: ");
        int age=scan.nextInt();

        System.out.print("Please enter the height: ");
        double height=scan.nextDouble();

        System.out.print("Please enter the weight: ");
        double weight=scan.nextDouble();

        Exercise8 person = new Exercise8();
        person.setName(name);
        person.setAge(age);
        person.setHeight(height);
        person.setWeight(weight);

        System.out.print("The person name is "+person.getName()+ " and he/she is "+person.getAge()+ " years old and his/her bmi is ");
        System.out.printf("%.2f",person.getBMI());
    }
    
}
