import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = 123456*2+1;
        int arr[] = new int[length];
        for(int i=0; i<length; i++) {
            arr[i] = i;
        }
        for(int i=2; i<length; i++) {
            if(arr[i] == 0) continue;

            for(int j=i*2; j<length; j+=i) {
                arr[j] = 0;
            }
        }
        while(true) {
            int n = sc.nextInt();
            if(n == 0) break;
            int count = 0;
            for(int i=n+1; i<=n*2; i++) {
                if(arr[i] != 0) count++;
            }
            System.out.println(count);
        }
    }
}
