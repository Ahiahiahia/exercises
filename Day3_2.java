import java.util.Scanner;

/**
 * Created by hunter on 2019/3/10
 */
public class Day3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if(in.hasNextLine()){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            finCandy(a, b, c, d);
        }
    }
    public static void finCandy(int a, int b, int c, int d){
        int A = (a+c)/2;
        int B = (b+d)/2;
        int C = (d-b)/2;
        if((A-(a+c)/2) != 0){
            System.out.println("No");
            return;
        }
        if((B-(b+d)/2) != 0 || (B-(c-a)/2) != 0){
            System.out.println("No");
            return;
        }
        if((C-(d-b)/2) != 0){
            System.out.println("No");
            return;
        }
        System.out.println(A+" "+B+" "+C);
        return;
    }
}
