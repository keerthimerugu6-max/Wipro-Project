import java.io.*;
import java.util.*;

class UserMainCode{
    public String addNumberStrings(String input1,String input2){
        StringBuilder sb=new StringBuilder();
        int i=input1.length()-1,j=input2.length()-1,c=0;
        while(i>=0||j>=0||c>0){
            int sum=c;
            if(i>=0)sum+=input1.charAt(i--)-'0';
            if(j>=0)sum+=input2.charAt(j--)-'0';
            c=sum/10;
            sb.append(sum%10);
        }
        return sb.reverse().toString();
    }
}

public class SBP4{
    public static void main(String[] args){
        UserMainCode obj=new UserMainCode();
        System.out.println(obj.addNumberStrings("12345","6789"));
    }
}