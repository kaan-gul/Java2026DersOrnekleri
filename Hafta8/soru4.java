import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        System.out.println(enBuyukSayi());
    }

    public static int enBuyukSayi(){
        Scanner giris=new Scanner(System.in);
        int siradakiSayi=0;
        int EBS=0;

        for(int i=0;i<10;i++){
            System.out.println("Sayı: ");
            siradakiSayi = giris.nextInt();

            if(i==0)//ilk sayı girişi
                EBS = siradakiSayi;
            if(siradakiSayi>EBS)
                EBS = siradakiSayi;
        }

        return EBS;
    }
}
