import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte[][] arr = new byte[100][100];

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0; i<n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            int y1 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int j=x1; j<=y1; j++) {
                for(int k=x2; k<=y2; k++) {
                    arr[j-1][k-1]++;
                }
            }
        }
        int answer = 0;
        for(int i=0; i<100; i++) {
            for(int j=0; j<100; j++) {
                if(arr[i][j] > m) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
