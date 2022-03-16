import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int min = Math.min(a, b);
            for (int j = min; j >= 1; j--) {
                if (a % j == 0 && b % j == 0) {
                    System.out.println(j * (a / j) * (b / j));
                    break;
                }
            }
        }
    }
}