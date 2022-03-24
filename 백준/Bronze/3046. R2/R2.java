import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int avg = sc.nextInt();

        System.out.println(avg * 2 - n1);
    }
}
