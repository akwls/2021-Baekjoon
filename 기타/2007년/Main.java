import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();

        int arr[] = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] date = new String[] {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        int t = day - 1;
        while(month > 1) {
            month--;
            t += arr[month-1];

        }
        System.out.println(date[t%7]);
    }
}
