package CQCJ;

import com.sun.jdi.PathSearchingVirtualMachine;
public class Ex19 {
    public static void main(String[] args) {
        printRectangle(3, 5);
        printRectangle(2, 4);
        printRectangle(6, 10);
    }
    public static void   printRectangle(int width,int height) {
        for (int i = 0; i < height; i++) {

            for (int j = 0; j < width; j++)  {
                System.out.print("*");
            }
            System.out.print("\n");
            }
        System.out.print("\n ");
        }
    }


