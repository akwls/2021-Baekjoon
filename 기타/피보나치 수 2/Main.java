import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fibonacci(sc.nextInt()));
    }
    public static long fibonacci(int n) {
        long a = 1;
        long b = 1;
        for(int i=3; i<=n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}