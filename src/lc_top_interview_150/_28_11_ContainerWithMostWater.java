package lc_top_interview_150;

public class _28_11_ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int heightLeft = height[left];
            int heightRight = height[right];
            int currentArea = Math.min(heightLeft, heightRight) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxAr = maxArea(height);
        System.out.println(maxAr);
    }
}
