/**
 * 如果正整数可以被 A 或 B 整除，那么它是神奇的。
 * 返回第 N 个神奇数字。由于答案可能非常大，返回它模 10^9 + 7 的结果。
 * 示例 1：输入：N = 1, A = 2, B = 3, 输出：2
 * 示例 2：输入：N = 4, A = 2, B = 3, 输出：6
 * 示例 3：输入：N = 5, A = 2, B = 4, 输出：10
 * 示例 4：输入：N = 3, A = 6, B = 4, 输出：8
 * 提示：
 * 1 <= N <= 10^9
 * 2 <= A <= 40000
 * 2 <= B <= 40000
 */
public class LeetCode878 {
    public static void main(String[] args){
        int N = 5;
        int A = 2;
        int B = 4;
        System.out.println(nthMagicalNumber(N, A, B));
    }
    public static int nthMagicalNumber(int N, int A, int B) {
        int count = 0;
        int i = 1;
        while(count < N){
            if(i%A == 0 || i%B == 0){
                count++;
            }
            i++;
        }
        return i-1;
    }
}
