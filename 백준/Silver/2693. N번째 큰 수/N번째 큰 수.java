import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[10];
        for(int k=0; k<n; k++) {
            for(int i=0; i<10; i++) {
                arr[i] = sc.nextInt();
            }
            for(int i=0; i<10; i++) {
                for(int j=0; j<9-i; j++) {
                    if(arr[j] < arr[j+1] ) {
                        int tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;
                    }
                }
            }
            System.out.println(arr[2]);
        }


    }
}
