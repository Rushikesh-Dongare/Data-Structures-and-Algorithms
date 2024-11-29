import java.util.Arrays;

public class BinarySearch2DSorted {
    public static boolean searchInStrictlySortedMatrix(int[][] matrix, int target) {
        int start = 0, end = matrix.length * matrix[0].length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int row = mid / matrix[0].length;
            int col = mid % matrix[0].length;
            int midElement = matrix[row][col];

            if (midElement == target) return true;
            if (midElement < target) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5},
                {7, 9, 11},
                {13, 15, 17}
        };
        System.out.println(searchInStrictlySortedMatrix(matrix, 9)); // Output: true
    }
    }

