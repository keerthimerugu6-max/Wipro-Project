import java.io.*;
import java.util.*;

class NBP1{
    public int sumOfSumsOfDigits(int input1){
        String s=String.valueOf(input1);
        int sum=0;
        for(int i=0;i<s.length();i++)
            sum+=(s.charAt(i)-'0')*(i+1);
        return sum;
    }

    public static void main(String[] args){
        NBP1 obj=new NBP1();
        System.out.println(obj.sumOfSumsOfDigits(582109));
    }
}