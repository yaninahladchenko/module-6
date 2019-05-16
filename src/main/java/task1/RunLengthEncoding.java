package task1;

public class RunLengthEncoding {
    public static void printRLE(String str)
    {
        int n = str.length();
        for (int i = 0; i < n; i++) {

            int count = 1;
            while (i < n - 1 &&
                    str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            System.out.print(count);
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args)
    {
        //String str = "AAABB";
        //String str = "AAAAaaaBBBBBB\12";
        String str = "AaaaBB2";

        printRLE(str);
    }
}
