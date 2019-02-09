/**
 * 统计所有小于非负整数 n 的质数的数量。
 * 示例: 输入: 10, 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 */
public class LeetCode204 {
    public static void main(String[] args){
        int n = 49979;
        System.out.println(countPrimes(n));
    }
    public static int countPrimes(int n) {
        int count = 0;
        for(int i=1; i<n; i++){
            if(isPrimeNumber(i)){
                count++;
            }
        }
        return count;
    }
    public static boolean isPrimeNumber(int n){
        if(n == 1){
            return false;
        }
        for(int i=2; i<n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
