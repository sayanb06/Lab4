/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * doing dank memes.
 */
public class ReclamationProject {
    /**
     * creating main to run program and to reupdate stylecheck.
     * @param args for dank memes
     */

    public static void main(final String[] args) {
        System.out.print("hi");
    }

    /**
     * LCS.
     * @param a for dank memes
     * @param b for dank memes
     * @return idk
     */
    public static String doit(final String a, final String b) {
        if (a.length() > b.length()) {
            String c = a;
            a = b;
            b = c;
        }
        String r = ""; // I love the ternary operator!
        /*
         * For loop with i
         */
        for (int i = 0; i < a.length(); i++) {
            for (int j = a.length() - i; j > 0; j--) {
                for (int k = 0; k < b.length() - j; k++) {
                    if (a.regionMatches(i, b, k, j) && j > r.length()) {
                        r = a.substring(i, i + j);  // Do it!
                    }
                        }
                } // Ah yeah
        }
        return r;
       }
}
