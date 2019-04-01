/**
 * 给定一个英文字母组成的数组和一个字符串，判断数组中字符是否为字符串子串
 * eg：
 * 输入：
 *  {"a","b","c","d"},4,"abc"
 *  返回[true,true,true,false]
 */

public class Day7_2 {
    public static void main(String[] args) {
        String[] s = new String[]{"a","b","c","f"};
        boolean[] data = chkSubStr(s, 4, "abc");
    }

    public static boolean[] chkSubStr(String[] p, int n, String s){
        boolean[] res = new boolean[p.length];
        int j=0;
        for(int i=0; i<n; i++){
            if(s.contains(p[i])){
                res[j] = true;
            }else {
                res[j] = false;
            }
            j++;
        }
        return res;
    }
}