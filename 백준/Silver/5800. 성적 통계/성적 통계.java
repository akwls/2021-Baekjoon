import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int length = sc.nextInt();
            int[] score = new int[length];
            for(int j=0; j<length; j++) {
                score[j] = sc.nextInt();
            }
            int max = 0;
            int min = 100;
            for(int j=0; j<length; j++) {
                if(score[j] > max) max = score[j];
                if(score[j] < min) min = score[j];
            }
            for(int j=0; j<length; j++) {
                for(int k=0; k<length-1-j; k++) {
                    if(score[k] < score[k+1]) {
                        int tmp = score[k];
                        score[k] = score[k+1];
                        score[k+1] = tmp;
                    }
                }
            }
            int gap = 0;
            for(int j=0; j<length-1; j++) {
                if(score[j] - score[j+1] > gap) {
                    gap = score[j] - score[j+1];
                }
            }
            System.out.println("Class " + (i+1));
            System.out.println("Max " + max + ", Min " + min + ", Largest gap " + gap);
        }
    }
}
