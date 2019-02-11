//交换两个数的值
class Number{
    private int num;
    public Number(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
    public void swap(Number b){
        int ret = b.num;
        b.num = this.num;
        this.num = ret;
    }
}
public class Test5 {
    public static void main(String[] args){
        Number a = new Number(1);
        Number b = new Number(2);
        a.swap(b);
        System.out.println(a.getNum());
        System.out.println(b.getNum());
    }
}
