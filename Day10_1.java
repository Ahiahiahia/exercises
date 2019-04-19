/**
 * Created by hunter on 2019/4/19
 */
public class Day10_1 {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n = 4;
        int[] result = arrayPrint(nums, n);
        for(int i : result){
            System.out.println(i + "、");
        }
    }
    public static int[] arrayPrint(int[][] arr, int n) {
        int[] result = new int[n*n];
        int k = n-1;    // 控制列
        int j = 0;  // 控制行
        int i = 0;  // 结果下标
        while(k>=0 || j<n){
        }
        return result;
    }
}
