import java.util.Scanner;

/**
 * Created by hunter on 2019/3/9
 */
public class DayTwo3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNextLine()){
            int n = in.nextInt();
            System.out.println(addSum(n));
        }
    }
    public static int addSum(int n){
        if(n <= 0){
            return -1;
        }
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += number(i);
        }
        return sum;
    }
    public static int number(int n){
        if(n == 1){
            return 2;
        }
        return 3+number(n-1);
    }
}
