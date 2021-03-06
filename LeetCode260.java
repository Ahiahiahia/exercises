/**
 * 给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。
 * 找出只出现一次的那两个元素。
 * 示例 : 输入: [1,2,1,3,2,5] ,输出: [3,5]
 * 注意：
 * 结果输出的顺序并不重要，对于上面的例子， [5, 3] 也是正确答案。
 * 你的算法应该具有线性时间复杂度。你能否仅使用常数空间复杂度来实现？
 */
public class LeetCode260 {
    public static void main(String[] args){
        int[] nums = new int[]{1,2,1,3,2,5};
        int[] result = singleNumber(nums);
        for(int i : result){
            System.out.print(i + " ");
        }
    }
    public static int[] singleNumber(int[] nums) {
        int[] result = new int[2];
        int k = 0;
        for(int i=0; i<nums.length; i++){
            int j = 0;
            for(j=0; j<nums.length; j++){
                if(nums[i] == nums[j] && i != j){
                    break;
                }
            }
            if(j >= nums.length){
                result[k] = nums[i];
                k++;
            }
        }
        return result;
    }
}
