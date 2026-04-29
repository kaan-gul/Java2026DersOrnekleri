import java.io.File;

public class o13 {
    public static void main(String[] args) {
        File file = new File("d:\\ogrenciler");
        String[] liste1 = file.list();
        for (String string : liste1) {
            System.out.println(string);
        }
    }
}
