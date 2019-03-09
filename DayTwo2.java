import java.util.Scanner;

/**
 * Created by hunter on 2019/3/9
 */
public class DayTwo2 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        if(n.hasNextLine()){
            String str = n.nextLine();
            System.out.println(trans(str, str.length()));
        }
    }
    public static String trans(String s, int n) {
        String[] str = s.split(" ");
        int i = 0;
        int j = str.length-1;
        while(i < j){
            String temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        char[] chs = new char[n];
        int m = 0;
        i = 0;
        while(m < chs.length){
            while(i<str.length){
                char[] ch = str[i].toCharArray();
                for(int k=0; k<ch.length; k++){
                    if(ch[k]>='a' && ch[k]<='z'){
                        ch[k] = (char)(ch[k]-32);
                    } else if(ch[k]>='A' && ch[k]<='Z'){
                        ch[k] = (char)(ch[k]+32);
                    }
                    chs[m] = ch[k];
                    m++;
                }
                if(m < chs.length){
                    chs[m] = ' ';
                    m++;
                }
                i++;
            }
        }
        return new String(chs);
    }
}
