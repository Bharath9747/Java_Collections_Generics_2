public class BucketMain {
    public static void main(String[] args) {
        Buckets mp = new Buckets();
        mp.put("Name","Bharath");
        mp.put("City","Chennai");
        mp.put("Col","MIT");
        System.out.println("Bucket 1");
        mp.bucket1.stream().forEach(x-> System.out.println(x[0]+" "+x[1]));
        System.out.println();
        System.out.println("Bucket 2");

        mp.bucket2.stream().forEach(x-> System.out.println(x[0]+" "+x[1]));
        System.out.println();
        System.out.println("Bucket 3");
        mp.bucket3.stream().forEach(x-> System.out.println(x[0]+" "+x[1]));
        //Duplicate
        mp.put("Col","Tuty");
        System.out.println("Bucket 1");
        mp.bucket1.stream().forEach(x-> System.out.println(x[0]+" "+x[1]));
        System.out.println();
        System.out.println("Bucket 2");

        mp.bucket2.stream().forEach(x-> System.out.println(x[0]+" "+x[1]));
        System.out.println();
        System.out.println("Bucket 3");
        mp.bucket3.stream().forEach(x-> System.out.println(x[0]+" "+x[1]));
    }
}
