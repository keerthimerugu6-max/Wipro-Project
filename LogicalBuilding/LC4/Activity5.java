import java.util.Scanner;
public class Activity5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String rev="";
        for(int i=str2.length()-1;i>=0;i--){
            rev=rev+str2.charAt(i);
        }
        String str3=str1+rev;
        System.out.println(str3);
    }
}