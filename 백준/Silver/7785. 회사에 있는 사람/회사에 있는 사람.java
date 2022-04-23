import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Boolean> map = new HashMap<>();

        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++) {
            String[] str = sc.nextLine().split(" ");
            if(str[1].equals("enter")) {
                map.put(str[0], true);
            }
            else if(str[1].equals("leave")){
                map.remove(str[0]);
            }
        }
        
        List<String> list = Collections.list(Collections.enumeration(map.keySet()));

        Collections.sort(list, Collections.reverseOrder());
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
