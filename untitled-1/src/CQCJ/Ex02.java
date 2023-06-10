package CQCJ;

public class Ex02 { //案例演示 数据精确丢失的情况
    public static void main(String[] args) {
        byte a; //定义byte类型的变量a
        int b=298; //定义int类型的b
        a=(byte)b;
        System.out.println("b="+b);
        System.out.println("a="+a);

    }
}
