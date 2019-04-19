import java.util.Scanner;

/**
 * Created by hunter on 2019/4/19
 */
public class Day10_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            int num = in.nextInt();
            System.out.println(numToString(num));
        }
    }
    public static String numToString(int num){
        String str = "";
        int n = num;
        int count = 0;
        while(n>9){
            if(n%10 == 0){
                count++;
                n = n/10;
            }
            int a = (int)Math.pow(10,count);
        }
        return str;
    }
}
