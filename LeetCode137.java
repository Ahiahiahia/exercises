/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现了三次。
 * 找出那个只出现了一次的元素。
 * 说明：你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * 示例 1: 输入: [2,2,3,2], 输出: 3
 * 示例 2: 输入: [0,1,0,1,0,1,99], 输出: 99
 */
public class LeetCode137 {
    public static void main(String[] args){
        int[] nums = new int[]{0,1,0,1,0,1,99};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int i=0; i<nums.length; i++){
            int j = 0;
            for(j=0; j<nums.length; j++){
                if(nums[i] == nums[j] && i != j){
                    break;
                }
            }
            if(j >= nums.length){
                result = nums[i];
            }
        }
        return result;
    }
}
