/**
 判断一个字符串是否由数字组成
 */
public class Test2 {
    public static void main(String[] args){
        System.out.println(isNumber("2wwww22"));
    }
    public static boolean isNumber(String str){
        char[] data = str.toCharArray();
        for(int i=0; i<data.length; i++){
            if(data[i]<'0' || data[i]>'9'){
                return false;
            }
        }
        return true;
    }
}
