import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = 2;
        while(n > 1) {
            if(n%tmp == 0) {
                System.out.println(tmp);
                n /= tmp;
            }
            else {
                tmp++;
            }
        }
    }
}