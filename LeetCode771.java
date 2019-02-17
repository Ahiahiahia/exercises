/**
 *  给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。
 *  S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 * 示例 1: 输入: J = "aA", S = "aAAbbbb", 输出: 3
 * 示例 2: 输入: J = "z", S = "ZZ", 输出: 0
 * 注意:
 * S 和 J 最多含有50个字母。
 *  J 中的字符不重复。
 */
public class LeetCode771 {
    public static void main(String[] args){
        String str1 = "z";
        String str2 = "ZZ";
        System.out.println(numJewelsInStones(str1, str2));
    }
    public static int numJewelsInStones(String J, String S) {
        int[] numJ = new int[265];
        int[] numS = new int[265];
        char[] chJ = J.toCharArray();
        char[] chS = S.toCharArray();
        int count = 0;
        for(int i=0; i<chJ.length; i++){
            char ch = chJ[i];
            numJ[ch]++;
        }
        for(int i=0; i<chS.length; i++){
            char ch = chS[i];
            numS[ch]++;
        }
        for(int i=0; i<numJ.length; i++){
            if(numJ[i] == 1){
                count = count + numS[i];
            }
        }
        return count;
    }
}
