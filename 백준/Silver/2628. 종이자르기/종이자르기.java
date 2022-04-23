import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Integer> arrX = new ArrayList<Integer>();
        ArrayList<Integer> arrY = new ArrayList<Integer>();
        arrX.add(0);
        arrY.add(0);

        for(int i=0; i<n; i++) {
            int pos = sc.nextInt();
            int cur = sc.nextInt();
            if(pos == 1) {
                arrX.add(cur);
            }
            else {
                arrY.add(cur);
            }
        }
        Collections.sort(arrX);
        Collections.sort(arrY);
        arrX.add(x);
        arrY.add(y);

        int max_x = 0;
        int max_y = 0;

        for(int i=1; i<arrX.size(); i++) {
            if(arrX.get(i)-arrX.get(i-1) > max_x) {
                max_x = arrX.get(i)-arrX.get(i-1);
            }
        }
        for(int i=1; i<arrY.size(); i++) {
            if(arrY.get(i)-arrY.get(i-1) > max_y) {
                max_y = arrY.get(i)-arrY.get(i-1);
            }
        }
        if(max_x * max_y == 0) {
            System.out.println(x*y);
        }
        else System.out.println(max_x * max_y);
    }
}
