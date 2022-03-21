import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt() + sc.nextInt();
        int answer = sum;
        for(int i=0; i<3; i++) {
            int getout = sc.nextInt();
            int getin = sc.nextInt();
            sum = sum - getout + getin;
            if(sum > answer) answer = sum;
        }
        System.out.println(answer);
    }
}
