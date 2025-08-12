package ProblemOfTheDay;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyStore {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        // code here
        Arrays.sort(prices); // Sort the prices
        int n = prices.length;

        int minCost = 0;
        int maxCost = 0;

        // Minimum cost: Buy cheapest first
        int buy = 0;
        int free = n - 1;
        while (buy <= free) {
            minCost += prices[buy];
            buy++;
            free -= k;
        }

        // Maximum cost: Buy most expensive first
        buy = n - 1;
        free = 0;
        while (free <= buy) {
            maxCost += prices[buy];
            buy--;
            free += k;
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(minCost);
        result.add(maxCost);

        return result;
    }
}
