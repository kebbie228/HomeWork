import java.util.Scanner;


public class homework4 {
    public static void main(String[] args) {
/* задание 1
        int a=0,b=1,x;

        System.out.print("0 ");
        for(int i=0;i<=100;i++) {
            x = a + b;
            a = b;
            b = x;
            if (x > 10e6) break;
            System.out.print(x + " ");
        }
*/

/* задание 2
        int x = 2,a=2;
        for (int i = 2; i < 100000; i++) {
            if(x>1000){break;}
            if (x % a == 0) {
                System.out.print(x+"%"+a+" "); x++;a=2;continue;
            }
            else a++;
        }
*/

/* задание 3(?)
        int a = 10, count = 0;
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        int sum=0,digit,n,x=number;
        String s=Integer.toString(x);
        n=s.length();
        x=Integer.parseInt(s);
            for (int i = 0; i <n; i++) {
             digit=x%10;
                sum += Math.pow(digit,n);
                x/=10;
            }
            if (sum==number) {
                System.out.println(number+"-a narcissistic number");
                count++;}
            else  System.out.println(number+"-isn't a narcissistic number");
*/

/* задание 4
        int x =1, a = 1, sum = 0;
        for (int i = 0; i < 1e6; i++) {
            if (x % a == 0) {
                sum += a;
                a++;
            } else a++;
            if (x == sum && x==a ) {System.out.println(x + "perferct");
                x++;
                sum = 0;
                a = 1;
            }
            if(x<=a){x++;a=1;sum=0;}
        }
*/

/* задание 5
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String s = Integer.toString(x);
        int e = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            for (int j = s.length() - 1; j > s.length() / 2; j--) {
                j -= i;
                if (s.charAt(i) == s.charAt(j)) e = 1;
                else e = 0;
                break;
                }
                 }
        if (e == 1) System.out.println("Lucky number");
        else System.out.println("Unlucky number");
*/

/* задание 8
        int a = 00, b = 00,sum=0,k=0;
        for (int i = 0; i < 1440; i++) {
            b++;
            if (b == 60) {
                a++;
                b = 0;
            }
            if (a == b){
                System.out.println(a + " " + b);k++;}
            sum=(a % 10) * 10 + (a / 10);
            if(sum==b){System.out.println(a + " " + b);k++;}
        }
        System.out.println("total number of combinations is "+k);
*/

/* задание 9
        int sum=0;
for(int i=0;i<1000;i++) {
    if (i % 3 == 0 || i % 5 == 0) sum +=i;
}
        System.out.println(sum);
 */
/* задание 10
        int x = 2515, k = 0;
        while (k <20) {
            for (int i = 1; i <= 20; i++) {if (x % i == 0) k++; else i++; }
            if(k!=20){k=0;x++;}
        }
        System.out.println(x);
*/

/* задание 11
        for(int i=1;i<=1000;i++){
            if(i%3==0) System.out.println("fizz");
            if(i%5==0) System.out.println("buzz");
            if(i%15==0) System.out.println("hiss");
        }
 */
        Scanner scanner = new Scanner(System.in);
        int day = 0;
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        while (x <= y) {
            x = x + x /10;
            System.out.println(x);
            day++;
        }
        System.out.println(day);

    }
}
