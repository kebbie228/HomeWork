package tranings.src;

import java.util.Arrays;
import java.util.Random;

public class hm7 { /* https://www.codewars.com/kata/559d7951ce5e0da654000073
    [11, 12, 13, 14, 15]  -->  379
     # 1.  2.  3.  4.  5.  position
     11 + 12^2 + 13 + 14^2 + 15 = 379
     */
    static int [] arr=new int[] {11, 12, 13, 14, 15};

    public static void main(String[] args)  {

        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) sum += arr[i];
            else sum += arr[i] * arr[i];
        }
        System.out.println(sum);

    }
}