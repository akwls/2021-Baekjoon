import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(fibonacci(n));


    }
    public static BigInteger fibonacci(int n) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        for(int i=3; i <= n; i++) {
            BigInteger c = a.add(b);
            a = b;
            b = c;
        }
        return b;
    }
}
