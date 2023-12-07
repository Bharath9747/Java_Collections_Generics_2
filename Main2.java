import java.util.*;

//Wrong One
public class Main2 {
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),c=0;
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            String s = sc.nextLine();
            check(list,s);
            System.out.println("After Input "+i+1+" : ");
            list.stream().forEach(x-> System.out.println(x));
        }

    }

    private static void check(List<String> list, String s) {
        list.add(s);
        Set<String> st = new HashSet<>(list);

        System.out.println("Output "+st.size());

    }
}
