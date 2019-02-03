package algojava;
import java.util.Iterator;

public class Main {

    public static void test(
        RedBlackBST<String, Integer> st, 
        String start, String end
    ) {
        Iterator<String> it = st.myKeys(start, end);

        System.out.printf(
            "Searching keys from start: %s to end: %s\n", 
            start, end
        );

        while(it.hasNext())
            System.out.printf("%s ", it.next());

        System.out.println();
    }

    /**
     * Unit tests the {@code RedBlackBST} data type.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) { 
        RedBlackBST<String, Integer> st = new RedBlackBST<String, Integer>();
        for (int i = 0; !StdIn.isEmpty(); i++) {
            String key = StdIn.readString();
            st.put(key, i);
        }
        for (String s : st.keys())
            StdOut.println(s + " " + st.get(s));
        StdOut.println();

        test(st, "A", "Z");
        test(st, "R", "X");
        test(st, "A", "C");
        test(st, "C", "A");
        test(st, "A", "Z");
        test(st, "C", "R");

    }
}