/**
 * 如果数组是单调递增或单调递减的，那么它是单调的。
 * 如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。
 * 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。
 * 当给定的数组 A 是单调数组时返回 true，否则返回 false。
 * 示例 1：
 * 输入：[1,2,2,3]
 * 输出：true
 * 示例 2：
 * 输入：[6,5,4,4]
 * 输出：true
 * 示例 3：
 * 输入：[1,3,2]
 * 输出：false
 * 示例 4：
 * 输入：[1,2,4,5]
 * 输出：true
 * 示例 5：
 * 输入：[1,1,1]
 * 输出：true
 *
 * 提示：
 * 1 <= A.length <= 50000
 * -100000 <= A[i] <= 100000
 */
public class LeetCode896 {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,2,3};
        System.out.println(isMonotonic(arr));
    }
    public static boolean isMonotonic(int[] A) {
        return increaseing(A) || decreaseing(A);
    }
    // 判断递增
    public static boolean increaseing(int[] A){
        for(int i=0; i<A.length-1; i++){
            if(A[i] > A[i+1]){
                return false;
            }
        }
        return true;
    }
    // 判断递减
    public static boolean decreaseing(int[] A){
        for(int i=0; i<A.length-1; i++){
            if(A[i] < A[i+1]){
                return false;
            }
        }
        return true;
    }
}
