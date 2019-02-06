/*
 * 猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾，又多吃了一个
 * 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个
 * 到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(Number(10, 1));
    }

    /**
     * 求原来的桃子个数
     * @param day 天数
     * @param remain 第day天的剩余桃子数
     * @return 返回原来的桃子数
     */
    public static int Number(int day,int remain){
        if(day == 1){
            return remain;
        }else{
            int ret = (remain+1)*2;
            return Number(day-1,ret);
        }
    }
}
