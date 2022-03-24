import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int tmp = 1;
        for(int i=0; ; i++) {
            tmp = 28*i + b;
            if((tmp-a)%15 == 0 && (tmp-c)%19==0) {
                break;
            }
        }
        System.out.println(tmp);

    }
}
