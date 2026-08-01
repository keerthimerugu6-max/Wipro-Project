import java.io.*;
import java.util.*;

class UserMainCode{
    public int getCodeThroughStrings(String input1){
        String[] words=input1.split(" ");
        int len=0;
        for(String w:words)
            len+=w.length();
        while(len>9){
            int sum=0;
            while(len>0){
                sum+=len%10;
                len/=10;
            }
            len=sum;
        }
        return len;
    }
}

public class SBP2{
    public static void main(String[] args){
        UserMainCode obj=new UserMainCode();
        System.out.println(obj.getCodeThroughStrings("WORLD WIDE WEB"));
    }
}