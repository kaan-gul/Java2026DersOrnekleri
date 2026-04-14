public class o1 {
    public static void main(String[] args) {
        SayilariYaz();
        SayilariYaz();
        for(int i=0;i<3;i++)
            SayilariYaz();
    }
    //yazdıımız metotları deneyeblmek için
    //main ana metodunda deneyebilmek için
    //sol taraflarına public static erişim belirleyiciyi 
    // eklememiz gerekli =KURAL***
    public static void SayilariYaz() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
