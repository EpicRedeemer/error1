public class BubbleSoft {
    public static void main(String[] args) {
        //使用冒泡排序对一组数进行排序，使得最终结果是一个从小到大的顺序
        int[] arr = {11, 23, 45, 22, 1, 45, 25, 68, 19};

        System.out.println("排序之前：");
        printArray(arr);

        System.out.println();
        //定义一个方法实现对数组的冒泡排序
        int[] arr1 = bubbleSoft(arr);
        System.out.println("排序之后：");
        printArray(arr1);



    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            } else if (i == 0) {
                System.out.print("[" + arr[i] + ",");
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }

    //定义方法实现冒泡排序

    /**
     * 返回值类型：int[]
     * 参数列表：int[] arr
     */
    public static int[] bubbleSoft(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // 外层控制排序的次数
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
