import java.io.*;
import java.util.*;

class UserMainCode{
    public String identifyPossibleWords(String input1,String input2){
        input1=input1.toUpperCase();
        String[] words=input2.split(":");
        StringBuilder sb=new StringBuilder();
        for(String w:words){
            w=w.toUpperCase();
            if(w.length()==input1.length()){
                boolean ok=true;
                for(int i=0;i<input1.length();i++){
                    if(input1.charAt(i)!='_'&&input1.charAt(i)!=w.charAt(i)){
                        ok=false;
                        break;
                    }
                }
                if(ok){
                    if(sb.length()>0)sb.append(":");
                    sb.append(w);
                }
            }
        }
        return sb.length()==0?"ERROR-009":sb.toString();
    }
}

public class SBP5{
    public static void main(String[] args){
        UserMainCode obj=new UserMainCode();
        System.out.println(obj.identifyPossibleWords("H_LL_","HELLO:HILLS:HALLS:HOLLY"));
    }
}