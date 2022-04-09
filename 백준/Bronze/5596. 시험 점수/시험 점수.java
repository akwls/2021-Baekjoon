import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for(int i=0; i<2; i++) {
            int tmp = 0;
            tmp += sc.nextInt();
            tmp += sc.nextInt();
            tmp += sc.nextInt();
            tmp += sc.nextInt();
            if(tmp > sum) sum = tmp;
        }
        System.out.println(sum);

    }
}
