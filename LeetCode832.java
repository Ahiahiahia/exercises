/**
 * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。
 * 例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
 * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。
 * 例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
 * 示例 1:
 * 输入: [[1,1,0],[1,0,1],[0,0,0]]
 * 输出: [[1,0,0],[0,1,0],[1,1,1]]
 * 解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
 *      然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
 * 示例 2:
 * 输入: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * 输出: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * 解释: 首先翻转每一行: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]；
 *      然后反转图片: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * 说明:
 *
 *     1 <= A.length = A[0].length <= 20
 *     0 <= A[i][j] <= 1
 */
public class LeetCode832 {
    public static void main(String[] args){
        int[][] data = new int[][]{{1,1,0},{1,0,1},{0,0,0}};
        int[][] result = flipAndInvertImage(data);
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] flipAndInvertImage(int[][] A) {
        //翻转图像
        for(int i = 0; i < A.length; i++){
            //每一行元素的个数
            int len = A[i].length;
            int left = 0;
            int right = len-1;
            while(right > left){
                int tmp = A[i][left];
                A[i][left] = A[i][right];
                A[i][right] = tmp;
                left++;
                right--;
            }
        }
        //反转图像
        for(int m = 0; m < A.length; m++){
            for(int n = 0; n < A[m].length; n++){
                if(A[m][n] == 1){
                    A[m][n] = 0;
                }else if(A[m][n] == 0){
                    A[m][n] = 1;
                }
            }
        }
        return A;
    }
}
