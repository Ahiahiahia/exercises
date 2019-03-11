import java.util.Scanner;

/**
 * Created by hunter on 2019/3/11
 */
public class Day4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if(in.hasNextLine()){
            String str = in.next();
            char ch = in.next().charAt(0);
            System.out.println(findNumber(str, ch));
        }
    }
    public static int findNumber(String str, char ch){
        int temp = 0;
        char[] chs = str.toCharArray();
        for(int i=0; i<chs.length; i++){
            if(chs[i] == ch || chs[i]-32 == ch || chs[i]+32 == ch){
                temp++;
            }
        }
        return temp;
    }
}
