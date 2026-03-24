class Solution {
    public int rearrangeCharacters(String s, String target) {
        char[] chars = new char[26];
        char[] targetArr = target.toCharArray();
        int count = 0;

        for (char ch : s.toCharArray()) {
            chars[ch - 'a']++;
        }

        while (true) {

            for (char ch : targetArr) {

                if (chars[ch - 'a'] == 0) {
                    return count;
                }

                chars[ch - 'a']--;
            }

            count++;
        }
    }
}