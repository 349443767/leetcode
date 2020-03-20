import java.util.*;

/**
 * @author hongwei
 * @Title:
 * @Package
 * @Description:
 * @date 2020/3/19 上午11:07
 */
public class LongestPalindrome {

    public int longestPalindrome(String s) {
        if (s.length() > 1010) {
            throw new RuntimeException("s leng to long");
        }
        HashMap<String, Integer> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            String subStr = s.substring(i, i + 1);
            if (map.get(subStr) != null) {
                map.put(subStr, map.get(subStr) + 1);
            } else {
                map.put(subStr, 1);
            }
        }

        if (map.size() == 1) {
            return s.length();
        }

        boolean isOdd = false;
        HashMap<String, Integer> map2 = new HashMap();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                map2.put(entry.getKey(), entry.getValue());
            } else {
                isOdd = true;
                if (entry.getValue() > 2) {
                    map2.put(entry.getKey(), entry.getValue() - 1);
                }
            }
        }

        int length = isOdd ? 1 : 0;
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            length += entry.getValue();
        }
        return length;
    }

    public static void main(String[] args) {
        String str = "abccccdd";
        String str1 = "bb";
        String str2 = "ccc";
        String str3 = "ccccdddaaa";
        System.out.println(new LongestPalindrome().longestPalindrome(str));
        System.out.println(new LongestPalindrome().longestPalindrome(str1));
        System.out.println(new LongestPalindrome().longestPalindrome(str2));
        System.out.println(new LongestPalindrome().longestPalindrome(str3));
    }
}
