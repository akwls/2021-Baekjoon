import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int answer = -1;
        int sum = 0;

        for(int i=a; i<=b; i++) {
            boolean check = false;
            for(int j=2; j<=Math.sqrt(i); j++) {
                if(i%j == 0) {
                    check = true;
                    break;
                }
            }
            if(i>=2 && !check) {
                sum += i;
                if(answer == -1) {
                    answer = i;
                }
            }
        }
        if(answer == -1) {
            System.out.println(answer);
        }
        else {
            System.out.println(sum);
            System.out.println(answer);
        }
    }
}