import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {
/* задача 10
       double sum=0;
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        for(int i=1;i<=n;i++){
            sum+=(double)1/i;
        }
        System.out.printf("%.5f",sum);
 */
/* задание 11
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        for(int i=0;i<=n;i++){
            sum+=(n+i)*(n+i);
        }
        System.out.println(sum);
*/

/* задание 12
        double sum=1; int e=10;
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        for(int i=1;i<=n;i++){
            if(i%e==0)e*=10;
            sum*=(1+(double)i/e);
        }
        System.out.printf("%.5f",sum);
 */

/* задание 13
        double sum = 0;
        int e = 10;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i;
        for (i = 1; i <= n; i++) {
            if (i % e == 0) e *= 10;
           sum += Math.pow(-1,i+1)*(1 + (double) i / e);
        }
        System.out.printf(" %.5f", sum);
/*задание 14

        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= (2*n-1); i++) {
            sum+=i;
            System.out.println(sum);
            }
 */
/* задание 31
        double a = 2;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <=n; i++) {

            a=2+1/a;
            System.out.println(a);
       }
 */
 /* задание 34
        double a = 1,b=2,k;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <=n; i++) {
            System.out.println(a);
            k=(a+2*b)/3;
            a=b;
            b=k;
}

  */
        double a = 1,b=2,c=3,k;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.println(a);
            k = (a + b - 2 * c);
            a = b;
            b = c;
            c = k;
        }


    }
}
