public class Stringy {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println(str1.equals(str2));

        StringBuffer str3 = new StringBuffer("OKOKOKOK");
        str3.append(" NIbba Baun");
        System.out.println(str3);
    }
}
