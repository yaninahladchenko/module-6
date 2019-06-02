package task2;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class RLE {
    public static String encode(String str) {
        StringBuffer dest = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i+1 < str.length() && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            /*if (str.charAt(i) != '\\' &&
                    !Character.isDigit(str.charAt(i))) {
                System.out.print(count);
                System.out.print(str.charAt(i));
            }*/

            /*if (Character.isDigit(str.charAt(i))) {
                System.out.print("\\"+str.charAt(i));
            }*/
            dest.append(count);
            dest.append(str.charAt(i));
        }
        return dest.toString();
    }

    public static String decode(String str) {
        StringBuffer dest = new StringBuffer();
        Pattern pattern = Pattern.compile("[0-9]+|[a-zA-Z]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            int number = Integer.parseInt(matcher.group());
            matcher.find();
            while (number-- != 0) {
                dest.append(matcher.group());
            }
        }
        return dest.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("AAABB"));
        System.out.println(encode("AAAAaaaBBBBBB\\12"));
        System.out.println(encode("AaaaBB2"));

        System.out.println(decode("3A2B"));

    }
}

