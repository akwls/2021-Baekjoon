import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] arr = new char[(int)(Math.pow(2, n) -1)];
        int[] index = new int[n];
        arr[1] = 'A';
        index[0] = 1;
        for(int i=0; i<n; i++) {
            char root = sc.next().charAt(0);
            char child1 = sc.next().charAt(0);
            if(child1 != '.') {
                arr[(index[root-65])*2] = child1;
                index[child1-65] = (index[root-65])*2;
            }
            char child2 = sc.next().charAt(0);
            if(child2 != '.') {
                arr[(index[root-65])*2+1] = child2;
                index[child2-65] = (index[root-65])*2+1;
            }
        }
        preOrder(arr, 1, arr.length);
        System.out.println();
        inOrder(arr, 1, arr.length);
        System.out.println();
        postOrder(arr, 1, arr.length);
    }
    public static void preOrder(char[] a, int num, int n) {
        if(num < n && a[num] != '\0') {
            System.out.print(a[num]);
            preOrder(a, num*2, n);
            preOrder(a, num*2+1, n);
        }
    }
    public static void inOrder(char[] a, int num, int n) {
        if(num < n && a[num] != '\0') {
            inOrder(a, num*2, n);
            System.out.print(a[num]);
            inOrder(a, num*2+1, n);
        }
    }
    public static void postOrder(char[] a, int num, int n) {
        if(num < n && a[num] != '\0') {
            postOrder(a, num*2, n);
            postOrder(a, num*2+1, n);
            System.out.print(a[num]);
        }
    }
}
