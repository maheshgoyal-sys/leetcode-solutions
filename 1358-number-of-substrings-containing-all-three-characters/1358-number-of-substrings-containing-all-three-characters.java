class Solution {
    public int numberOfSubstrings(String s) {
        int ans = 0;
        int j = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            // Expand window
            while (j < s.length() &&
                  !(map.getOrDefault('a', 0) > 0 &&
                    map.getOrDefault('b', 0) > 0 &&
                    map.getOrDefault('c', 0) > 0)) {

                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                j++;
            }

            if (map.getOrDefault('a', 0) > 0 &&
                map.getOrDefault('b', 0) > 0 &&
                map.getOrDefault('c', 0) > 0) {
                ans += s.length() - j + 1;
            }

            // Shrink window
            char ch = s.charAt(i);
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        return ans;
    }
}