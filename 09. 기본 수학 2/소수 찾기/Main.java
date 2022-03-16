import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int answer = 0;

        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            boolean b = false;
            for(int j=2; j<a; j++) {
                if(a%j == 0) {
                    b = true;
                    break;
                }
            }
            if(a >= 2 && !b) answer++;
        }
        System.out.println(answer);
    }
}
