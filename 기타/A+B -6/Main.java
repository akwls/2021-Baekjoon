import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            String str = sc.next();
            StringTokenizer st = new StringTokenizer(str, ",");
            System.out.println(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
        }
    }
}
