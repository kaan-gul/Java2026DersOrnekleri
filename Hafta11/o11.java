import java.io.File;

public class o11 {
    public static void main(String[] args) {
        try {
            File file = new File("d:\\ogrenciler\\ogrenciBilgileri.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
