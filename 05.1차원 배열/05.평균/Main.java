import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        double[] score_re = new double[n];
        int max=0;
        double sum= 0;
        for(int i=0; i<n; i++) {
            score[i] = sc.nextInt();
            if(score[i] > max) max = score[i];
        }
        for(int i=0; i<n; i++) {
            score_re[i] = (double)score[i]/max*100;
            sum += score_re[i];
        }
        System.out.println(sum/n);
    }
}