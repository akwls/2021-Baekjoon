import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] a = new int[26];
        for(int i=0; i<s.length(); i++) {
            a[Character.toUpperCase(s.charAt(i))-65]++;
        }
        int max = -1;
        char ch = '?';
        for(int i=0; i<26; i++) {
            if(a[i] > max) {
                max = a[i];
                ch = (char)(i+65);
            }
            else if(a[i] == max) ch = '?';
        }
        System.out.print(ch);
    }
}