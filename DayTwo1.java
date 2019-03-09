import java.util.Scanner;

/**
 * Created by hunter on 2019/3/9
 */
public class DayTwo1 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        if(n.hasNextLine()){
            System.out.println(buyApple(n.nextInt()));
        }
    }
    public static int buyApple(int n){
        int m = n/8;
        for(int i=m; i>=0; i--){
            int temp = n-8*i;
            if(temp%6 == 0){
                return i + temp/6;
            }
        }
        return -1;
    }
}
