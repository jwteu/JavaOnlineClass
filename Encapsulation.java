public class Encapsulation {
    
    private String name;
    private int age;


    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name=name;
    }    

    public void setAge(int age){
        if (age > 0){
            this.age=age;
        }
    }

    public static void  main (String [] args){
        Encapsulation abc = new Encapsulation();
        abc.setName("Wong");
        abc.setAge(25);

        System.out.println("The name of the person is: " + abc.getName() + " "+ abc.getAge());
    }
}
