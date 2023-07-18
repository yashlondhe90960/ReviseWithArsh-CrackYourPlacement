import java.util.Arrays;

/**
 * @author : yashlondhe90960
 
*/


class Solution {
 
     public String reverseWords(String s) {

            if (s == null || s.length() == 0) {
                return s;
            }

            int storeIndex = 0, n = s.length();
            StringBuilder sb = new StringBuilder(s).reverse();
            for (int i = 0; i < n; ++i) {
                if (sb.charAt(i) != ' ') {
                    if (storeIndex != 0) sb.setCharAt(storeIndex++, ' ');
                    int j = i;
                    while (j < n && sb.charAt(j) != ' ') sb.setCharAt(storeIndex++, sb.charAt(j++));
                    String t = new StringBuilder(sb.substring(storeIndex - (j - i), storeIndex)).reverse().toString();
                    sb.replace(storeIndex - (j - i), storeIndex, t);
                    i = j;
                }
                // else, skip space
            }
            sb.setLength(storeIndex);
            return sb.toString();

        }
    }