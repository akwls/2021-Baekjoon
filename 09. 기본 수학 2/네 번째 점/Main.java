import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w1 = 0, h1 = 0;
        int w2 = 0, h2 = 0;
        w1 = sc.nextInt();
        h1 = sc.nextInt();
        for(int i=1; i<3; i++) {
            int a = sc.nextInt();

            if(a == w1) {
                w1 = 0;
            }
            else if(a == w2) {
                w2 = 0;
            }
            else if(a != w1 && a != w2) {
                w2 = a;
            }

            int b = sc.nextInt();
            if(b == h1) {
                h1 = 0;
            }
            else if(b == h2) {
                h2 = 0;
            }
            else if(b != h1 && b != h2) {
                h2 = b;
            }
        }

        System.out.println(Math.max(w1, w2) + " " + Math.max(h1, h2));

    }
}
