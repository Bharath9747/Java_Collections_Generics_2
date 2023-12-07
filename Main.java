import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    static PriorityQueue<Integer> list = new PriorityQueue<>();

    public static void main(String[] args) {

        list.add(3);
        list.add(1);

        list.add(4);
        list.add(2);

        System.out.println("ArrayList : "+list);
//        list.remove(new Integer(2));
//        Integer a = 3;
//        removeElement(a);
//        list.remove(Integer.valueOf(2));
        list.poll();
        list.poll();
        System.out.println("ArrayList : "+list);
    }


//    private static void removeElement(Integer a) {
//        int l = list.size();
//        for(int i=0;i<l;i++)
//        {
//            if(list.get(i).equals(a))
//            {
//                l--;
//                list.remove(a);
//            }
//
//        }
//    }
/*
    private static void removeElement1(Integer a) {
        while(list.contains(a))
        {
            list.remove(a);
        }
    }
*/

}
