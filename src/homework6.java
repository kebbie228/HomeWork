import java.util.Arrays;
import java.util.Random;

public class homework6 {
    static int size = 30;
    static int rows = 7;
    static int cols = 6;
    static int[][] arr9 = new int[rows][cols];
    static int[] arr = new int[size];


    public static void main(String[] args) {
/* задание 1
        int k=0; int a=1,b=1,c;
        while(k!=15){
            c=a+b;
        a=b;b=c;
            if(c%2==0) {System.out.println(c+" "+k);k++;}
        }

*/
        // fillRandom();
        // print();
        // min();
/*задание3
        int[] arr2 = {1, 1, 3, 1, 1};
        System.out.println(Arrays.toString(arr2));
        int x = arr2[1], k = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != x) {
                k = 0;
                break;
            } else k = 1;
        }
        if (k == 1) System.out.println("yes");
        if (k == 0) System.out.println("no");
*/

/* заданиe 4
      int[] arr2 = {1,3,5,7,5,11,15,19,16,8};
        System.out.println(Arrays.toString(arr2));
        int x, k =0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++){
                if(arr2[i]==arr2[j])k++;
            }
        }
       if(k==arr2.length) System.out.println("yes");
       if (k>arr2.length)System.out.println("no");
        System.out.println(k);
        }
 */
        /*
        fillRandom5();
        print5();
        int k = 1,index=0;
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (arr[i] == arr[j])
                    k++;
            }
            if (k>1) {
                System.out.println(arr[i] + " - " + k);
                k=1;
            }
        }
         */
/* заданиа 6
        fillRandom5();
        print5();
      int k = 1,index=0;
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j <10; j++) {
                if (arr[i] != arr[j]) k++;
            }
            for (int j = i ; j >=0; j--) {
                if (arr[i] != arr[j])k++;
            }
            if (k==10 ) {
                System.out.println(arr[i] + " - " + i+"index");
            }
            k=1;
        }
*/
/* задание 7
        fillRandom7();
        print7();
        int k = 0,index=0;
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j <10; j++) {
                if (arr[i] == arr[j]) k++;
            }
            for (int j = i ; j >=0; j--) {
                if (arr[i] == arr[j])k++;
            }

                System.out.println(arr[i] + " - " + k+" index");

            k=0;
            }

 */
/*задание 8
        fillRandom8();
        print8();

        int k = 0;
        for (int i = 0; i <15; i++) {
            for (int j = i + 1; j <15; j++) {
                if (arr[i] == arr[j]) k++;
            }
            for (int j = i ; j >=0; j--) {
                if (arr[i] == arr[j]) k++;
            }
            if (k>=3 ) {
                System.out.println((char)arr[i] + " - " + k + " count");
            }
            k=0;
        }
 */
/* задание 9
        fillRandom9();
        print9();
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr9[i][j] < 0) arr9[i][j] *= arr9[i][j];
                System.out.printf("%3s", arr9[i][j]);
            }
            System.out.println();
        }
*/
/* задание 10 - не работает
        fillRandom10();
        print10();
        for (int i = 0; i < rows; i++) {
            for (int j = i+1; j < cols; j++){
                if(arr[j]%arr[i]==0 && arr[j+1]%arr[i]==0) System.out.println(arr9[i][j]);
            }
        }
 */
        /* задание 12
        int[] arr12 = {1, 2, 3, 2, 1};
        int k=1, j=arr12.length-1;
        for (int i = 0; i <arr12.length / 2 ; i++) {
            j=arr12.length-1-i;

                if (arr12[i] != arr12[j]){ k = 0; break;}

            }
        if(k==1) System.out.println("yes");
        else System.out.println("no");
 */


    }
    static void fillRandom() {

        Random random = new Random();
        for (int i = 0; i < 30; i++) arr[i] = random.nextInt(120) - 70;
    }

    static void fillRandom5() {

        Random random = new Random();
        for (int i = 0; i < 10; i++) arr[i] = random.nextInt(21) - 10;
    }

    static void min() {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < 30; i++) {
            if (min > arr[i]) min = arr[i];
            if (max < arr[i]) max = arr[i];
        }
        System.out.println(min + " " + max);
    }

    static void print() {
        for (int i = 0; i < 30; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void print5() {
        for (int i = 0; i < 10; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void fillRandom7() {

        Random random = new Random();
        for (int i = 0; i < 10; i++) arr[i] = random.nextInt(10) + 3;
    }

    static void print7() {
        for (int i = 0; i < 10; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void fillRandom8() {
        Random random = new Random();
        for (int i = 0; i < 15; i++) arr[i] = random.nextInt(25) + 98;
    }

    static void print8() {
        for (int i = 0; i < 15; i++) System.out.print((char) arr[i] + " ");
        System.out.println();
    }

    static void fillRandom9() {
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) arr9[i][j] = random.nextInt(10) - 3;
        }
    }

    static void print9() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.printf("%3s", arr9[i][j]);
            System.out.println();
        }
    }
    static void fillRandom10() {
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) arr9[i][j] = random.nextInt(33)+1;
        }
    }

    static void print10() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.printf("%3s", arr9[i][j]);
            System.out.println();
        }
        System.out.println();
    }



}
