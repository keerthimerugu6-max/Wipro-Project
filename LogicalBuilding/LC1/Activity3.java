import java.util.*;
public class Activity3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        int pc=0,nc=0;
        for(int i=0;i<arr.length;i++)
        {
             arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                nc++;
            }
            if(arr[i]>=0){
                pc++;
            }
        }
        System.out.println("Postive count:"+pc);
        System.out.println("Negative count:"+nc);
        sc.close();
    }
}
