/*Описать процедуру Smooth(A,N), заменяющую каждый элемент вещественного массива A
  размера N на его среднее арифметическое со своими соседями ("сглаживание массива").
  Массив A — входной и выходной параметр, N — входной параметр. С помощью этой
  процедуры выполнить пятикратное сглаживание данного массива A размера N, выводя на
  экран результаты каждого сглаживания.*/

        package zadachnic_1;

import java.util.Random;
import java.util.Scanner;

public class Z_78 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Размер массива: ");
        int n = in.nextInt();
        double [] array = new double[n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            array[i]=Math.ceil((rnd.nextDouble()*30)*100)/100;
        }
        array=smooth(array,n);
    }
    public static double[] smooth(double[]arr,int n){
        show(arr,n);
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < n-1; j++) {
                arr[j]=Math.ceil(((arr[j-1]+arr[j]+arr[j+1])/3)*100)/100;
            }
           show(arr, n);
        }
        return arr;
    }
    public static void show(double[]arr,int n){
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j]+"  ");
        }
        System.out.println();
    }

}
