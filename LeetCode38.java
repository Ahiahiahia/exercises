import java.util.ArrayList;
import java.util.List;

/**
 * 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
 * 注意：整数顺序将表示为一个字符串。
 * 示例 1: 输入: 1, 输出: "1"
 * 示例 2: 输入: 4, 输出: "1211"
 */
public class LeetCode38 {
    public static void main(String[] args){
        int n = 8;
        System.out.println(countAndSay(n));
    }
    public static String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        List<String> list = new ArrayList<>();
        list.add("1");
        int i = 2;
        while(i<=n){
            String s = list.get(i-1-1);
            String re = "";
            char[] chs = s.toCharArray();
            int j=0;
            while(j<chs.length){
                int count = 0;
                int k;
                for(k=j; k<chs.length; k++){
                    if(chs[j] == chs[k]){
                        count++;
                    }else{
                        break;
                    }
                }
                re = re+count+chs[j];
                j = k;
            }
            list.add(re);
            i++;
        }
        return list.get(n-1);
    }
}
