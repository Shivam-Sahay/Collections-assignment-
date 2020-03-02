import java.util.*;

public class DistString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = new String(scanner.next());
        int number = distinct(string);
        System.out.println(number);
    }

    public static int distinct(String string) {
        char[] chars = string.toCharArray();
        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0; i < chars.length; i++) {
            set.add(chars[i]);
        }
        return set.size();
    }
}
