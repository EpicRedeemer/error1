package CQCJ;
/*if...else
    if(判断条件)
    {
    执行语句1
    ...}
    else
    {
    执行语句2
    ...
    }
* */
public class Ex08 {
    public static void main(String[] args) {
     int num=19;
     if(num %2 ==0){
         //判断条件成立,num被2整除
         System.out.println("num是一个偶数");
     }
     else
     {
         System.out.println("num是一个奇数");
     }
    }
}
