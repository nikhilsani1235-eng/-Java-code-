public class StringLengthRecursion {

    static int length(String str) {
        if (str.equals(""))
            return 0;
        else
            return 1 + length(str.substring(1));
    }

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println("Length of string = " + length(s));
    }
}