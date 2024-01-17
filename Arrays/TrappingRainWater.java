package Arrays;

public class TrappingRainWater {

    public static int TrappedRainWater(int height[]) {

        int n = height.length;
        // * Calculate Left Max Boundary - auxiliary array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // * Calculate Right Max Boundary - auxiliary array
        int rightMax[] = new int[height.length];
        rightMax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // ^ loop
        int trappedWater = 0;
        for (int i = 0; i < height.length; i++) {
            // ^ waterLevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // ! trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("Trapped rainwater: " + TrappedRainWater(height));
    }

}
