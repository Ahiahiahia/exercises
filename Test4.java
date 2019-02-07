/**
 * 10个人围成一圈，顺序排列，每三个报数，报道三的淘汰，求最后留下的人的原始序号
 */
public class Test4 {
    public static void main(String[] args){
        findPerson();
    }
    public static void findPerson(){
        int[] data = new int[10];
        for(int i=0; i<10; i++){
            data[i] = i+1;
        }
        int flag = 0;   //报数
        int person = 0; //淘汰的人数
        int i = 0;  //数组下标
        while(person<9){
            if(data[i]!=0){
                flag++;
            }
            if(flag == 3){
                data[i] = 0;
                person++;
                flag = 0;
            }
            i++;
            if(i == 10){
                i = 0;
            }
        }
        for(int j=0; j<data.length; j++){
            if(data[j]!=0){
                System.out.println("第"+ (j+1) +"个人");
            }
        }
    }
}
