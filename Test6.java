
public class Test6 {
    public static void main(String[] args) {
        System.out.println(getGYSZ(10,15));
    }
    /**
     * 求最大公约数
     * 更相减损术
     */
    public static int getGYSG(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            }
            if (a < b) {
                b -= a;
            }
        }
        return a;
    }
    /**
     * 辗转相除法
     * 取两个数中最大的数做除数，较小的数做被除数，用最大的数除较小数，
     * 如果余数为0，则较小数为这两个数的最大公约数，
     * 如果余数不为0，用较小数除上一步计算出的余数，
     * 直到余数为0，则这两个数的最大公约数为上一步的余数
     * @param a
     * @param b
     * @return
     */
    public static int getGYSZ(int a, int b) {
        int r;
        while(b != 0){
            r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}






