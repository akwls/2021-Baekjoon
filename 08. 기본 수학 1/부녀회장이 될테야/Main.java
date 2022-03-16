import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = Math.min(a, b);

        int answer = 1;

        for(int i=min; i>=1; i--) {
            if(a%i == 0 && b%i == 0) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
        System.out.println(answer * (a/answer) * (b/answer));
    }
}
