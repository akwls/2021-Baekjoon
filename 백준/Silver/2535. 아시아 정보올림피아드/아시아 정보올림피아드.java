import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] country = new int[n];
        int[] number = new int[n];
        int[] score = new int[n];
        for(int i=0; i<n; i++) {
            country[i] = sc.nextInt();
            number[i] = sc.nextInt();
            score[i] = sc.nextInt();
        }

        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-1-i; j++) {
                if(score[j] < score[j+1]) {
                    int tmp = score[j];
                    score[j] = score[j+1];
                    score[j+1] = tmp;
                    tmp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = tmp;
                    tmp = country[j];
                    country[j] = country[j+1];
                    country[j+1] = tmp;
                }
            }
        }
        System.out.println(country[0]+" "+number[0]);
        System.out.println(country[1]+" "+number[1]);
        if(country[0] != country[1]) {
            System.out.println(country[2]+" "+number[2]);
        }
        else {
            for(int j=2; j<n; j++) {
                if(country[j] == country[0]) {
                    continue;
                }
                else {
                    System.out.println(country[j]+" "+number[j]);
                    break;
                }
            }
        }
    }
}
