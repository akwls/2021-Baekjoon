import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int answer = 0;
        for(int i=0; i<str.length(); i++) {
            char n = str.charAt(str.length()-1-i);
            int a;
            if(n == 'A') a = 10;
            else if(n == 'B') a = 11;
            else if(n == 'C') a = 12;
            else if(n == 'D') a = 13;
            else if(n == 'E') a = 14;
            else if(n == 'F') a = 15;
            else a = n-48;
            answer += Math.pow(16, i) * a;

        }
        System.out.println(answer);
    }
}
