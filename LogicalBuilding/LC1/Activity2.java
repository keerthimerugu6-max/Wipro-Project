import java.util.*;
public class Activity2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int count=0;
        if(a>=35){
            count++;
        }
        if(b>=35){
            count++;
        }
        if(c>=35){
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
