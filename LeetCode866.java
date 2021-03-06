/**
 * 求出大于或等于 N 的最小回文素数。
 * 回顾一下，如果一个数大于 1，且其因数只有 1 和它自身，那么这个数是素数。
 * 例如，2，3，5，7，11 以及 13 是素数。
 * 回顾一下，如果一个数从左往右读与从右往左读是一样的，那么这个数是回文数。
 * 例如，12321 是回文数。
 * 示例 1：输入：6, 输出：7
 * 示例 2：输入：8, 输出：11
 * 示例 3：输入：13, 输出：101
 * 提示：
 * 1 <= N <= 10^8
 * 答案肯定存在，且小于 2 * 10^8。
 */
public class LeetCode866 {
    public static void main(String[] args){
        int n = 3503054;
        System.out.println(primePalindrome(n));
    }
    public static int primePalindrome(int N) {
        int i = N;
        while(true){
            if(isSu(i) && isHuiWen(i)){
                return i;
            }
            i++;
        }
    }

    // 判断一个数是否是素数
    public static boolean isSu(int n){
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
    // 判断一个数是否是回文数
    public static boolean isHuiWen(int n){
        String s = "" + n;
        char[] chs = s.toCharArray();
        int i = 0;
        int j = chs.length-1;
        while(i<j){
            if(chs[i] != chs[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
