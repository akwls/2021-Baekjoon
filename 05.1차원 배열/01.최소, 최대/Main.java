import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] a = new int[length];
        for(int i=0; i<length; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0], min = a[0];
        for(int i= 0; i<length; i++) {
            if(a[i] > max) max = a[i];
            if(a[i] < min) min = a[i];
        }
        System.out.println(min +" "+max);
    }
}