import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        for(int i=1; i<=3; i++) {
            num *= sc.nextInt();
        }
        int answer[] = new int[10];
        int n;
        while(num>0) {
            n = num%10;
            num /= 10;
            answer[n]++;
        }
        for(int i=0; i<10; i++) {
            System.out.println(answer[i]);
        }
    }
}