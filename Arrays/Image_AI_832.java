package Arrays;

public class Image_AI_832 {
    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            // Use two pointers to flip and invert in a single pass
            while (left <= right) {
                // If the left and right pointers are at the same position,
                // just invert the single element.
                if (left == right) {
                    image[i][left] = 1 - image[i][left];
                } else {
                    // Swap and invert elements at the left and right ends
                    // You can use a temporary variable for the swap
                    int temp = image[i][left];
                    image[i][left] = 1 - image[i][right];
                    image[i][right] = 1 - temp;
                }
                left++;
                right--;
            }
        }
        return image;
    }
}
