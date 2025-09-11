package test;

public class SnailArray {
    public static void main(String[] args) {
        /*
        1  2  3   4  [0][0]  [0][1]  [0][2]  [0][3]
        12 13 14  5  [1][0]  [1][1]  [1][2]  [1][3]
        11 16 15  6  [2][0]  [2][1]  [2][2]  [2][3]
        10  9  8  7  [3][3]  [3][2]  [3][1]  [3][3]
         */
        //left = 0; right=4; bottom = 4; top=0
        int n = 4;
        int total = n * n;
        //Math.pow(4,2)
        int left = 0;
        int top = 0;
        int bottom = n - 1;
        int right = n - 1;
        int num = 1;
        int nums[][] = new int[n][n];
        while (num <= total) {
            for (int i = left; i <= right; i++) {
                nums[top][i] = num; //[0][0] = 1 [0][1]=2 [0][2]=3 [0][3]=4
                num++;
            }
            top++; //1
            for (int i = top; i <= bottom; i++) {
                nums[i][right] = num;
                num++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                nums[bottom][i] = num;
                num++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                nums[i][left] = num;
                num++;
            }
            left++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", nums[i][j]);
            }
            System.out.println();
        }
    }
}
