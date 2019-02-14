/**
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 * 示例 1:
 * 输入: "hello"
 * 输出: "holle"
 * 示例 2:
 * 输入: "leetcode"
 * 输出: "leotcede"
 * 说明:
 * 元音字母不包含字母"y"。
 */
public class LeetCode345 {
    public static void main(String[] args){
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s) {
        char[] chs = s.toCharArray();
        int i = 0;
        int j = chs.length-1;
        while(i < j){
            while(i<j && !isChar(chs[i])){
                i++;
            }
            while(i<j && !isChar(chs[j])){
                j--;
            }
            if(i < j){
                char ch = chs[i];
                chs[i] = chs[j];
                chs[j] = ch;
            }
            i++;
            j--;
        }
        return new String(chs);
    }

    // 判断一个字符是不是元音字符
    public static boolean isChar(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }
}
