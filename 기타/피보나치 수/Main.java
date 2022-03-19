import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0) {
            System.out.println(0);
            return;
        }
        int a = 1;
        int b = 1;

        for(int i=3; i<=n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(b);
    }
}
