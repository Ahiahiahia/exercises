import java.util.ArrayList;
import java.util.List;

/**
 * 找出一个字符串数组中的最长字符串
 */
public class DayOne2 {
    public static void main(String[] args){
        String[] strs = new String[]{"abc", "acbd","add","agon"};
        List<String> list = findStr(strs);
        System.out.println(list);
    }
    public static List<String> findStr(String[] strs){
        List<String> list = new ArrayList<>();
        int max = strs[0].length();
        for(int i=1; i<strs.length; i++){
            if(max < strs[i].length()){
                max = strs[i].length();
            }
        }
        for(int i=0; i<strs.length; i++){
            if(strs[i].length() == max){
                list.add(strs[i]);
            }
        }
        return list;
    }
}
