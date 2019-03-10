import java.util.Scanner;

/**
 * Created by hunter on 2019/3/10
 */
public class Day3_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(findNumber(str));
    }
    public static String findNumber(String str){
        if(str == ""){
            return null;
        }
        String[] strs = str.split(" ");
        for(int i=0; i<strs.length; i++){
            int temp = 0;
            for(int j=0; j<strs.length; j++){
                if(strs[i].equals(strs[j])){
                    temp++;
                }
            }
            if(temp>=strs.length/2){
                return strs[i];
            }
        }
        return null;
    }
}
