import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int aa = 0, bb= 0;
        for (int i = 100; i >= 1; i /= 10) {
		    aa += (a % 10) * i;
		    a /= 10;
		    bb += (b % 10) * i;
		    b /= 10;
        }
        System.out.print(((aa > bb) ? aa : bb));
    }
}