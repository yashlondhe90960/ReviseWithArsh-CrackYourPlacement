import java.util.Arrays;
import java.util.Stack;

/**
 * @author : yashlondhe90960
 
*/


class Solution {
    public int calculate(String s) {
         Stack<Integer> st = new Stack<>();

    int val = 0;
    char sign = '+';
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);

      if (Character.isDigit(ch)) {
        val = val * 10 + (ch - '0');
      }
      if (i + 1 == s.length() || ch == '+' || ch == '-' || ch == '*' || ch == '/') {
        if (sign == '+') {
          st.push(val);
        } else if (sign == '-') {
          st.push(-val);
        } else if (sign == '*') {
          st.push(st.pop()*val);
        } else if (sign == '/') {
          st.push(st.pop() / val);
        }
        val = 0;
        sign = ch;
      }
    }

    int sum = 0;
    while (st.size() > 0) {
      sum += st.pop();
    }

    return sum;
  }
}