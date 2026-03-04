public class o17 {
    public static void main(String[] args) {
        int sayi1 = 100;
        int kalan =0;
        while (sayi1>=0){
            kalan = sayi1 % 2;
            if(kalan==1)
                System.out.println(sayi1);
            sayi1--;
        } 
    }
}
