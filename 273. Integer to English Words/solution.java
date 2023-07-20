import java.util.Arrays;

/**
 * @author : yashlondhe90960
 * 
 */

class Solution {
    // Arrays to store the words for numbers less than 20, multiples of ten, and
    // thousands.
    private final String[] LESS_THAN_20 = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
            "Nineteen" };
    private final String[] TENS = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
            "Ninety" };
    private final String[] THOUSANDS = { "", "Thousand", "Million", "Billion" };

    // The main function that converts the given number to words.
    public String numberToWords(int num) {
        if (num == 0)
            return "Zero";

        int i = 0;
        String words = "";

        // The loop handles the number in groups of three digits at a time.
        while (num > 0) {
            // Extract the last three digits and convert them to words using the helper
            // function.
            if (num % 1000 != 0)
                words = helper(num % 1000) + THOUSANDS[i] + " " + words;
            // Move to the next group of three digits.
            num /= 1000;
            i++;
        }

        // Return the final words string with leading and trailing spaces removed.
        return words.trim();
    }

    // Helper function to convert a number less than 1000 to words.
    private String helper(int num) {
        if (num == 0)
            return "";
        else if (num < 20)
            return LESS_THAN_20[num] + " "; // If the number is less than 20, directly return the corresponding word.
        else if (num < 100)
            return TENS[num / 10] + " " + helper(num % 10); // If the number is less than 100, return the word for tens
                                                            // place + the word for ones place.
        else
            return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100); // If the number is greater than or equal
                                                                              // to 100, return the word for hundreds
                                                                              // place + the words for the remaining two
                                                                              // digits.
    }
}
