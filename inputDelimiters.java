import java.util.Scanner;
import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner ritesh = new Scanner(System.in);
         
        int count = 3;
        int C=50;
        int H=30;
         
        for(int i=0;i<count;i++){
            ritesh.useDelimiter("\\D");
            int D = ritesh.nextInt();
             double Q = Math.sqrt((2*C*D)/H) ;
             int res = (int)Math.round(Q);
            System.out.print(res);
            if(i < count-1){
                System.out.print(",");
            }
             
        }
    }
}
