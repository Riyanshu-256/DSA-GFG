/*
We have a wooden plank of length n units. Some ants are walking on the plank, each ant moves with a speed of 1 unit per second, with some moving left and others right.
When two ants moving in two different directions meet at some point, they change their directions and continue moving again. Assume changing directions does not take any additional time. When an ant reaches one end of the plank at a time t, it falls out of the plank immediately.

Given an integer n and two integer arrays left[] and right[], the positions of the ants moving to the left and the right, return the time when the last ant(s) fall out of the plank.
*/

package ProblemOfTheDay;

public class LastMomentBefore {
    public int getLastMoment(int n, int left[], int right[]) {
        // code here
         int maxTime = 0;
        
        for (int pos : left) {
            maxTime = Math.max(maxTime, pos);
        }

        for (int pos : right) {
            maxTime = Math.max(maxTime, n - pos);
        }
        return maxTime;
    }
}
