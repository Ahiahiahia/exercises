import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 * 注意：答案中不可以包含重复的四元组。
 * 示例：给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
 * 满足要求的四元组集合为：
 * [
 *   [-1,  0, 0, 1],
 *   [-2, -1, 1, 2],
 *   [-2,  0, 0, 2]
 * ]
 */
public class LeetCode18 {
    public static void main(String[] args){
        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        int n = 0;
        List<List<Integer>> list = fourSum(nums, n);
        System.out.println(list);
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    for(int n=k+1; n<nums.length; n++){
                        if(nums[i]+nums[j]+nums[k]+nums[n] == target){
                            List<Integer> li = new ArrayList<>();
                            li.add(nums[i]);
                            li.add(nums[j]);
                            li.add(nums[k]);
                            li.add(nums[n]);
                            list.add(li);
                        }
                    }
                }
            }
        }
        return list;
    }
}
