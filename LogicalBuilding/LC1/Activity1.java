import java.util.*;
public class Activity1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int temp=a;
        a=c;
        c=b;
        b=temp;
        System.out.println(a+" "+b+" "+c);
        sc.close();
    }
}