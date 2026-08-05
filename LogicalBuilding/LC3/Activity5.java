import java.util.*;
public class Activity5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] marks=new int[30];
        int[] count=new int[10];
        for(int i=0;i<30;i++){
            marks[i]=sc.nextInt();
            if(marks[i]>=0&&marks[i]<=10)
                count[0]++;
            else if(marks[i]>=11&&marks[i]<=20)
                count[1]++;
            else if(marks[i]>=21&&marks[i]<=30)
                count[2]++;
            else if(marks[i]>=31&&marks[i]<=40)
                count[3]++;
            else if(marks[i]>=41&&marks[i]<=50)
                count[4]++;
            else if(marks[i]>=51&&marks[i]<=60)
                count[5]++;
            else if(marks[i]>=61&&marks[i]<=70)
                count[6]++;
            else if(marks[i]>=71&&marks[i]<=80)
                count[7]++;
            else if(marks[i]>=81&&marks[i]<=90)
                count[8]++;
            else if(marks[i]>=91&&marks[i]<=100)
                count[9]++;
        }
        System.out.println("0-10 : "+count[0]);
        System.out.println("11-20 : "+count[1]);
        System.out.println("21-30 : "+count[2]);
        System.out.println("31-40 : "+count[3]);
        System.out.println("41-50 : "+count[4]);
        System.out.println("51-60 : "+count[5]);
        System.out.println("61-70 : "+count[6]);
        System.out.println("71-80 : "+count[7]);
        System.out.println("81-90 : "+count[8]);
        System.out.println("91-100 : "+count[9]);
        sc.close();
    }
}