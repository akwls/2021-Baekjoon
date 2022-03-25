import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            System.out.println(p(a));
        }

    }
    public static long p(int n) {
        long a = 1;
        long b = 1;
        long c = 1;
        for(int i=4; i<=n; i++) {
            long d = a + b;
            a = b;
            b = c;
            c = d;
        }
        return c;
    }
}
