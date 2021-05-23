/*Описать рекурсивную функцию MinRec(A,N) вещественного типа, которая находит
  минимальный элемент вещественного массива A размера N, не используя оператор цикла.
  С помощью функции MinRec1 найти минимальные элементы массивов A, B, C размера
  NA, NB, NC соответственно .*/

        package zadachnic_1;

import java.util.Random;
import java.util.Scanner;

public class Z_70 {

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
        System.out.println("Min element: "+minRec(arr,n));
    }
    public static double minRec(double[] arr,int n){
       if(n==1)return arr[0];
       if(arr[0]>arr[n-1])arr[0]=arr[n-1];
       return minRec(arr, n-1);
    }
}
