import java.util.HashMap;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {
        Map<Character,Integer> hm = new HashMap<>();
        String s = "aljdkjiejfdiejfiejf";
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
//            if (hm.containsKey(ch))
//                hm.put(ch, hm.get(ch) + 1);
//            else
//                hm.put(ch, 1);
        }
        System.out.println(hm);
    }
}
