import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int people = a * b;
        for(int i=0; i<5; i++) {
            System.out.println(sc.nextInt() - people);
        }
    }
}
