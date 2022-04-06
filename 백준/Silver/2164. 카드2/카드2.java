import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            list.add(i);
        }
        int index = 0;
        for(int i=0; i<n-1; i++) {
            index++;
            list.add(list.get(index));
            index++;
        }
        System.out.println(list.get(index));
    }
}
