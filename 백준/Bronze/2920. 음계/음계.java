import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];

        String result = "";
        for(int i=0; i<8; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<8; i++) {
            if(arr[i] == arr[i-1]+1) {
                result = "ascending";
            }
            else if(arr[i] == arr[i-1]-1) {
                result = "descending";
            }
            else {
                result = "mixed";
                break;
            }
        }
        System.out.println(result);
    }
}
