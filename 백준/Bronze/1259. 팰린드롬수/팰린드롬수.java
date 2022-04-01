import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String str = sc.next();
            if(str.equals("0")) break;
            int n = Integer.valueOf(str);
            int[] arr = new int[str.length()];
            for(int i=0; ; i++) {
                if(n <= 0) break;
                arr[i] = n%10;
                n /= 10;
            }
            String answer = "yes";
            for(int i=0; i<=str.length()/2; i++) {
                if(arr[i] != arr[str.length()-i-1]) {
                    answer = "no";
                }
            }
            System.out.println(answer);
        }
    }
}
