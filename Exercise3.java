public class Exercise3 {
    public static void main (String [] args){
    
        for (int i=0; i<200; i++){
            if (i==14){
                continue; //直接不print 14 jump to 15
            }

            if (i==26){
                break; //直接不print 26 就停
            }
            System.out.println(i);
        }
    }
    
}
