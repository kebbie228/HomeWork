import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {

        System.out.println("Write three-digit number");
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        System.out.println();
        int hundreds = x / 100;
        int tens = x / 10 % 10;
        int ones = x % 10;
        System.out.printf("%d%d%d\n", ones, tens, hundreds);//first exersice

        System.out.printf("%d%d%d\n", tens, ones, hundreds);//second exercise 123 - 231

        System.out.printf("%d%d%d\n", tens, hundreds, ones);//third exercise

        if (tens % 2 == 0) {
            tens++;
        }
        System.out.printf("%d%d%d\n", hundreds, tens, ones);//fourth exercise

        if (hundreds != ones) {
            ones = hundreds;
        }
        System.out.printf("%d%d%d\n", hundreds, tens, ones);//fifth exercise

        boolean e6 = (tens % 2 == 0);
        System.out.println(e6);//sixth exercise

        boolean e7 = (hundreds % 2 != 0);
        System.out.println(e7);//seventh exercise

        boolean e8 = (hundreds == ones);
        System.out.println(e8);//eighth exercise

        System.out.println("Write number");
        Scanner b = new Scanner(System.in);
        int n = b.nextInt();
        int max = 0;
        while ((n = n / 10) > 0) {
            max = n;
        }
        System.out.println(max);//ninth exercise
        x = a.nextInt();
        int s = 0;
        hundreds = x / 100;
        tens = x / 10 % 10;
        ones = x % 10;
        s = x - (ones * 100 + tens * 10 + hundreds);
        System.out.println(s);//tenth exercise


        float y = 3.14f;
        System.out.println();


        int x1 = 2, y1 = 2, x2 = 3, y2 = 3;
        boolean b1= (Math.abs(x1 - x2) == 1 && Math.abs(y1 - y2) == 2
                || Math.abs(x1 - x2) == 2 && Math.abs(y1 - y2) == 1) ;
        System.out.println(b1);

        boolean b2=(Math.abs(x1 - x2) == 1 && Math.abs(y1 - y2) == 0
                || Math.abs(x1 - x2) == 0 && Math.abs(y1 - y2) == 1
                || Math.abs(x1 - x2) == 1 && Math.abs(y1 - y2) == 1
        );
        System.out.println(b2);

    }

}