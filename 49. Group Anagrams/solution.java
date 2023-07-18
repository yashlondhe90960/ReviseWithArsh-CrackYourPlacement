import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author : yashlondhe90960
 
*/


class Solution {
           public List<List<String>> groupAnagrams(String[] array) {
        List<List<String>> list = new ArrayList<List<String>>();

        if (array == null) {
            return list;
        }

        HashMap<String, List<String>> hm = new HashMap<>();
        for (String each: array) {		// M * (NlogN + N) => M * NlogN
            // sort-2
            char[] charArray = each.toCharArray();
            Arrays.sort(charArray);
            // String sorted = charArray.toString(); // @note: return: getClass().getName() + '@' + Integer.toHexString(hashCode())

            // String sorted = new String(charArray); // @note: correct way to convert char[] to string
            // String sorted = String.valueOf(charArray); // @note: correct way to convert char[] to string
            String sorted = String.copyValueOf(charArray); // @note: correct way to convert char[] to string



            if (hm.containsKey(sorted)) {
                hm.get(sorted).add(each);
            } else {
                ArrayList<String> al = new ArrayList<String>();

                al.add(each);
                hm.put(sorted, al);
            }
        }

        list.addAll(hm.values());

        return list;
    }

}