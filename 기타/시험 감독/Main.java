import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();

        long result = n;
        for(int i=0; i<n; i++) {
            if(arr[i] > a) result += (int)Math.ceil((arr[i]-a)/(double)b);
        }
        System.out.println(result);
    }
}