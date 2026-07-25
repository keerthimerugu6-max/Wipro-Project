import java.util.*;

public class ABP3{
    public static class Result{
        public final int output1,output2;
        public Result(int o1,int o2){
            output1=o1;
            output2=o2;
        }
    }

    public static Result findOriginalFirstAndSum(int[] input1,int input2){
        int[] a=new int[input2];
        a[input2-1]=input1[input2-1];
        for(int i=input2-2;i>=0;i--)
            a[i]=input1[i]-a[i+1];
        int sum=0;
        for(int x:a)
            sum+=x;
        return new Result(a[0],sum);
    }

    public static void main(String[] args){
        int[] input1={7,6,8,16,12,3};
        int input2=6;
        Result r=findOriginalFirstAndSum(input1,input2);
        System.out.println(r.output1);
        System.out.println(r.output2);
    }
}