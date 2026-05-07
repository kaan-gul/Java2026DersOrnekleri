import java.io.BufferedReader;
import java.io.FileReader;

public class dosyalama_1 {
    public static void main(String[] args) {
        verileriOku_V3();
    }

    public static void verileriOku_V1() {
        try {
            String dosyaAdi = "ogrenciNotlari.txt";
            BufferedReader oku = new BufferedReader(new FileReader(dosyaAdi));
            String satir = oku.readLine();
            while (satir != null) {
                System.out.println(satir);
                satir = oku.readLine();
            }
            oku.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    //sınıfı 3 olanların adını soyadını ekrana yazdır.
    public static void verileriOku_V2() {
        try {
            String dosyaAdi = "ogrenciNotlari.txt";
            BufferedReader oku = new BufferedReader(new FileReader(dosyaAdi));
            String satir = oku.readLine();
            while (satir != null) {
                //1882842196;Erdem;RAMAZAN;4;2.53;52;2.53;88
                String[] bilgiler=satir.split(";");
                //bilgiler[0] = ogrno
                //bilgiler[1] = ad
                //bilgiler[2] = soyad
                //bilgiler[3] = sınıf
                //bilgiler[4] = ort
                //bilgiler[5] = vize
                //bilgiler[6] = ort
                //bilgiler[7] = final
                if(bilgiler[3].equals("3")){
                    System.out.println(bilgiler[1]+ " "+bilgiler[2]);
                }
                
                satir = oku.readLine();
            }
            oku.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public static void verileriOku_V3() {
        try {
            String dosyaAdi = "ogrenciNotlari.txt";
            BufferedReader oku = new BufferedReader(new FileReader(dosyaAdi));
            String satir = oku.readLine();
            while (satir != null) {
                //1882842196;Erdem;RAMAZAN;4;2.53;52;2.53;88
                String[] bilgiler=satir.split(";");
                int sinif = Integer.parseInt(bilgiler[3]);
                //bilgiler[0] = ogrno
                //bilgiler[1] = ad
                //bilgiler[2] = soyad
                //bilgiler[3] = sınıf
                //bilgiler[4] = ort
                //bilgiler[5] = vize
                //bilgiler[6] = ort
                //bilgiler[7] = final
                if(sinif<3){//Integer.parseInt(bilgiler[3])<3
                    System.out.println(bilgiler[1]+ " "+bilgiler[2]);
                }
                
                satir = oku.readLine();
            }
            oku.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
