import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int answer = 1;
        for(int i=1; i<=n; i++) {
            int sum = i;
            int tmp = i;
            while(sum < n) {
                tmp++;
                if(sum + tmp == n) {
                    answer++;
                    break;
                }
                sum += tmp;

            }
        }
        System.out.println(answer);

    }
}
