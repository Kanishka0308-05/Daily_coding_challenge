import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < words.length) {
            int lineLength = words[i].length();
            int j = i + 1;

            while (j < words.length &&
                    lineLength + 1 + words[j].length() <= maxWidth) {
                lineLength += 1 + words[j].length();
                j++;
            }

            StringBuilder line = new StringBuilder();
            int numWords = j - i;
            int totalChars = 0;

            for (int k = i; k < j; k++) {
                totalChars += words[k].length();
            }

            int totalSpaces = maxWidth - totalChars;

            if (j == words.length || numWords == 1) {
                for (int k = i; k < j; k++) {
                    line.append(words[k]);

                    if (k < j - 1) {
                        line.append(" ");
                        totalSpaces--;
                    }
                }

                while (totalSpaces-- > 0) {
                    line.append(" ");
                }
            } else {
                int spacesBetween = totalSpaces / (numWords - 1);
                int extraSpaces = totalSpaces % (numWords - 1);

                for (int k = i; k < j; k++) {
                    line.append(words[k]);

                    if (k < j - 1) {
                        for (int s = 0; s < spacesBetween; s++) {
                            line.append(" ");
                        }

                        if (extraSpaces > 0) {
                            line.append(" ");
                            extraSpaces--;
                        }
                    }
                }
            }

            result.add(line.toString());
            i = j;
        }

        return result;
    }
}