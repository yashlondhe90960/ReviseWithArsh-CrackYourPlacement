import java.util.Arrays;

/**
 * @author : yashlondhe90960
 
*/
// Here, we will use two pointer approach by taking firstIndex and lastIndex.
// Iterate through the string by incrementing the leftIndex and decrementing the rightIndex.
// If the two characters on leftIndex and rightIndex are not equal, then delete the character(done using isCharacterDeleted = true).
// Now, iterate through rest of the remaining characters
// if two characters are found which are not equal again, then return false
// return true after whole iteration of the string.

class Solution {
    
	public boolean validPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1, false);
    }
    
    public boolean isPalindrome(final String s, int leftIndex, int rightIndex, final boolean isCharacterDeleted){
        
        while(leftIndex < rightIndex){
            
            if(s.charAt(leftIndex) != s.charAt(rightIndex)){
                
                if(isCharacterDeleted){
                    return false;
                }
                
				// isPalindrome(s, leftIndex + 1, rightIndex, true) for cases like "ececabbacec" 
				// isPalindrome(s, leftIndex, rightIndex - 1, true) for cases like "abccbab"
                return isPalindrome(s, leftIndex + 1, rightIndex, true) || isPalindrome(s, leftIndex, rightIndex - 1, true);
            }
            
            ++leftIndex;
            --rightIndex;
            
        }
		
        return true;
    }
}
