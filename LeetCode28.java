/**
 * 实现 strStr() 函数。
 * 给定一个 haystack 字符串和一个 needle 字符串，
 * 在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回-1。
 * 示例 1:
 * 输入: haystack = "hello", needle = "ll" , 输出: 2
 * 示例 2:
 * 输入: haystack = "aaaaa", needle = "bba" , 输出: -1
 * 说明:
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。
 * 这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 */
public class LeetCode28 {
    public static void main(String[] args){
        String str1 = "hello";
        String str2 = "ll";
        System.out.println(strStr(str1, str2));
    }
    public static int strStr(String haystack, String needle) {
//        if(haystack.equals("") && needle.equals("")){
//            return 0;
//        }
//        if(needle.length() > haystack.length()){
//            return -1;
//        }
//        char[] ch1 = haystack.toCharArray();
//        char[] ch2 = needle.toCharArray();
//        int i = 0;
//        while(i<ch1.length){
//            int j = 0;
//            int k = i;
//            while(j<ch2.length && k<ch1.length){
//                if(ch1[k] != ch2[j]){
//                    break;
//                }
//                j++;
//                k++;
//            }
//            if(j>=ch2.length && k <= ch1.length){
//                return i;
//            }else{
//                i++;
//            }
//        }
//        return -1;

        return haystack.indexOf(needle);
    }
}
