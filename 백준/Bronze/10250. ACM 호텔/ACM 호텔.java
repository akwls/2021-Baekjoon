import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;

        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int c = sc.nextInt();
            answer = (int)Math.ceil((double)c / h);
            if(c % h == 0) {
                answer += h * 100;
            }
            else answer += (c % h) * 100;
            System.out.println(answer);
        }

    }
}
