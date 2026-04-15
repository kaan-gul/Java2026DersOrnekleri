import java.nio.charset.Charset;

public class o4 {
    public static void main(String[] args) {
        byte[] b_arr = { 116, 117, 114, 103, 97, 121 };
        Charset cs = Charset.defaultCharset();
        String str1 = new String(b_arr, cs);
        System.out.println(str1);

    }
}
