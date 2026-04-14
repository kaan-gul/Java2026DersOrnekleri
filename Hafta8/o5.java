public class o5 {
    public static void main(String[] args) {
        topla(5, 10);
        topla(10,20,30);
        topla(10,30,20.5);
    }
    public static void topla(int s1,int s2){
        int toplam;
        toplam = s1+s2;
        System.out.println(toplam);
    }
    public static void topla(int s1,int s2,int s3){
        int toplam;
        toplam = s1+s2+s3;
        System.out.println(toplam);
    }

    public static void topla(int s1,int s2,double s3){
        double toplam;
        toplam = s1+s2+s3;
        System.out.println(toplam);
    }


}
