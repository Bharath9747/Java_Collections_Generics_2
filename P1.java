import java.util.ArrayList;
import java.util.List;

public class P1 {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int j=4;
        List<Integer> inp = new ArrayList<>();
        for(int i=1;i<=20;i++)
        {
            if(i%j==0)
            {
                list.add(inp);
                inp= new ArrayList<>();
            }
            inp.add(i);
        }
        int len = list.size(),len1=0;
        for(int i=0;i<len;i++)
            len1=Math.max(len1,list.get(i).size());
        for(int i=0;i<len1;i++)
        {
            int s=0;
            for( j=0;j<len;j++)
            {
                if(list.get(j).size()>i)
                    s+=list.get(j).get(i);
            }
            res.add(s);
        }
        list.stream().forEach(x-> System.out.println(x));
        System.out.println(res);
    }
}
