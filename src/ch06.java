

/**
 * Created by Lauri on 18.11.2016.
 */
public class ch06 {

    public static boolean isDivisible(int n, int m) {
            return n % m == 0;

        }

    public static void main(String[] args) {
            System.out.println(isDivisible(8, 4));
            System.out.println(isTriangle(10, 3, 5));
        }

    public static boolean isTriangle(int a, int b, int c) {
            return (a + b > c && b + c > a && a + c > b);


        }
}







