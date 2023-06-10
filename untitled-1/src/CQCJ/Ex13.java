package CQCJ;

public class Ex13 {
    /*do{
    执行语句
    ....
    }while (循环语句);
    * */
    public static void main(String[] args) {
        int x=1;
        do{
            System.out.println("x="+x); //打印x的值
            x++;   //将x的值自增
        }while(x<=4);  //循环条件
    }
}
