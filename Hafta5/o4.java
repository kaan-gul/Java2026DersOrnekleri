public class o4 {
    public static void main(String[] args) {
        int kalan2,kalan5;
        int adet = 0;
        for (int i = 1; i <=1000; i++) {
            kalan2 = i % 2;
            kalan5 = i % 5;
            if(kalan2!=0 && kalan5==0)
                adet++;
        }
        System.out.println(adet);
    }
}
