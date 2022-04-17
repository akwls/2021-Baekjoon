import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int length = str.length();
        int check[] = new int[10];
        int answer = 1;

        int arr[] = new int[length];
        for(int i=0; i<length; i++) {
            int n = Integer.parseInt(Character.toString(str.charAt(i)));
            if(n == 6 || n == 9) {
                if(check[6] < check[9]) check[6]++;
                else check[9]++;
            }
            else {
                check[n]++;
            }
        }
        for(int i=0; i<10; i++) {
            if(check[i] > answer) {
                answer = check[i];
            }
        }
        System.out.println(answer);

    }
}
