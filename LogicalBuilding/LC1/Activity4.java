import java.util.*;
public class Activity4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            if(a%2==0){
                System.out.println("even");
            }
            if(a%2!=0){
                System.out.println("odd");
            }
            if(a==0){
                System.out.println("zero");
            }
            sc.close();
     }
}

