package tranings.src;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
"4556364607935616" --> "############5616"
     "64607935616" -->      "#######5616"
               "1" -->                "1"
                "" -->                 ""
 */
public class hm7 {
    static int n;
    static int[] arr = new int[]{};

    public static void main(String[] args) {
        /*
        Scanner scanner=new Scanner(System.in);
       n= scanner.nextInt();
       String s=Integer.toBinaryString(n);
       int count=0;
       for(int i=0;i<s.length();i++)
           if(s.charAt(i)=='1') count++;
        System.out.println(s+" "+count);
         */
         String s = "the_stealth_warrior";
        StringBuilder sb = new StringBuilder(s);
int k=0;
        for (int i = 0; i < s.length() - 1; i++) {
         //   if (s. ) sb=sb.deleteCharAt(i);
                        System.out.print(s.charAt(i) + " ");
        }
        System.out.println();
        System.out.println(sb);




}}
