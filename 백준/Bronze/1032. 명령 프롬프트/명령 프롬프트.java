import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        String answer = str;

        for(int i=0; i<n-1; i++) {
            answer = "";
            String tmp = sc.next();
            for(int j=0; j<tmp.length(); j++) {
                if(str.charAt(j) != tmp.charAt(j)) {
                    answer += "?";
                }
                else {
                    answer += Character.toString(tmp.charAt(j));
                }
            }
            str = answer;
        }
        System.out.println(answer);

    }
}
