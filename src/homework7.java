import java.util.Arrays;
import java.util.Random;

public class homework7 {
    /* https://www.codewars.com/kata/559d7951ce5e0da654000073
    [11, 12, 13, 14, 15]  -->  379
     # 1.  2.  3.  4.  5.  position
     11 + 12^2 + 13 + 14^2 + 15 = 379
     */
    static int size=5;
    static int [] arr=new int[size];

    //kava 6


    public static void main(String[] args) {
        random();
        printf();
        System.out.println( sum());
    }




    static void random(){
        Random random=new Random();
        int x;
        for(int i=0;i< arr.length;i++) arr[i]= random.nextInt(11,15);
    }
    static void printf() {
        System.out.println(Arrays.toString(arr));
    }
static int sum() {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        if (i % 2 == 0) sum += arr[i];
        else sum += arr[i] * arr[i];
    }
    return sum;
}


}
