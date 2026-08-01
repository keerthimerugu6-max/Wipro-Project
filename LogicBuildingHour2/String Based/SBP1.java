import java.io.*;
import java.util.*;

class UserMainCode{
    public int findStringCode(String input1){
        String[] words=input1.split(" ");
        StringBuilder res=new StringBuilder();
        for(String w:words){
            w=w.toUpperCase();
            int sum=0,n=w.length();
            for(int i=0;i<n/2;i++)
                sum+=Math.abs((w.charAt(i)-'A'+1)-(w.charAt(n-1-i)-'A'+1));
            if(n%2!=0)
                sum+=w.charAt(n/2)-'A'+1;
            res.append(sum);
        }
        return Integer.parseInt(res.toString());
    }
}

public class SBP1{
    public static void main(String[] args){
        UserMainCode obj=new UserMainCode();
        System.out.println(obj.findStringCode("WORLD WIDE WEB"));
    }
}