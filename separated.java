import java.util.*;
public class separated {
    public static void main(String args[]) {
        List<String> list = new ArrayList<>(Arrays.asList("Geeks", "ForGeeks", "GeeksForGeeks"));
        System.out.println("List of String: " + list);
        String result = String.join(",", list);
        System.out.println("Comma separated String: " + result);
    }
}