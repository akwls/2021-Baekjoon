import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min_burger = 2000;
        int min_bev = 2000;
        for(int i=0; i<3; i++) {
            int n = sc.nextInt();
            if(n < min_burger) {
                min_burger = n;
            }
        }
        for(int i=0; i<2; i++) {
            int n = sc.nextInt();
            if(n < min_bev) {
                min_bev = n;
            }
        }
        System.out.println(min_burger + min_bev - 50);
    }
}
