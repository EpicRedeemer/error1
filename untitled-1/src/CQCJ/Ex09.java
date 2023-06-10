package CQCJ;
/*if..else if else语句的语法格式
    if(判断条件1)
        {
        执行语句1
        }
            else if(判断条件2)
            {
            执行语句2
            }
            ...
            else if(判断条件n)
            {执行语句n
            }
            else
            {
            执行语句n+1
            }* */
public class Ex09 {
    public static void main(String[] args) {
        int grade = 75; //定义学生成绩
        if (grade > 80) {
            System.out.println("该学生的成绩为优秀");  //满足grade>80
        } else if (grade > 70) {
        //不满足条件grade>80,但满足条件grade>70

            System.out.println("该学生的成绩为及格");
        }else if (grade > 60) {
            System.out.println("该学生的成绩为一般");
        }else{
            System.out.println("该学生的成绩为垃圾");
        }
    }
}


