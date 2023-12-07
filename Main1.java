import java.util.LinkedHashSet;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        String s = "abcdefssacde";
        Set<Character> se = new LinkedHashSet<>();
        for(Character ch:s.toCharArray())
            se.add(ch);
        String s1="";
        for(Character i : se)
            s1+=i;
        System.out.println(s1);
    }
}
