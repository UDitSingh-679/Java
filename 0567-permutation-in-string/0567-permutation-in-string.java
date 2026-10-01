class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count = new int[26];

        // s1 ki frequency
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
        }

        int windowSize = s1.length();

        for (int i = 0; i < s2.length(); i++) {

 
            count[s2.charAt(i) - 'a']--;

            if (i >= windowSize) {
                count[s2.charAt(i - windowSize) - 'a']++;
            }

  
            boolean same = true;

            for (int j = 0; j < 26; j++) {
                if (count[j] != 0) {
                    same = false;
                    break;
                }
            }

            if (same) {
                return true;
            }
        }

        return false;
    }
}