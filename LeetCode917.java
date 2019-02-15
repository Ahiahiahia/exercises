/**
 * 给定一个字符串 S，返回 “反转后的” 字符串，
 * 其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
 * 示例 1：输入："ab-cd"      输出："dc-ba"
 * 示例 2：输入："a-bC-dEf-ghIj"   输出："j-Ih-gfE-dCba"
 * 示例 3：输入："Test1ng-Leet=code-Q!"       输出："Qedo1ct-eeLg=ntse-T!"
 * 提示：
 * S.length <= 100
 * 33 <= S[i].ASCIIcode <= 122
 * S 中不包含 \ or "
 */
public class LeetCode917 {
    public static void main(String[] args){
        String s = "Test1ng-Leet=code-Q!";
        System.out.println(reverseOnlyLetters(s));
    }
    public static String reverseOnlyLetters(String S) {
        char[] chs = S.toCharArray();
        int i = 0;
        int j = chs.length-1;
        while(i<j){
            while(i<j && !isChar(chs[i])){
                i++;
            }
            while(i<j && !isChar(chs[j])){
                j--;
            }
            if(i<j){
                char ch = chs[i];
                chs[i] = chs[j];
                chs[j] = ch;
            }
            i++;
            j--;
        }
        return new String(chs);
    }

    // 判断一个字符是不是字母
    public static boolean isChar(char ch){
        if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
            return true;
        }
        return false;
    }
}
