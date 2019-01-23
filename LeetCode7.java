/**
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 *  示例: 输入: 123, 输出: 321
 *  注意:
 *  假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。
 *  根据这个假设，如果反转后的整数溢出，则返回 0
 */
public class LeetCode7 {
    public static void main(String[] args){
        int n = 123;
        System.out.println(reverse1(n));
    }
    public static int reverse1(int x) {
        int i = 0;
        while(x != 0){
            int tmp = i*10 + x%10;
            if(tmp/10 != i){
                return 0;
            }
            i = tmp;
            x = x / 10;
        }
        return i;
    }
}
