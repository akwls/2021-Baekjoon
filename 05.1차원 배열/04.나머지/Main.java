import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int answer[] = new int[10];
        int num;
        int cnt = 0;
        outer:for(int i=0; i<10; i++) {
            num = sc.nextInt();
            answer[i] = num%42; 
            for(int j=0; j<i; j++) {
                if(answer[i] == answer[j]) continue outer;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}