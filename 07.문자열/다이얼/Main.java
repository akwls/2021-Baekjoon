import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int answer = 0;
        
        sc.close();
        for(int i=0; i<s.length(); i++) {
            int tmp = 0;
            char ch = s.charAt(i);
            switch(ch) {
                case 'A' : case 'B' : case 'C' : tmp = 2; break;
                case 'D': case 'E':case 'F' : tmp = 3; break;
                case 'G': case 'H': case 'I': tmp = 4; break;
                case 'J': case 'K': case 'L': tmp = 5; break;
                case 'M' : case 'N': case 'O' : tmp = 6; break;
                case 'P' : case 'Q': case 'R': case 'S' : tmp = 7; break;
                case 'T': case 'U' : case 'V' : tmp = 8; break;
                case 'W': case 'X' : case 'Y' : case 'Z' : tmp = 9; break;
            }
            answer += tmp +1;
        }
        System.out.println(answer);
    }
}