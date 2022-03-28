import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int answer = 0;
        int i;
        
        sc.close();
        for(i=0; i<s.length()-1; i++) {
            char ch = s.charAt(i);
            char ch2 = s.charAt(i+1);
            if(ch == 'c' && (ch2 == '=' || ch2 == '-')) {
                i++;
            }
            else if(ch == 'd') {
                if(ch2 == 'z') {
                    if(i < s.length()-2 && s.charAt(i+2) == '=') i+=2;
                }
                if(ch2 == '-')
                    i++;
            }
            else if(ch == 'l' && ch2 == 'j') {
                i++;
            }
            else if(ch == 'n' && ch2 == 'j') {
                i++;
            }
            else if(ch == 's' && ch2 == '=' ) {
                i++;
            }
            else if(ch == 'z' && ch2 == '=') {
                 i++;
            }
            answer++;
        }
        if(i == s.length() - 1) answer++; 
        System.out.print(answer);
    }
}