
/**
 * Created by hunter on 2019/3/24
 */
public class Day5_2 {
    public static void main(String[] args) {
        String[] p = new String[]{"a", "b", "c"};
        int n = p.length;
        String s = "abd";
        boolean[] re = chkSubStr(p, n, s);
        for(boolean i : re){
            System.out.print(i + "、");
        }
    }
    public static boolean[] chkSubStr(String[] p, int n, String s){
        boolean[] result = new boolean[n];
        for(int i=0; i<n; i++){
            if(s.contains(p[i])){
                result[i] = true;
            }else{
                result[i] = false;
            }
        }
        return result;
    }
}
