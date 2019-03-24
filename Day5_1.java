
/**
 * 富翁换钱
 */
public class Day5_1 {
    public static void main(String[] args) {
        int day = 30;
        swapMoney(day);
    }
    public static void swapMoney(int day){
        int rich = 0;
        int poor = 0;
        for(int i=1; i<=30; i++){
            rich += 10;
            int temp = (int)Math.pow(2, i-1);
            poor += temp;
        }
        System.out.println("陌生人交出"+rich+"万元");
        System.out.println("富翁交出"+poor+"分");
    }
}
