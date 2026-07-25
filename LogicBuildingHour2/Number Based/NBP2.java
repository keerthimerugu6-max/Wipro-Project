import java.io.*;
import java.util.*;

class UserMainCode{
    public int sumOfPowerOfDigits(int input1){
        String s=String.valueOf(input1);
        int sum=0;
        for(int i=0;i<s.length();i++){
            int base=s.charAt(i)-'0';
            int exp=(i==s.length()-1)?0:s.charAt(i+1)-'0';
            sum+=(int)Math.pow(base,exp);
        }
        return sum;
    }
}

public class NBP2{
    public static void main(String[] args){
        UserMainCode obj=new UserMainCode();
        System.out.println(obj.sumOfPowerOfDigits(582109));
    }
}