import java.io.*;
import java.util.*;

class UserMainCode{
    class Result{
        public final String output1,output2,output3;
        public Result(String o1,String o2,String o3){
            output1=o1;
            output2=o2;
            output3=o3;
        }
    }

    public Result encodeThreeStrings(String input1,String input2,String input3){
        String[] a=split(input1),b=split(input2),c=split(input3);
        String o1=a[0]+b[0]+c[0];
        String o2=a[1]+b[1]+c[1];
        String o3=a[2]+b[2]+c[2];
        StringBuilder sb=new StringBuilder();
        for(char ch:o3.toCharArray()){
            if(Character.isUpperCase(ch))
                sb.append(Character.toLowerCase(ch));
            else if(Character.isLowerCase(ch))
                sb.append(Character.toUpperCase(ch));
            else
                sb.append(ch);
        }
        return new Result(o1,o2,sb.toString());
    }

    private String[] split(String s){
        int n=s.length(),q=n/3,r=n%3;
        int f=q,m=q,e=q;
        if(r==1)m++;
        else if(r==2){
            f++;
            e++;
        }
        return new String[]{
            s.substring(0,f),
            s.substring(f,f+m),
            s.substring(f+m)
        };
    }
}

public class SBP3{
    public static void main(String[] args){
        UserMainCode obj=new UserMainCode();
        UserMainCode.Result r=obj.encodeThreeStrings("John","Johny","Janardhan");
        System.out.println(r.output1);
        System.out.println(r.output2);
        System.out.println(r.output3);
    }
}