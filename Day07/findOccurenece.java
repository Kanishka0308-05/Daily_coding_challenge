//woth inbuilt function

//class Solution {
//    public int findOccurence(String haystack, String needle) {
//        return haystack.indexOf(needle);
//    }
//}
class Solution {
    public int findOccurence(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            int j;

            for (j = 0; j < m; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }

            if (j == m) {
                return i;
            }
        }

        return -1;
    }
}