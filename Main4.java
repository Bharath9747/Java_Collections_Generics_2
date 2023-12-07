import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(15);
        list.add(11);
        list.add(7);
        int s=13;
        for(Integer i: list)
        {
            if(list.contains((s-i)))
            {
                System.out.println("["+i+","+(s-i)+"]");

            }
        }
    }
}
