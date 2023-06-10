package CQCJ;

public class Ex21 {
    public static void main(String[] args) {
        //下面是针对求和方法的调用
        int sum1 =add(1,2);
        int sum2 =add(1,2,3);
        double sum3 =add(1.2,2.3);
        // 下面的代码是打印求和的结果
        System.out.println("sum1="+sum1);
        System.out.println("sum2="+sum2);
        System.out.println("sum3="+sum3);

    }

    private static int add(double v, double v1) {
        return (int) (v + v1);
    }

    private static int add(int i, int i1, int i2) {
        return i +i1+i2;
    }

    private static int add(int i, int i1) {
        return i +i1;

    }
}
