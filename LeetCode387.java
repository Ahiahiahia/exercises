/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * 案例:s = "leetcode"，返回 0.
 *     s = "loveleetcode"，返回 2.
 */
public class LeetCode387 {
    public static void main(String[] args){
        String str = "loveleetcode";
        System.out.println(firstUniqChar(str));
    }
    public static int firstUniqChar(String s) {
        if(s ==null){
            return -1;
        }
        char[] data = s.toCharArray();
        for(int i=0; i<s.length(); i++) {
            int j = i+1;
            for( ; j<s.length(); j++){
                if(data[i] == data[j]){
                    break;
                }
            }
            if(j>=s.length()){
                return i;
            }
        }
        return -1;
    }
}
