import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        while(n > 0) {
            arr.add(n%10);
            n /=10;
        }
        Object[] obj = arr.toArray();
        for(int i=0; i<obj.length; i++) {
            for(int j=0; j<obj.length-i-1; j++) {
                if((Integer)obj[j] < (Integer)obj[j+1]) {
                    Object tmp = obj[j];
                    obj[j] = obj[j+1];
                    obj[j+1] = tmp;
                }
            }

        }
        for(int i=0; i<obj.length; i++) {
            System.out.print(obj[i]);
        }
    }
}
