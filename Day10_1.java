/**
 * 按照对角线方向打印二维数组
 * eg：1  2  3  4
 *    5  6  7  8
 *    9  10 11 12
 *    13 14 15 16
 * 输出结果：4 3 8 2 7 12 1 6 11 16 5 10 15 9 14 13
 */
public class Day10_1 {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n = 4;
        int[] result = arrayPrint(nums, n);
        for(int i : result){
            System.out.print(i + "、");
        }
    }
    public static int[] arrayPrint(int[][] arr, int n) {
        int[] result = new int[n*n];
        int a = n-1;    // 控制整个二维数组的列走向
        int b = 0;  // 控制整个二维数组的行走向
        int j = 0;  // 控制内部循环的行
        int k = 0;  // 控制内部循环的列
        int i = 0;  // 结果下标
        while(a>=0 && b<n){
            for(j=b,k=a; j<n||k<n; j++,k++){
                if(j<n && k<n){
                    result[i] = arr[j][k];
                    i++;
                }
            }
            if(a != 0){
                a--;
            }else{
                b++;
            }
        }
        return result;
    }
}
