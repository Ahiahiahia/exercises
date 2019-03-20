import java.util.Scanner;

/**
 * 字符串按规则转换：google -> g1o2g1l1e1
 * aaabbbbbc -> a3b4c1
 */
public class Test14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextLine()){
            String str = scanner.nextLine();
            String str2 = strReduce(str);
            System.out.println(str2);
        }
    }

    /**
     * 压缩字符串
     * @param str
     * @return
     */
    public static String strTostr(String str){
        String s = "";
        int i=0;
        while(i<str.length()){
            char ch = str.charAt(i);
            int count = 0;
            int j = 0;
            for(j=i; j<str.length(); j++){
                if(ch == str.charAt(j)){
                    count++;
                }else{
                    break;
                }
            }
            s = s+ch+count;
            i = j;
        }
        return s;
    }

    /**
     * 解压缩
     * @param str
     * @return
     */
    public static String strReduce(String str){
        String s = "";
        int i=0;
        while(i<str.length()){
            char ch = str.charAt(i);
            int k = 0;
            for(k=i+1; k<str.length(); k++){
                if(str.charAt(k) >=48 && str.charAt(k) <=57){
                    ;
                }else{
                    break;
                }
            }
            int num = Integer.parseInt(str.substring(i+1, k));
            int j = 0;
            for(j=num; j>0; j--){
                s = s+ch;
            }
            i = k;
        }
        return s;
    }
}
