package task1;

public class RunLengthEncoding {
    public static void printRLE(String str)
    {
        for (int i = 0; i < str.length(); i++) {

            int count = 1;
            while (i < str.length() - 1 &&
                    str.charAt(i) == str.charAt(i + 1) )
             {
                count++;
                i++;
            }
            if (str.charAt(i) != '\\' &&
                    !Character.isDigit(str.charAt(i))) {
                System.out.print(count);
                System.out.print(str.charAt(i));
            }

            if (Character.isDigit(str.charAt(i))) {
                System.out.print("\\"+str.charAt(i));
            }
        }

    }

    public static void main(String[] args)
    {
        //String str = "AAABB";
        //String str = "AAAAaaaBBBBBB\12";
        String str = "AaaaBB2213\\5";

        printRLE(str);
    }
}
