import java.util.Arrays;

/**
 * @author : yashlondhe90960
 * 
 */

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int la = a.length(), lb = b.length(), c = 0;
        int l = la > lb ? la : lb;
        for (int i = 1; i <= l; i++) {
            int v = c;
            if (i <= la && a.charAt(la - i) == '1')
                v++;
            if (i <= lb && b.charAt(lb - i) == '1')
                v++;
            c = v > 1 ? 1 : 0;
            res.append(v % 2);
        }
        if (c > 0)
            res.append(c);
        return res.reverse().toString();
    }
}