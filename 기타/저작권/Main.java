import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int songs = sc.nextInt();
        int avg = sc.nextInt();

        if(songs > 1) {
            System.out.println(songs * (avg-1) + 1);
        }
        else {
            System.out.println(songs * avg);
        }
    }
}
