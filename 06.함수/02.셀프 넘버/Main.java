public class Main {
    static int[] check = new int[10001];
    public static void main(String args[]) {
        for (int i = 1; i <= 10000; i++) {
		d(i);
	}
	for (int i = 1; i < 10000; i++) {
		if (check[i] == 0) System.out.println(i);
	}
    }
    static int d(int n) {
	    int nn = n;
	    int result = n;
	        while (nn > 0) {
		        result += nn % 10;
		        nn /= 10;
	        }
	        if (result < 10000) check[result] = 1;
	        return result;
        }
    }