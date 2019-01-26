/**
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 * 示例 1: 输入: [3,0,1], 输出: 2
 * 示例 2: 输入: [9,6,4,2,3,5,7,0,1], 输出: 8
 * 说明:
 * 你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现?
 */
public class LeetCode268 {
    public static void main(String[] args){
        int[] nums = new int[]{9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int result = 0;
        int[] ret = new int[nums.length+1];
        for(int i=0; i<nums.length; i++){
            ret[nums[i]] = 1;
        }
        for(int i=0; i<ret.length; i++){
            if(ret[i] == 0){
                result = i;
                break;
            }
        }
        return result;
    }
}
