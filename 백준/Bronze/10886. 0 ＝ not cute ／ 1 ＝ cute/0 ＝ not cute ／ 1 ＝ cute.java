import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += sc.nextInt();
        }
        if(sum > (double)n/2) {
            System.out.println("Junhee is cute!");
        }
        else {
            System.out.println("Junhee is not cute!");
        }
    }
}