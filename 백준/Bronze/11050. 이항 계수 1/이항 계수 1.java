import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 1;
        for(int i=0; i<k; i++) {
            result *= (n-i);
        }
        System.out.println(result / facto(k));
    }
    public static int facto(int number) {
        if(number <= 1) {
            return 1;
        }
        else {
            return number * facto(number -1);
        }
    }
}
