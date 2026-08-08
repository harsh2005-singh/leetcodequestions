import java.util.*;

class Solution {
    public int[] validSequence(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();

        int[] ans = new int[m];

        // last[j] = position in word1 used while
        // matching word2[j], word2[j+1], ...
        int[] last = new int[m];
        Arrays.fill(last, -1);

        // Build the suffix information from right to left
        int i = n - 1;
        int j = m - 1;

        while (i >= 0 && j >= 0) {

            if (word1.charAt(i) == word2.charAt(j)) {
                last[j] = i;
                j--;
            }

            i--;
        }

        // We can use at most ONE mismatch
        boolean canSkip = true;

        j = 0;

        // Greedily choose the smallest possible indices
        for (i = 0; i < n; i++) {

            if (j == m) {
                break;
            }

            // Case 1: exact match
            if (word1.charAt(i) == word2.charAt(j)) {

                ans[j] = i;
                j++;

            }

            // Case 2: use our one allowed modification
            else if (
                canSkip &&
                (j == m - 1 || i < last[j + 1])
            ) {

                canSkip = false;

                ans[j] = i;
                j++;
            }
        }

        // Could not construct complete sequence
        if (j != m) {
            return new int[0];
        }

        return ans;
    }
}