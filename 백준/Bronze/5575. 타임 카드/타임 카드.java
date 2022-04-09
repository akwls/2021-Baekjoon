import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start_hour = 0, start_min = 0, start_sec = 0;
        int end_hour = 0, end_min = 0, end_sec = 0;
        for(int i=0; i<3; i++) {
            start_hour = sc.nextInt();
            start_min = sc.nextInt();
            start_sec = sc.nextInt();
            end_hour = sc.nextInt();
            end_min = sc.nextInt();
            end_sec = sc.nextInt();

            if(end_sec - start_sec < 0) {
                end_sec += 60;
                end_min--;
            }
            if(end_min - start_min < 0) {
                end_min += 60;
                end_hour--;
            }
            System.out.print(end_hour-start_hour + " ");
            System.out.print(end_min-start_min + " ");
            System.out.print(end_sec-start_sec);
            System.out.println();
        }

    }
}
