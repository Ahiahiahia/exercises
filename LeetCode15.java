import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，
 * 使得 a + b + c = 0 ,找出所有满足条件且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 */
public class LeetCode15 {
    public static void main(String[] args){
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> list = threeSum(nums);
        System.out.println(list);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> li = new ArrayList<>();
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(nums[k]);
                        int m = list.size();
                        while(m > 0){
                            List<Integer> ret = list.get(m);
                            if(!equals(ret,li)){
                                list.add(li);
                            }
                            m--;
                        }
                    }
                }
            }
        }
        return list;
    }
    public static boolean equals(List<Integer>list1, List<Integer> list2){
        int i = list1.size();
        while(i>0){
            int a = list1.get(i);
            int j = list2.size();
            int count = 0;
            while(j>0){
                int b = list2.get(j);
                if(a != b){
                    count++;
                }
                if(count == 3){
                    break;
                }
            }

        }
        return true;
    }
}
