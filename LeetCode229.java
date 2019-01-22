import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个大小为 n 的数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。
 * 说明: 要求算法的时间复杂度为 O(n)，空间复杂度为 O(1)。
 * 示例 1: 输入: [3,2,3]，输出: [3]
 * 示例 2: 输入: [1,1,1,3,3,2,2,2]，输出: [1,2]
 */
public class LeetCode229 {
    public static void main(String[] args){
        int[] nums = new int[]{1,1,1,3,3,2,2,2};
        List<Integer> list = majorityElement(nums);
        System.out.println(list);
    }
    public static List<Integer> majorityElement(int[] nums) {
        if(nums == null){
            return null;
        }else{
            List<Integer> list = new ArrayList<>();
            int x = 0, y = 0, nx = 0, ny = 0;
            for(int i=0; i<nums.length; i++){
                if((nx==0 || x==nums[i]) && y!=nums[i]){
                    x = nums[i];
                    nx++;
                }else if(ny == 0 || y == nums[i]){
                    y = nums[i];
                    ny++;
                }else{
                    nx--;
                    ny--;
                }
            }
            int count_x = 0;
            int count_y = 0;
            for(int i:nums){
                if(i == x){
                    count_x++;
                }else if(i == y){
                    count_y++;
                }
            }
            if(count_x > nums.length/3){
                list.add(x);
            }
            if(count_y > nums.length/3){
                list.add(y);
            }
            return list;
        }
    }

}
