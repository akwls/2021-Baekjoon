import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int answer = 0;
        for(int i=1; i<=n; i++) {
            if(func(i)) {
                answer++;
            }
        }
        System.out.println(answer);

    }

    public static boolean func(int n) {
        if(n < 100) return true;
        int length = 0;
        int tmp = n;
        while(tmp>0) {
            length++;
            tmp/=10;
        }
        int arr[] = new int[length];
        for(int i=0; n>0; i++) {
            arr[i] = n%10;
            n/=10;
        }
        int d = arr[0] - arr[1];
        for(int i=1; i<arr.length-1; i++) {
            if(arr[i] - arr[i+1] != d) {
                return false;
            }
        }
        return true;
    }
}
