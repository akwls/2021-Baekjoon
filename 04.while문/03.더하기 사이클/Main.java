import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 0;
        int n = num;
        while(true) {
            int a, b;
            a = n/10;
            b = n%10;
            int c = a + b;
            n = (b*10) + (c%10);
            cnt++;
            if(n == num) break;
        }
        System.out.println(cnt);
    }
}