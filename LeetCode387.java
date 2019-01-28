/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * 案例:s = "leetcode"，返回 0.
 *     s = "loveleetcode"，返回 2.
 */
public class LeetCode387 {
    public static void main(String[] args){
        String str = "zz";
        System.out.println(firstUniqChar(str));
    }
    public static int firstUniqChar(String s) {
        int[] nums = new int[256];
        char[] chs = s.toCharArray();
        for(int i=0; i<chs.length; i++){
            char ch = chs[i];
            nums[ch] = nums[ch] + 1;
        }
        for(int i=0; i<chs.length; i++){
            char ch = chs[i];
            if(nums[ch] == 1){
                return i;
            }
        }
        return -1;
    }
}
