import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] name = new String[n];
        int[] date = new int[n];
        int[] month = new int[n];
        int[] year = new int[n];
        for(int i=0; i<n; i++) {
            name[i] = sc.next();
            date[i] = sc.nextInt();
            month[i] = sc.nextInt();
            year[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n-1-i; j++) {
                if(year[j] > year[j+1]) {
                    int tmp = year[j];
                    year[j] = year[j+1];
                    year[j+1] = tmp;
                    tmp = month[j];
                    month[j] = month[j+1];
                    month[j+1] = tmp;
                    tmp = date[j];
                    date[j] = date[j+1];
                    date[j+1] = tmp;
                    String s = name[j];
                    name[j] = name[j+1];
                    name[j+1] = s;
                }
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-1-i; j++) {
                if(month[j] > month[j+1] && year[j] >= year[j+1]) {
                    int tmp = year[j];
                    year[j] = year[j+1];
                    year[j+1] = tmp;
                    tmp = month[j];
                    month[j] = month[j+1];
                    month[j+1] = tmp;
                    tmp = date[j];
                    date[j] = date[j+1];
                    date[j+1] = tmp;
                    String s = name[j];
                    name[j] = name[j+1];
                    name[j+1] = s;
                }
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-1-i; j++) {
                if(date[j] > date[j+1] && month[j] >= month[j+1] && year[j] >= year[j+1]) {
                    int tmp = year[j];
                    year[j] = year[j+1];
                    year[j+1] = tmp;
                    tmp = month[j];
                    month[j] = month[j+1];
                    month[j+1] = tmp;
                    tmp = date[j];
                    date[j] = date[j+1];
                    date[j+1] = tmp;
                    String s = name[j];
                    name[j] = name[j+1];
                    name[j+1] = s;
                }
            }
        }
        System.out.println(name[n-1]);
        System.out.println(name[0]);
    }
}
