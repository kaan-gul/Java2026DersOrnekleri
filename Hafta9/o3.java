public class o3 {
    public static void main(String[] args) {
        String str2 = "abc";
        System.out.println(str2);

        char[] karakterler = { 'a', 'b', 'c' };
        String str3 = new String(karakterler);
        System.out.println(str3);

        byte[] b_arr = { 116, 117, 114, 103, 97, 121 };
        String str1 = new  String(b_arr);
        System.out.println(str1);

        for (char i = 'a'; i < 'z'; i++) {
            System.out.println(i + " " + (byte) i);
        }

    }
}
