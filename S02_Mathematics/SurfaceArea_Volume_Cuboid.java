/*
Given length l, width b and height h of a cuboid. Your task is to return an array containing the total surface area and volume of the cuboid.
*/

package S02_Mathematics;

public class SurfaceArea_Volume_Cuboid {
    public int[] find(int l, int b, int h) {
        // code here
        int surfaceArea = 2 * (l * b + b * h + h * l);
        int volume = l * b * h;
        return new int[]{surfaceArea, volume};
    }
}
