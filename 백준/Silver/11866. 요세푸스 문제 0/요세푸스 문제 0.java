import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        String[] result = new String[n];
        int answerIdx =0;

        for(int i=0; i<n; i++) {
            arr[i] = i+1;
        }
        int index = -1;
        for(int i=0; i<n; i++) {
            int tmp = 1;
            int j = 1;
            for(j=1; tmp<=k; j++) {
                if(arr[(index+j)%n] != 0) {
                    tmp++;
                }
            }
            index = (index+j-1)%n;
            result[answerIdx] = Integer.toString(arr[index]);
            arr[index] = 0;
            answerIdx++;


        }
        System.out.print("<");
        System.out.print(String.join(", ", result));
        System.out.print(">");
    }
}
