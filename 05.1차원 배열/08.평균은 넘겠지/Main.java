import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int nn;
		int[][] score = new int[n][];
		double sum;
		int cnt;
		double avg;
		for(int i=0; i<n; i++) {
			sum = 0;
			cnt = 0;
			avg = 0;
			nn = sc.nextInt();
			score[i] = new int[nn];
			for(int j=0; j<nn; j++) {
				score[i][j] = sc.nextInt();
				sum += score[i][j];
			}
			avg = sum/nn;
			for(int j=0; j<nn; j++) {
				if(score[i][j] > avg) cnt++;
			}
			System.out.printf("%.3f", (float)cnt/nn*100);
            System.out.println("%");
		}
	}
}