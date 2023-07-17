import java.util.Arrays;

/**
 * @author : yashlondhe90960
 
*/


// Initialize frequency maps for characters in P and current window
        Map<Character, Integer> freqP = new HashMap<>();
        Map<Character, Integer> freqWindow = new HashMap<>();

        // Calculate frequency of characters in P
        for (char ch : P.toCharArray()) {
            freqP.put(ch, freqP.getOrDefault(ch, 0) + 1);
        }

        int left = 0; // left pointer
        int right = 0; // right pointer
        int matchedCount = 0; // number of characters matched
        int minLength = Integer.MAX_VALUE; // minimum window length
        int start = -1; // window start index

        while (right < S.length()) {
            char rightChar = S.charAt(right);
            freqWindow.put(rightChar, freqWindow.getOrDefault(rightChar, 0) + 1);

            // If the current character is part of P and its frequency in the window is less than or equal to its frequency in P
            if (freqP.containsKey(rightChar) && freqWindow.get(rightChar) <= freqP.get(rightChar)) {
                matchedCount++;
            }

            // If all characters of P are matched
            while (matchedCount == P.length()) {
                // Update the minimum window length
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                char leftChar = S.charAt(left);
                freqWindow.put(leftChar, freqWindow.get(leftChar) - 1);

                // If the character at the left pointer was part of P and its frequency in the window becomes less than its frequency in P
                if (freqP.containsKey(leftChar) && freqWindow.get(leftChar) < freqP.get(leftChar)) {
                    matchedCount--;
                }

                left++; // Slide the window
            }

            right++; // Expand the window
        }

        if (start == -1) {
            return "-1"; // No valid window found
        }

        return S.substring(start, start + minLength);
    }