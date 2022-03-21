import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int min_w = Math.min(x, w-x);
        int min_h = Math.min(y, h-y);

        System.out.println(Math.min(min_w, min_h));
    }
}