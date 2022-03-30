import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] score = new int[8];
        int[] index = new int[8];
        for(int i=0; i<8; i++) {
            score[i] = sc.nextInt();
            index[i] = i+1;
        }
        for(int i=0; i<7; i++) {
            for(int j=0; j<7-i; j++) {
                if(score[j] < score[j+1]) {
                    int tmp = score[j];
                    score[j] = score[j+1];
                    score[j+1] = tmp;
                    tmp = index[j];
                    index[j] = index[j+1];
                    index[j+1] = tmp;
                }
            }
        }
        int sum = 0;
        String answer = "";
        for(int i=0; i<4; i++) {
            for(int j=0; j<4-i; j++) {
                if(index[j] > index[j+1]) {
                    int tmp = index[j];
                    index[j] = index[j+1];
                    index[j+1] = tmp;
                }
            }
        }
        for(int i=0; i<5; i++) {
            sum += score[i];
            answer += index[i] + " ";
        }
        System.out.println(sum);
        System.out.println(answer);
    }
}
