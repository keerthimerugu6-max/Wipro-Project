import java.util.Scanner;
public class Activity5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int[] arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<n1-1;i++){
            for(int j=i+1;j<n1;j++){
                if(arr1[i]<arr1[j]){
                    int temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }
        for(int i=0;i<n2-1;i++){
            for(int j=i+1;j<n2;j++){
                if(arr2[i]<arr2[j]){
                    int temp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
        }
        int[] merge=new int[n1+n2];
        int k=0;
        for(int i=0;i<n1;i++){
            merge[k++]=arr1[i];
        }
        for(int i=0;i<n2;i++){
            merge[k++]=arr2[i];
        }
        for(int i=0;i<merge.length;i++){
            System.out.print(merge[i]+" ");
        }
    }
}