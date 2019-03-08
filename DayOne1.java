import java.util.ArrayList;
import java.util.List;

/**
 * 括号匹配问题
 */
public class DayOne1 {
    public static void main(String[] args){
        String str = "(()())aa(b)())";
        System.out.println(chkParenthesis(str, str.length()));
    }

    public static boolean chkParenthesis(String A, int n) {
        if(n <= 0 || A == ""){
            return false;
        }
        List<Object> list = new ArrayList<>();
        char[] chs = A.toCharArray();
        int i = 0;
        while (i<chs.length){
            if(chs[i]=='(' || chs[i]=='[' || chs[i]=='{'){
                list.add(chs[i]);
                i++;
            } else if(chs[i]==')' || chs[i]==']' || chs[i]=='}'){
                if (list.size()==0){
                    return false;
                }
                char ch = (char)list.get(list.size()-1);
                list.remove(list.size()-1);
                if((chs[i]==')' && ch=='(') || (chs[i]==']' && ch=='[')
                        || (chs[i]=='}' && ch=='{')){
                    i++;
                }else{
                    return false;
                }
            }else{
                i++;
            }
        }
        if(list.size() == 0 && i>=A.length()){
            return true;
        }
        return false;
    }
}
