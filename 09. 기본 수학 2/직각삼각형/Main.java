import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int arr[] = new int[3];
            for(int i=0; i<3; i++) {
                arr[i] = sc.nextInt();
            }
            if(arr[0] == 0) break;
            for(int i=0; i<2; i++) {
                for(int j=0; j<2-i; j++) {
                    if(arr[j] < arr[j+1]) {
                        int tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;
                    }
                }
            }
            if(Math.pow(arr[0], 2) == Math.pow(arr[1], 2) + Math.pow(arr[2], 2)) {
                System.out.println("right");
            }
            else {
                System.out.println("wrong");
            }
        }
    }
}