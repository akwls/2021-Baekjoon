import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int left=1, right=1;
        int tmp = 1;
        int i = 0;
        for(i=0; tmp<n; i++) {
            if(i%4 == 0) {
                tmp++;
                right++;
                left=1;
            }
            else if(i%4 == 1) {
                tmp+=(i+1)/2;
                left = right;
                right = 1;
            }
            else if(i%4 == 2) {
                tmp++;
                left++;
                right=1;
            }
            else {
                tmp+=(i+1)/2;
                right = left;
                left = 1;
            }
        }
        if(tmp == n) {
            System.out.println(left+"/"+right);
        }
        else {
            if(i%4 == 2) {
                left -= tmp-n;
                right += tmp-n;
            }
            else if(i%4 == 0){
                left += tmp-n;
                right -= tmp-n;
            }
            System.out.println(left+"/"+right);
        }
    }
}
