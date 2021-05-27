import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int check = 0;
        for (int i = 'a'; i <= 'z'; i++) {
		    check = 0;
		    for (int j = 0; j < s.length(); j++) {
			    if (i == s.charAt(j)) {
				    System.out.print(j+" ");
				    check = 1;
				    break;
			    }
		    }
		if (check == 0) System.out.print("-1 ");
	    }
    }
}