import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.next();
        }

        String answer = "";
        int sum = 0;

        int[] count = new int[4];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                char ch = arr[j].charAt(i);
                switch (ch) {
                    case 'A' : count[0]++; break;
                    case 'C' : count[1]++; break;
                    case 'G' : count[2]++; break;
                    case 'T' : count[3]++; break;
                }
            }
            int max = 0;
            int index = 0;
            for(int j=0; j<4; j++) {
                if(max < count[j]) {
                    max = count[j];
                    index = j;
                }
                count[j] = 0;
            }

            switch (index) {
                case 0 : answer+="A"; break;
                case 1 : answer+="C"; break;
                case 2 : answer+="G"; break;
                case 3 : answer+="T"; break;
            }
            sum += (n-max);
        }
        System.out.println(answer);
        System.out.println(sum);
    }
}
