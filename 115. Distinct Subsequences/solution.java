import java.util.Arrays;

/**
 * @author : yashlondhe90960
 
*/


//dp solution 
class Solution {
    public int numDistinct(String s, String t) {
       int m = s.length(); // Length of string s
        int n = t.length(); // Length of string t
        int[][] dp = new int[m + 1][n + 1]; // Create a 2D array to store the dynamic programming results

        // Initialize the base case for when t is an empty string (empty string is a subsequence of any string)
        for (int i = 0; i <= m; ++i) {
            dp[i][0] = 1;
        }

        // Iterate through each character of s
        for (int i = 1; i <= m; ++i) {
            // Iterate through each character of t
            for (int j = 1; j <= n; ++j) {
                // dp[i][j] represents the number of distinct subsequences of s[0...i-1] that equals t[0...j-1]

                // Add the number of subsequences without including s[i-1] if it doesn't match t[j-1]
                dp[i][j] += dp[i - 1][j];

                // If s[i-1] matches t[j-1], add the number of subsequences including s[i-1]
                dp[i][j] += (s.charAt(i - 1) == t.charAt(j - 1)) ? dp[i - 1][j - 1] : 0;
            }
        }

        // The final answer is the number of distinct subsequences of s that equals t
        return dp[m][n]; 
    }
}



//slightly optimized(with iterations)
class Solution {
    public int numDistinct(String s, String t) {
        if (s == null || t == null)     return 0;
	        if (s.length() < t.length())    return 0;

	        int TLength = t.length();
	        int SLength = s.length();

	        int[][] dp = new int[TLength + 1][SLength + 1];
	        dp[0][0] = 1;

	        for (int i = 1; i <= SLength; i++) {
	            dp[0][i] = 1;
	        }
	        for (int i = 1; i <= TLength; i++) {
	            dp[i][0] = 0;
	        }

	        for (int i = 1; i <= TLength; i++) {
	            for (int j = 1; j <= SLength; j++) {
	                if (t.charAt(i - 1) == s.charAt(j - 1)) {
	                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j - 1];
	                } else {
	                    dp[i][j] = dp[i][j - 1];
	                }
	            }
	        }

	        return dp[TLength][SLength];

    }
}











//tle exceeded
class Solution_recursion {
    public int numDistinct(String s, String t) {
        if(s.length()==0){
            return t.length() == 0 ? 1:0;

        }
        if(t.length() == 0){
            return s.length() >= 0?1:0;
        }
        if(s.length() < t.length()){
            return 0;
        }

        int sum = 0;
        if(s.charAt(0) == t.charAt(0)){
            sum += numDistinct(s.substring(1), t.substring(1));

        }
        sum += numDistinct(s.substring(1),t);

        return sum;
        
    }
}

