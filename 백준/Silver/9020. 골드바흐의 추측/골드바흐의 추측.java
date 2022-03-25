import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int length = 10001;
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

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int c=0, d=0;
        for(int i=0; i<n; i++) {
            int k = sc.nextInt();
            int diff = k;
            for(int j=2; ; j++) {
                int a = arr[j];
                int b = arr[k-a];
                if(a != 0 && b != 0) {
                    if(a <= b && (b-a) < diff) {
                        diff = b-a;
                        c = a;
                        d = b;
                    }
                    if(a > b) break;
                }
            }
            System.out.println(c + " " + d);

        }
    }
}
