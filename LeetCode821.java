/**
 * 给定一个字符串 S 和一个字符 C。
 * 返回一个代表字符串 S 中每个字符到字符串 S 中的字符 C 的最短距离的数组。
 * 示例 1:
 * 输入: S = "loveleetcode", C = 'e'
 * 输出: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 * 说明:
 * 字符串 S 的长度范围为 [1, 10000]。
 * C 是一个单字符，且保证是字符串 S 里的字符。
 * S 和 C 中的所有字母均为小写字母。
 */
public class LeetCode821 {
    public static void main(String[] args) {
        String str = "loveleetcode";
        char ch = 'e';
        int[] nums = shortestToChar(str, ch);
        for(int i : nums){
            System.out.print(i + "、");
        }
    }
    public static int[] shortestToChar(String S, char C) {
        char[] chs = S.toCharArray();
        int count = 0;
        for(int i=0; i<chs.length; i++){
            if(chs[i] == C){
                count++;
            }
        }
        int[] num1 = new int[count];
        for(int i=0,j=0; i<chs.length; i++){
            if(chs[i] == C){
                num1[j] = i;
                j++;
            }
        }
        int[] num2 = new int[chs.length];
        for(int i=0; i<chs.length; i++){
            int max = Math.abs(i-num1[0]);
            for(int j=1; j<num1.length; j++){
                int temp = Math.abs(i-num1[j]);
                if(max>temp){
                    max = temp;
                }
            }
            num2[i] = max;
        }
        return num2;
    }
}
