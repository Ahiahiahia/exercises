import java.util.Scanner;

/**
 * 将整数数字转换为英文单词
 * （大体思路正确，但是大数我也不会读）
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
        String[] strs1 = new String[]{"zero","one","two","three","four","five","six","seven",
        "eight","nine"};
        String[] strs2 = new String[]{"eleven","twelve","thirteen","fourteen","fifteen",
        "sixteen","seventeen","eighteen","nineteen"};
        String[] strs3 = new String[]{"ten","twenty","thirty","forty","fifty","sixty",
        "seventy","eighty","ninety"};
        String[] strs4 = new String[]{"hundred","thousand","ten thousand","hundred thousand",
        "million","ten million","hundred million","billion"};
        if(num<=9){
            return strs1[num];
        }else if(num>10 && num<20){
            return strs2[num%10-1];
        }
        String str = "";
        int m = num;
        while(m>0){
            int n = m;
            int count = 0;
            while(n>9){
                count++;
                n = n/10;
            }
            if(count == 0){
                str = str+strs1[n];
            }
            else if(count == 1){
                str = str+strs3[n-1]+" ";
            }else{
                str = str+strs1[n]+" "+strs4[count-2]+" and ";
            }
            int ret = (int)Math.pow(10, count);
            m = m%ret;
        }
        return str;
    }

}
