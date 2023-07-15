import java.util.Arrays;

/**
 * @author : yashlondhe90960
 
*/


public class Solution {
    public boolean isValid(String s) {
      //Stack solution

      //create a stack
      Stack<Character> st = new Stack<Character>();
      for( char it : s.toCharArray()){
       
       if( it =='(' || it == '[' || it == '{')
       st.push(it);
       else{
           if(st.isEmpty()) return false;
           char ch = st.pop();
           if((it == ')' && ch == '(' ) || (it == ']' && ch == '[') || (it == '}' && ch == '{'))
           continue;
           else return false;


       }


      }
      return st.isEmpty();
      
    }
}


  // String approach
        // int length;
    
        // do {
        //     length = s.length();
        //     s = s.replace("()", "").replace("{}", "").replace("[]", "");
        // } while(length != s.length());
    
        // return s.length() == 0;