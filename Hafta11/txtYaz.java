import java.io.FileWriter;

public class txtYaz {
    public static void main(String[] args) {
        try {
            String dosyaAdi = "D:\\ogrenciler\\ogrenciler.txt";
            FileWriter fw = new FileWriter(dosyaAdi, true);
            fw.write("Ali" + "\n");
            fw.write("Ahmet" + "\n");
            fw.write("Ayşe" + "\n");
            fw.write("Elif" + "\n");
            fw.close();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
