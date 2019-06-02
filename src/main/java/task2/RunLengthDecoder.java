package task2;


public class RunLengthDecoder {
    /*public static void printRLE(String str)
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
*/

   public static void decompressString(String str) {
        int count = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                count = count * 10 + c - '0';
                //System.out.print(count);
                //System.out.print(str.charAt(i));
            } else {
                if (count == 0) {
                    count = 1;
                }
                while (count > 0) {
                    result.append(c);
                    count--;
                    //System.out.print(count);
                    //System.out.print(str.charAt(i));
                }
            }
        }

    }

    public static void main(String[] args)
    {
        String str = "3A2B";

        decompressString(str);
        //return result.toString();
    }
}
