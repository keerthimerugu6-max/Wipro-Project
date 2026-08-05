import java.util.Scanner;
public class Activity4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[15];
        for(int i=0;i<15;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        boolean found=false;
        for(int i=0;i<15;i++){
            if(arr[i]==x){
                System.out.println("Position="+i);
                found=true;
            }
        }
        if(!found){
            System.out.println("Not Found");
        }
    }
}