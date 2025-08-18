package ProblemOfTheDay;

import java.util.Arrays;

public class FindHIndex {
    public int hIndex(int[] citations) {
        // code here
        Arrays.sort(citations);
        int n = citations.length;
        int h = 0;

        for (int i = 0; i < n; i++) {
            int papersWithAtLeastCitations = n - i;
            if (citations[i] >= papersWithAtLeastCitations) {
                h = papersWithAtLeastCitations;
                break;
            }
        }

        return h;
    }
}
