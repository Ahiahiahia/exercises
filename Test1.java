/**
 让一个字符串首字母大写
 */
public class Test1 {
    public static void main(String[] args){
        String str = "hello";
        System.out.println(firstCase(str));
    }
    public static String firstCase(String str){
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
}
