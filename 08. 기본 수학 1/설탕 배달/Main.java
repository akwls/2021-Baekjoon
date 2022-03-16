import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int answer = 0;
        int tmp = n;

        if(n % 5 == 0) {
            System.out.println(n/5);
            return;
        }
        else {
            for(int i=1; i<= tmp; i++) {
                if((n - 3) % 5 == 0) {
                    System.out.println(i + ((n - 3) / 5));
                    return;
                }
                else if(n == 0) {
                    System.out.println(answer++);
                    return;
                }
                else if(n < 3) {
                    System.out.println(-1);
                    return;
                }
                else {
                    n -= 3;
                    answer++;
                }
            }
        }
        System.out.println(-1);
    }
}
