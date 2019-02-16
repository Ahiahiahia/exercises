/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * 示例 1:
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 * 输入: "race a car"
 * 输出: false
 */
public class LeetCode125 {
    public static void main(String[] args){
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        char[] chs = s.toCharArray();
        int i = 0;
        int j = chs.length-1;
        while(i<j){
            while(i<j && !isChar(chs[i])){
                i++;
            }
            while(i<j && !isChar(chs[j])){
                j--;
            }
            if((i<=j) && (chs[i]==chs[j] ||
                    (chs[i]==chs[j]-32 && chs[i]>=65&&chs[i]<=90) ||
                    (chs[i]==chs[j]+32 && chs[i]>=97&&chs[i]<=122))){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }

    // 判断字符是否是字母或数字
    public static boolean isChar(char ch){
        if((ch>=48&&ch<=57) || (ch>=65&&ch<=90) || (ch>=97&&ch<=122)){
            return true;
        }
        return false;
    }
}
