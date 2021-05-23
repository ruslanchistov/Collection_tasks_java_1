/*Описать функцию min(X) для определения минимального элемента линейного массива X,
  введя вспомогательную рекурсивную функцию minl(k), находящую минимум среди
  последних элементов массива X, начиная с k-го.*/

        package zadachnic_1;

import java.util.Random;
import java.util.Scanner;

public class Z_74 {
    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double [] arr = new double[n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            arr[i]=Math.ceil((rnd.nextDouble()*20)*100)/100;
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
       // System.out.println("Min element: "+min(arr));
    }
   /* public static double min(double[]arr){
        int n = arr.length;
        System.out.print("С какого элемента начать поиск минимума: ");
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        return 0;
    }
    public static double minl(int k){
    return 0;
    }*/
}
