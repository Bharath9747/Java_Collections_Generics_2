import java.util.ArrayList;
import java.util.List;

public class Buckets {
    List<String[]> bucket1 = new ArrayList<>();
    List<String[]> bucket2= new ArrayList<>();
    List<String[]> bucket3 = new ArrayList<>();

    public void check(String Key,String Value,List<String[]> bucket){
        for(int i=0;i<bucket.size();i++)
            if(bucket.get(i)[0].equals(Key)) {
                bucket.set(i, new String[]{Key, Value});
                return;
            }
        bucket.add(new String[]{Key,Value});
    }
    public void put(String Key,String Value)
    {
        int keyHash = Key.hashCode()%3;
        switch (keyHash)
        {
            case 0: check(Key,Value,bucket1);
                break;
                case 1: check(Key,Value,bucket2);
                break;
            default: check(Key,Value,bucket3);
        }
    }
    public String get(String Key){
        int keyHash = Key.hashCode()%3;
        switch (keyHash)
        {
            case 0: return search(Key,bucket1);

            case 1: return search(Key,bucket2);
            default: return search(Key,bucket3);
        }
    }
    private String search(String Key, List<String[]> bucket){
        for(String[] s:bucket)
            if(s[0].equals(Key))
                return s[1];
        return null;
    }
}
