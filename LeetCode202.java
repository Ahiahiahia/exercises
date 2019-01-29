/**
 * 编写一个算法来判断一个数是不是“快乐数”。
 * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
 * 示例: 输入: 19, 输出: true
 * 解释:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */
public class LeetCode202 {
    public static void main(String[] args){
        int n = 19;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n){
        int sum = sum(n);
        if(sum == 1){
            return true;
        }else if(sum == 89){
            return false;
        }
        return isHappy(sum);
    }
    private static int sum(int num){
        int sum = 0;
        int ret = 0;
        while(num>=10){
            ret = num%10;
            num = num/10;
            sum = sum+ret*ret;
        }
        sum = sum+num*num;
        return sum;
    }
}
