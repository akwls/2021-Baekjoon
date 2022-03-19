import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BigInteger result = factorial(n);

        int answer = 0;
        if(result.compareTo(BigInteger.TEN) == 1) {
            while(result.compareTo(BigInteger.ZERO) == 1) {
                if(result.mod(BigInteger.TEN) == BigInteger.ZERO) {
                    answer++;
                    result = result.divide(BigInteger.TEN);
                }
                else {
                    break;
                }
            }
        }
        System.out.println(answer);

    }
    public static BigInteger factorial(int n) {
        if(n <= 1) return BigInteger.ONE;
        return factorial(n-1).multiply(BigInteger.valueOf(n));
    }
}